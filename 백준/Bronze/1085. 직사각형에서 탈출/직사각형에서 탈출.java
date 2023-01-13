import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        int ymin = w - x > x ? x : w - x;
        int xmin = h - y > y ? y : h - y;
        System.out.println(xmin > ymin ? ymin : xmin);
    }
}