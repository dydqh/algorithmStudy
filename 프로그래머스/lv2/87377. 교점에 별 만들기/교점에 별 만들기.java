import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        Set<Long> ySet = new HashSet<>();
        Map<Long, List<Long>> xMap = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        Long xMax = null;
        Long xMin = null;

        for(int i = 0 ; i < line.length ; i++){
            for(int j = i + 1 ; j < line.length ; j++){
                if(fx(line[i], line[j]) != null){
                    long[] star = fx(line[i], line[j]);

                    ySet.add(star[1]);
                    if(!xMap.containsKey(star[1])){
                        List<Long> xTempList = new ArrayList<>();
                        xTempList.add(star[0]);
                        xMap.put(star[1], xTempList);
                    }
                    else{
                        List<Long> xTempList = xMap.get(star[1]);
                        xTempList.add(star[0]);
                        xMap.put(star[1], xTempList);
                    }

                    if(xMin == null && xMax == null){
                        xMin = star[0];
                        xMax = star[0];
                    }
                    else{
                        xMin = xMin > star[0] ? star[0] : xMin;
                        xMax = xMax < star[0] ? star[0] : xMax;
                    }
                }
            }
        }

        Long[] yList = ySet.stream().sorted().toArray(Long[]::new);
        Long yMin = yList[0];
        Long yMax = yList[yList.length - 1];
        List<String> answer = new ArrayList<>();
        for(long i = yMax ; i >= yMin ; i--){
            if(xMap.containsKey(i)){
                Long[] xList = xMap.get(i).stream().sorted().toArray(Long[]::new);
                int index = 0;

                for(long j = xMin ; j <= xMax ; j++){
                    if(xList.length > index && xList[index] == j){
                        sb.append("*");
                        index++;
                    }
                    else{
                        sb.append(".");
                    }
                }
            }
            else{
                for(long j = xMin ; j <= xMax ; j++){
                    sb.append(".");
                }
            }
            answer.add(sb.toString());
            sb.setLength(0);
        }
        
        String[] result = answer.stream().toArray(String[]::new);
        return result;
    }
    
    public static long[] fx(int[] fx1, int[] fx2){
        long A = fx1[0];
        long B = fx1[1];
        long C = fx2[0];
        long D = fx2[1];
        long E = fx1[2];
        long F = fx2[2];

        if((A * D) == (B * C)){
            return null;
        }
        else{
            double x = (double)(B * F - E * D)/(double)(A * D - B * C);
            double y = (double)(E * C - A * F)/(double)(A * D - B * C);
    
            if((long)y == y && (long)x == x){
                return new long[] {(long)x, (long)y};
            }
            else{
                return null;
            }
        }
    }
}