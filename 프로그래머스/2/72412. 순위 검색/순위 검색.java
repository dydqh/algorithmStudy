import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        String[] languages = new String[]{"cpp", "java", "python", "-"};
        String[] occupations = new String[]{"backend", "frontend", "-"};
        String[] experiences = new String[]{"junior", "senior", "-"};
        String[] soulFoods = new String[]{"chicken", "pizza", "-"};
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
            map.get("-").get(cur[1]).get(cur[2]).get(cur[3]).add(curScore);
            map.get("-").get("-").get(cur[2]).get(cur[3]).add(curScore);
            map.get("-").get(cur[1]).get("-").get(cur[3]).add(curScore);
            map.get("-").get(cur[1]).get(cur[2]).get("-").add(curScore);
            map.get("-").get("-").get("-").get(cur[3]).add(curScore);
            map.get("-").get("-").get(cur[2]).get("-").add(curScore);
            map.get("-").get(cur[1]).get("-").get("-").add(curScore);
            map.get("-").get("-").get("-").get("-").add(curScore);
            map.get(cur[0]).get("-").get(cur[2]).get(cur[3]).add(curScore);
            map.get(cur[0]).get("-").get("-").get(cur[3]).add(curScore);
            map.get(cur[0]).get("-").get(cur[2]).get("-").add(curScore);
            map.get(cur[0]).get("-").get("-").get("-").add(curScore);
            map.get(cur[0]).get(cur[1]).get("-").get(cur[3]).add(curScore);
            map.get(cur[0]).get(cur[1]).get("-").get("-").add(curScore);
            map.get(cur[0]).get(cur[1]).get(cur[2]).get("-").add(curScore);
        }

        for (String language : languages) {
            for (String occupation : occupations) {
                for (String experience : experiences) {
                    for (String soulFood : soulFoods) {
                        Collections.sort(map.get(language).get(occupation).get(experience).get(soulFood));
                    }
                }
            }
        }

        for (int i = 0; i < query.length; i++) {
            String[] cur = query[i].split(" ");
            String language = cur[0];
            String occupation = cur[2];
            String experience = cur[4];
            String soulFood = cur[6];
            int score = Integer.parseInt(cur[7]);

            List<Integer> curList = map.get(language).get(occupation).get(experience).get(soulFood);

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
}