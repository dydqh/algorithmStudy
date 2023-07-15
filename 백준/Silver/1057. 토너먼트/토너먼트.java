import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int kim = Integer.parseInt(input[1]);
        int lim = Integer.parseInt(input[2]);
        int round = 1;

        while(true){
            if((lim + 1) / 2 == (kim + 1) / 2){
                break;
            }
            lim = (lim + 1) / 2;
            kim = (kim + 1) / 2;
            count = (count + 1) / 2;
            round++;
        }

        System.out.println(round);
    }
}