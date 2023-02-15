import java.io.*;
import java.util.*;

class Main{
    public static boolean[] S = new boolean[21];
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "add":
                    add(Integer.parseInt(input[1]));
                    break;
                case "remove":
                    remove(Integer.parseInt(input[1]));
                    break;
                case "check":
                    check(Integer.parseInt(input[1]));
                    break;
                case "toggle":
                    toggle(Integer.parseInt(input[1]));
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb.toString());
    }

    public static void add(int x){
        S[x] = true;
    }

    public static void remove(int x){
        S[x] = false;
    }

    public static void check(int x){
        if(S[x]){
            sb.append("1");
        }
        else{
            sb.append("0");
        }
        sb.append("\n");
    }

    public static void toggle(int x){
        if(S[x]){
            S[x] = false;
        }
        else{
            S[x] = true;
        }
    }

    public static void all(){
        Arrays.fill(S, true);
    }

    public static void empty(){
        Arrays.fill(S, false);
    }
}