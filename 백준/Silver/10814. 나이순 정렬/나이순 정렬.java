import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            list.add(new Person(Integer.parseInt(input[0]), input[1]));
        }

        Collections.sort(list, new Comparator<Person>(){
            public int compare(Person a, Person b){
                if(a.age == b.age){
                    return 0;
                }
                else{
                    return a.age - b.age;
                }
            }
        });

        for(int i = 0 ; i < count ; i++){
            sb.append(list.get(i).age).append(" ").append(list.get(i).name).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
}