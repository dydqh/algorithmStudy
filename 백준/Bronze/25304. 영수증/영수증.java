import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int price = 0;
        
        for(int i = 0 ; i < count ; i ++){
            String input = br.readLine();
            int itemPrice = Integer.parseInt(input.split(" ")[0]);
            int itemCount = Integer.parseInt(input.split(" ")[1]);
            price += itemPrice * itemCount;    
        }
        
        System.out.println(totalPrice == price ? "Yes" : "No");
    }
}