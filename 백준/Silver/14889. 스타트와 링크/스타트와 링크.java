import java.io.*;

class Main{
    public static int N;
    public static int min = 1000000000;
    public static int[][] score;
    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];
        score = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            String[] temp = br.readLine().split(" ");
            for(int j = 0 ; j < N ; j++){
                score[i][j] = Integer.parseInt(temp[j]);
            }
        }

        assign(0, 0);

        System.out.println(min);
    }

    public static void assign(int depth, int start){
        if(depth == N / 2){
            int startScore = 0;
            int linkScore = 0;

            for(int i = 0 ; i < N / 2 - 1 ; i++){
                for(int j = i + 1 ; j < N / 2 ; j++){
                    startScore += (score[arr[i] - 1][arr[j] - 1] + score[arr[j] - 1][arr[i] - 1]);
                }
            }

            for(int i = N / 2 ; i < N ; i++){
                for(int j = 0 ; j < N ; j++){
                    if(!visited[j]){
                        visited[j] = true;
                        arr[i] = j + 1;
                        break;
                    }
                }
            }

            for(int i = N / 2 ; i < N - 1 ; i++){
                for(int j = i + 1 ; j < N ; j++){
                    linkScore += (score[arr[i] - 1][arr[j] - 1] + score[arr[j] - 1][arr[i] - 1]);
                }
            }

            int difference = startScore > linkScore ? startScore - linkScore : linkScore - startScore;
            min = min > difference ? difference : min;

            if(min == 0){
                System.out.println("0");
                System.exit(0);
            }

            for(int i = N / 2 ; i < N ; i++){
                visited[arr[i] - 1] = false;
                arr[i] = 0;
            }

            return;
        }

        for(int i = start ; i < N ; i++){
            arr[depth] = i + 1;
            visited[i] = true;
            assign(depth + 1, i + 1);
            visited[i] = false;
        }
    }
}