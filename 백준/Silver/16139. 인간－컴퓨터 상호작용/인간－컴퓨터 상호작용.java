import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String s = br.readLine();
        int[][] alphabet = new int[s.length()][26];

        alphabet[0][s.charAt(0) - 97] += 1;
        for(int i = 1 ; i < s.length() ; i++){
            alphabet[i][s.charAt(i) - 97] += 1;
            for(int j = 0 ; j < 26 ; j++){
                alphabet[i][j] += alphabet[i - 1][j];
            }
        }

        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < count ; i++){
            String[] temp = br.readLine().split(" ");
            int target = temp[0].charAt(0) - 97;
            int start = Integer.parseInt(temp[1]) - 1;
            int end = Integer.parseInt(temp[2]);

            if(start == -1){
                sb.append(alphabet[end][target]).append("\n");
            }
            else{
                sb.append((alphabet[end][target] - alphabet[start][target])).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}