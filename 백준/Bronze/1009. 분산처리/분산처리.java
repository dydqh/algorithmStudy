import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int target = a;
            if(b == 1){
                target %= 10;
            }
            for(int j = 1 ; j < b ; j++){
                target *= a;
                target %= 10;
            }

            target = target == 0 ? 10 : target;
            sb.append(target).append("\n");
        }

        System.out.println(sb.toString());
    }
}