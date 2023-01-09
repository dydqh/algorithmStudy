import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        int[] count = new int[140];
        char max = input.charAt(0);
        count[max] = 1;
        boolean isTie = false;
        
        for(int i = 1 ; i < input.length() ; i++){
            char target = input.charAt(i);
            count[target] += 1;
            if(count[target] > count[max]){
                max = target;
                isTie = false;
            }
            else if(target != max && count[target] == count[max]){
                isTie = true;
            }
            else if(target == max){
                max = target;
                isTie = false;
            }
        }
        
        if(isTie){
            System.out.println("?");
        }
        else{
            System.out.println(String.valueOf(max).toUpperCase());
        }
    }
}