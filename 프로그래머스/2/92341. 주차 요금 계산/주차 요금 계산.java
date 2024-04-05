import java.util.*;

class Solution {
        public Integer[] solution(int[] fees, String[] records) {
            Map<String, Integer> startTime = new HashMap<>();
            Map<String, Integer> usingTime = new HashMap<>();

            for (String record : records) {
                String[] input = record.split(" ");
                int hour = Integer.parseInt(input[0].split(":")[0]);
                int minute = Integer.parseInt(input[0].split(":")[1]);
                int curMinute = 60 * hour + minute;

                if (input[2].equals("IN")) {
                    startTime.put(input[1], curMinute);
                } else {
                    int usingMinute = curMinute - startTime.get(input[1]);
                    startTime.remove(input[1]);
                    usingTime.put(input[1], !usingTime.containsKey(input[1]) ? usingMinute : usingTime.get(input[1]) + usingMinute);
                }
            }

            for(String ext : startTime.keySet()){
                int usingMinute = 60 * 23 + 59 - startTime.get(ext);
                usingTime.put(ext, !usingTime.containsKey(ext) ? usingMinute : usingTime.get(ext) + usingMinute);
            }

            List<String> list = new ArrayList<>(usingTime.keySet());
            Collections.sort(list);
            Integer[] answer = new Integer[list.size()];
            for(int i = 0 ; i < list.size() ; i++){
                answer[i] = fees[1];
                answer[i] += usingTime.get(list.get(i)) > fees[0] ? (((usingTime.get(list.get(i)) - fees[0] - 1) / fees[2] + 1) * fees[3]) : 0;
            }

            return answer;
        }
    }