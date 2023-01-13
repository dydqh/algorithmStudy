import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] xList = new int[2];
        int[] yList = new int[2];

        for(int i = 0 ; i < 3 ; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            if(i == 0){
                xList[0] = x;
                yList[0] = y;
            }
            else if(i == 1){
                if(x == xList[0]){
                    xList[0] = 0;
                }
                else{
                    xList[1] = x;
                }
        
                if(y == yList[0]){
                    yList[0] = 0;
                }
                else{
                    yList[1] = y;
                }
            }
            else{
                if(xList[0] == 0){
                    sb.append(x).append(" ");
                }
                else{
                    if(x == xList[0]){
                        sb.append(xList[1]).append(" ");
                    }
                    else{
                        sb.append(xList[0]).append(" ");
                    }
                }

                if(yList[0] == 0){
                    sb.append(y);
                }
                else{
                    if(y == yList[0]){
                        sb.append(yList[1]);
                    }
                    else{
                        sb.append(yList[0]);
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}