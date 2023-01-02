import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int first = Integer.parseInt(input.split(" ")[0]);
        int second = Integer.parseInt(input.split(" ")[1]);
        int third = Integer.parseInt(input.split(" ")[2]);
        
        if(first == second && second == third){
            System.out.println(first * 1000 + 10000);
        }
        else if(first == second && first != third){
            System.out.println(first * 100 + 1000);
        }
        else if(first == third && first != second){
            System.out.println(first * 100 + 1000);
        }
        else if(second == third && first != second){
            System.out.println(second * 100 + 1000);
        }
        else{
            int large = first > second ? first : second;
            large = large > third ? large : third;
            System.out.println(large * 100);
        }
    }
}