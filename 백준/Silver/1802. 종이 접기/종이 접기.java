import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < count ; i++){
            sb.append(isPossible(br.readLine())).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static String isPossible(String target){
        StringBuffer sb;
        boolean isPossible = true;

        while(target.length() > 1){
            String part1 = target.substring(0, target.length() / 2);
            String part2 = target.substring(target.length() / 2 + 1, target.length());
            sb = new StringBuffer(part2);
            String part2Reverse = sb.reverse().toString();
            isPossible = true;
            for(int i = 0 ; i < part1.length() ; i++){
                if(part1.charAt(i) == part2Reverse.charAt(i)){
                    isPossible = false;
                    break;
                }
            }
            if(!isPossible){
                break;
            }
            else{
                sb.setLength(0);
                target = part1;
            }
        }
        return isPossible ? "YES" : "NO";
    }
}