import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        List<arr> list = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            list.add(new arr(x, y));
        }

        Collections.sort(list, new Comparator<arr>(){
            public int compare(arr a, arr b){
                if(a.y < b.y){
                    return -1;
                }
                else if(a.y > b.y){
                    return 1;
                }
                else{
                    if(a.x < b.x){
                        return -1;
                    }
                    else if(a.x > b.x){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
        });

        for(int i = 0 ; i < count ; i++){
            sb.append(list.get(i).getX()).append(" ").append(list.get(i).getY()).append("\n");
        }
        
        System.out.println(sb.toString());
    }

    public static class arr{
        private int x;
        private int y;

        public arr(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }
    }
}