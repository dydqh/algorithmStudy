import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int size = (int)Math.pow(2, N);
        getAnswer(size, 0, 0, 0, r + 1, c + 1);
    }

    public static void getAnswer(int size, int start, int startR, int startC, int targetR, int targetC){
        if(size == 1){
            System.out.println(start);
            return;
        }

        int quarter = size * size / 4;

        if(targetC <= startC + size / 2 && targetR <= startR + size / 2){
            getAnswer(size / 2, start, startR, startC, targetR, targetC);
        }
        else if(targetC > startC + size / 2 && targetR <= startR + size / 2){
            getAnswer(size / 2, start + quarter, startR, startC + size / 2, targetR, targetC);
        }
        else if(targetC <= startC + size / 2 && targetR > startR + size / 2){
            getAnswer(size / 2, start + quarter * 2, startR + size / 2, startC, targetR, targetC);
        }
        else{
            getAnswer(size / 2, start + quarter * 3, startR + size / 2, startC + size / 2, targetR, targetC);
        }
    }
}