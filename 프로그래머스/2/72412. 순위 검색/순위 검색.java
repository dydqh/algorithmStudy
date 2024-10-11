import java.util.*;

class Solution {
    public String[] languages = new String[]{"cpp", "java", "python"};
    public String[] occupations = new String[]{"backend", "frontend"};
    public String[] experiences = new String[]{"junior", "senior"};
    public String[] soulFoods = new String[]{"chicken", "pizza"};

    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        Map<String, Map<String, Map<String, Map<String, List<Integer>>>>> map = new HashMap<>();

        for (String language : languages) {
            map.put(language, new HashMap<>());
            for (String occupation : occupations) {
                map.get(language).put(occupation, new HashMap<>());
                for (String experience : experiences) {
                    map.get(language).get(occupation).put(experience, new HashMap<>());
                    for (String soulFood : soulFoods) {
                        map.get(language).get(occupation).get(experience).put(soulFood, new ArrayList<>());
                    }
                }
            }
        }

        for(String curInfo : info){
            String[] cur = curInfo.split(" ");
            int curScore = Integer.parseInt(cur[4]);
            map.get(cur[0]).get(cur[1]).get(cur[2]).get(cur[3]).add(curScore);
        }

        Map<String, List<Integer>> searched = new HashMap<>();

        for (int i = 0; i < query.length; i++) {
            String[] cur = query[i].split(" ");
            String language = cur[0];
            String occupation = cur[2];
            String experience = cur[4];
            String soulFood = cur[6];
            int score = Integer.parseInt(cur[7]);

            List<Integer> curList;

            if(!searched.containsKey(language + occupation + experience + soulFood)){
                curList = getListByLanguage(map, language, occupation, experience, soulFood);
                Collections.sort(curList);
                searched.put(language + occupation + experience + soulFood, curList);
            }
            else{
                curList = searched.get(language + occupation + experience + soulFood);
            }

            int low = 0;
            int high = curList.size();

            while (low < high) {
                int mid = low + (high - low)/2;
                if (score <= curList.get(mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            answer[i] = curList.size() - low;
        }

        return answer;
    }

    public List<Integer> getListByLanguage(Map<String, Map<String, Map<String, Map<String, List<Integer>>>>> map, String language, String occupation, String experience, String soulFood){
        List<Integer> curList = new ArrayList<>();
        if(language.equals("-")){
            for(String curLanguage : languages){
                curList.addAll(getListByOccupation(map, curLanguage, occupation, experience, soulFood));
            }
        }
        else{
            curList.addAll(getListByOccupation(map, language, occupation, experience, soulFood));
        }
        return curList;
    }

    public List<Integer> getListByOccupation(Map<String, Map<String, Map<String, Map<String, List<Integer>>>>> map, String language, String occupation, String experience, String soulFood){
        List<Integer> curList = new ArrayList<>();
        if(occupation.equals("-")){
            for(String curOccupation : occupations){
                curList.addAll(getListByExperience(map, language, curOccupation, experience, soulFood));
            }
        }
        else{
            curList.addAll(getListByExperience(map, language, occupation, experience, soulFood));
        }
        return curList;
    }

    public List<Integer> getListByExperience(Map<String, Map<String, Map<String, Map<String, List<Integer>>>>> map, String language, String occupation, String experience, String soulFood){
        List<Integer> curList = new ArrayList<>();
        if(experience.equals("-")){
            for(String curExperience : experiences){
                curList.addAll(getListBySoulFood(map, language, occupation, curExperience, soulFood));
            }
        }
        else{
            curList.addAll(getListBySoulFood(map, language, occupation, experience, soulFood));
        }
        return curList;
    }

    public List<Integer> getListBySoulFood(Map<String, Map<String, Map<String, Map<String, List<Integer>>>>> map, String language, String occupation, String experience, String soulFood){
        List<Integer> curList = new ArrayList<>();
        if(soulFood.equals("-")){
            for(String curSoulFood : soulFoods){
                curList.addAll(map.get(language).get(occupation).get(experience).get(curSoulFood));
            }
        }
        else{
            curList.addAll(map.get(language).get(occupation).get(experience).get(soulFood));
        }
        return curList;
    }
}