import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int index = 1;
        int plus = 0;

        while(true){
            int indexA = A.length() - index;
            int indexB = B.length() - index;

            if(indexA >= 0 && indexB >= 0){
                int a = A.charAt(indexA) - 48;
                int b = B.charAt(indexB) - 48;
                if((a + b + plus) >= 10){
                    sb.append((a + b + plus) % 10);
                    plus = 1;
                }
                else{
                    sb.append((a + b + plus));
                    plus = 0;
                }
            }
            else if(indexA < 0 && indexB >= 0){
                int b = B.charAt(indexB) - 48;
                b += plus;
                if(b >= 10){
                    plus = 1;
                    sb.append(b % 10);
                }
                else{
                    plus = 0;
                    sb.append(b);
                }
            }
            else if(indexB < 0 && indexA >= 0){
                int a = A.charAt(indexA) - 48;
                a += plus;
                if(a >= 10){
                    plus = 1;
                    sb.append(a % 10);
                }
                else{
                    plus = 0;
                    sb.append(a);
                }
            }
            else{
                if(plus == 1){
                    sb.append(1);
                }
                break;
            }
            index++;
        }
        System.out.println(sb.reverse().toString());
    }
}