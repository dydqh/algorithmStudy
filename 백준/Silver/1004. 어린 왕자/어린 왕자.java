import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            String[] inputXY = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputXY[0]);
            int y1 = Integer.parseInt(inputXY[1]);
            int x2 = Integer.parseInt(inputXY[2]);
            int y2 = Integer.parseInt(inputXY[3]);
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            for(int j = 0 ; j < n ; j++){
                String[] inputCR = br.readLine().split(" ");
                int cx = Integer.parseInt(inputCR[0]);
                int cy = Integer.parseInt(inputCR[1]);
                int r = Integer.parseInt(inputCR[2]);
                
                double distance1 = Math.sqrt((double)(x1 - cx) * (x1 - cx) + (double)(y1 - cy) * (y1 - cy));
                double distance2 = Math.sqrt((double)(x2 - cx) * (x2 - cx) + (double)(y2 - cy) * (y2 - cy));

                if(distance1 > r && distance2 < r){
                    result += 1;
                }
                else if(distance1 < r && distance2 > r){
                    result += 1;
                }
            }

            sb.append(result).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}