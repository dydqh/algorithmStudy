import java.io.*;

class Main{
    public static int a = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            a = 0;
            sb.append(isPalindrome(input)).append(" ").append(a).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int recursion(String s, int l, int r){
        a += 1;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}