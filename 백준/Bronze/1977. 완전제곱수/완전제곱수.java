//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        int count = Integer.parseInt(br.readLine());
//        List<Integer> rank = new ArrayList<>();
//        Map<Integer, Integer> score = new HashMap<>();
//        Map<Integer, Integer> order = new HashMap<>();
//        String[] students = br.readLine().split(" ");
//        for(int i = 0 ; i < students.length ; i++){
//            int student = Integer.parseInt(students[i]);
//
//            if(!rank.contains(student)){
//                if(rank.size() >= n){
//                    score.remove(rank.get(n - 1));
//                    order.remove(rank.get(n - 1));
//                    rank.remove(n - 1);
//                }
//
//                rank.add(student);
//                score.put(student, 1);
//                order.put(student, i);
//            }
//            else{
//                score.put(student, score.get(student) + 1);
//            }
//
//            order(rank, score, order, student);
//        }
//        rank.stream().sorted().forEach(i -> sb.append(i).append(" "));
//        System.out.println(sb.toString());
//    }
//
//    public static void order(List<Integer> rank, Map<Integer, Integer> score, Map<Integer, Integer> order, int student){
//        int index = rank.indexOf(student);
//        while(index > 0){
//            int targetStudent = rank.get(index - 1);
//            if(score.get(student) > score.get(targetStudent)){
//                swap(rank, index, index - 1);
//            }
//            else if(score.get(student) == score.get(targetStudent) && order.get(student) > order.get(targetStudent)){
//                swap(rank, index, index - 1);
//            }
//            else{
//                break;
//            }
//            index = rank.indexOf(student);
//        }
//    }
//
//    public static void swap(List<Integer> rank, int i, int j){
//        int temp = rank.get(i);
//        rank.set(i, rank.get(j));
//        rank.set(j, temp);
//    }
//}



import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        int i = 1;
        while(i * i <= N){
            if(i * i >= M){
                sum += (i * i);
                if(min == 0){
                    min = i * i;
                }
            }
            i++;
        }
        if(min > 0){
            sb.append(sum).append("\n").append(min);
        }
        else{
            sb.append("-1");
        }
        System.out.println(sb.toString());
    }
}