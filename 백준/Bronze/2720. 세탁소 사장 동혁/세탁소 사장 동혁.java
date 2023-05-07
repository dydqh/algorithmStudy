import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < count ; i++){
            int price = Integer.parseInt(br.readLine());

            int q = price / 25;
            price %= 25;

            int d = price / 10;
            price %= 10;

            int n = price / 5;
            price %= 5;

            int p = price;

            sb.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p).append("\n");
        }

        System.out.println(sb.toString());
    }
}