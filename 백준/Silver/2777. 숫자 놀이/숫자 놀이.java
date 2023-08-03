import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < caseCount ; i++){
            int curCase = Integer.parseInt(br.readLine());
            if(curCase == 1){
                sb.append(1).append("\n");
            }
            else{
                int[] count = new int[10];
                boolean isPossible = true;
    
                while(curCase > 1){
                    isPossible = true;
    
                    if(curCase % 2 == 0){
                        count[2]++;
                        curCase /= 2;
                    }
                    else if(curCase % 3 == 0){
                        count[3]++;
                        curCase /= 3;
                    }
                    else if(curCase % 5 == 0){
                        count[5]++;
                        curCase /= 5;
                    }
                    else if(curCase % 7 == 0){
                        count[7]++;
                        curCase /= 7;
                    }
                    else{
                        isPossible = false;
                        break;
                    }
                }
    
                if(!isPossible){
                    sb.append(-1).append("\n");
                }
                else{
                    while(true){
                        if(count[2] >= 3){
                            count[8]++;
                            count[2] -= 3;
                        }
                        else if(count[2] >= 2){
                            count[4]++;
                            count[2] -= 2;
                        }
                        else if(count[2] > 0 && count[3] > 0){
                            int sixCount = Math.min(count[2], count[3]);
                            count[6] += sixCount;
                            count[2] -= sixCount;
                            count[3] -= sixCount;
                        }
                        else if(count[3] >= 2){
                            count[9]++;
                            count[3] -= 2;
                        }
                        else{
                            break;
                        }
                    }
                    long result = 0;
                    for(int j = 2 ; j < 10 ; j++){
                        if(count[j] > 0){
                            result += count[j];
                        }
                    }
                    sb.append(result).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}