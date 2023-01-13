import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.valueOf(br.readLine());
        List<Person> list = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            list.add(new Person(Integer.valueOf(input[0]), Integer.valueOf(input[1])));
        }

        for(int i = 0 ; i < count - 1 ; i++){
            for(int j = i + 1 ; j < count ; j++){
                if(i == j){
                    continue;
                }
                else{
                    Person personI = list.get(i);
                    Person personJ = list.get(j);
                    if(personI.x > personJ.x && personI.y > personJ.y){
                        personJ.rank += 1;
                    }
                    else if(personI.x < personJ.x && personI.y < personJ.y){
                        personI.rank += 1;
                    }
                }
            }
        }

        for(int i = 0 ; i < count ; i++){
            sb.append(list.get(i).rank).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static class Person{
        int x;
        int y;
        int rank;

        public Person(int x, int y){
            this.x = x;
            this.y = y;
            this.rank = 1;
        }
    }
}