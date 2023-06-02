import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        for(int i = 1 ; i < count ; i++){
            String fileName = br.readLine();
            for(int j = 0 ; j < fileName.length() ; j++){
                if(fileName.charAt(j) == pattern.charAt(j)){
                    sb.append(fileName.charAt(j));
                }
                else{
                    sb.append('?');
                }
            }
            pattern = sb.toString();
            sb.setLength(0);
        }
        System.out.println(pattern);
    }
}