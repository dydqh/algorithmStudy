import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int countA = Integer.parseInt(input[0]);
        int countB = Integer.parseInt(input[1]);
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");
        Map<Integer, Target> map = new HashMap<>();

        for(int i = 0 ; i < countA ; i++){
            int key = Integer.parseInt(inputA[i]);
            if(!map.containsKey(key)){
                map.put(key, new Target(key, "A"));
            }
            else{
                map.get(key).plusA();
            }
        }

        for(int i = 0 ; i < countB ; i++){
            int key = Integer.parseInt(inputB[i]);
            if(!map.containsKey(key)){
                map.put(key, new Target(key, "B"));
            }
            else{
                map.get(key).plusB();
            }
        }

        int result = 0;
        for(int key : map.keySet()){
            Target target = map.get(key);
            if(target.countA == 0){
                result += target.countB;
            }
            else if(target.countB == 0){
                result += target.countA;
            }
        }

        System.out.println(result);
    }

    public static class Target{
        int number;
        int countA;
        int countB;
        
        public Target(int number, String where){
            this.number = number;
            if(where.equals("A")){
                this.countA = 1;
            }
            else if(where.equals("B")){
                this.countB = 1;
            }
        }

        public void plusA(){
            this.countA += 1;
        }

        public void plusB(){
            this.countB += 1;
        }
    }
}