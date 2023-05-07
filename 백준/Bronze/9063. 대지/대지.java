import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int minX = 10001;
        int maxX = -10001;
        int minY = 10001;
        int maxY = -10001;

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            minX = minX > x ? x : minX;
            maxX = maxX < x ? x : maxX;
            minY = minY > y ? y : minY;
            maxY = maxY < y ? y : maxY;
        }

        int result = (maxX - minX) * (maxY - minY);

        System.out.println(result);
    }
}