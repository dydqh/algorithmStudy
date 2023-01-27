import java.io.*;

class Main{
    public static int[] wine;
    public static int[] drunkenWine;
    public static boolean[] isCalculated;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        wine = new int[n];
        drunkenWine = new int[n];
        isCalculated = new boolean[n];

        if(n == 1){
            System.out.println(Integer.parseInt(br.readLine()));
        }
        else{
            for(int i = 0 ; i < n ; i++){
                wine[i] = Integer.parseInt(br.readLine());
            }

            drunkenWine[0] = wine[0];
            drunkenWine[1] = wine[0] + wine[1];

            drink(n - 1);

            System.out.println(Math.max(drunkenWine[n - 1], drunkenWine[n - 2]));
        }
    }

    public static int drink(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0 || n == 1){
            return drunkenWine[n];
        }
        if(isCalculated[n]){
            return drunkenWine[n];
        }

        for(int i = 2 ; i <= n ; i++){
            drunkenWine[i] = Math.max(Math.max(wine[i] + wine[i - 1] + drink(i - 3), wine[i] + drink(i - 2)), drunkenWine[i - 1]);
            isCalculated[i] = true;
        }
        return drunkenWine[n];
    }
}