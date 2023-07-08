import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String target = br.readLine();
        String key = br.readLine();
        int keyIndex = 0;

        for(int i = 0 ; i < target.length() ; i++){
            if(target.charAt(i) == ' '){
                sb.append(target.charAt(i));    
            }
            else{
                int targetInt = target.charAt(i);
                int keyInt = key.charAt(keyIndex) - 96;
                int resultInt = targetInt - keyInt;
                resultInt = resultInt < 97 ? resultInt + 26 : resultInt;
                sb.append((char)resultInt);
            }
            keyIndex++;
            keyIndex = keyIndex == key.length() ? 0 : keyIndex;
        }

        System.out.println(sb.toString());
    }
}