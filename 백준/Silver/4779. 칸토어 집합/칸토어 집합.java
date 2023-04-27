import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while((input = br.readLine()) != null && !input.isEmpty()){
            int curN = Integer.parseInt(input);
            
            if(curN == 0){
                System.out.println("-");
            }
            else{
                System.out.println(cantor(curN));
            }
        }
    }

    public static String cantor(int number){
        StringBuffer sb = new StringBuffer();
        String curString = "- -";
        int index = 1;

        while(index < number){
            sb.append(curString);
            for(int i = 0 ; i < curString.length() ; i++){
                sb.append(" ");
            }
            sb.append(curString);
            curString = sb.toString();
            sb.setLength(0);
            index++;
        }

        return curString;
    }
}