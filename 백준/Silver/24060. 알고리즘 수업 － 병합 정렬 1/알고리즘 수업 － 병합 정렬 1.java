import java.io.*;

class Main{
    public static int a = 0;
    public static int K = -1;
    public static int[] temp;
    public static int result = -1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        String[] Kinput = br.readLine().split(" ");
        int[] A = new int[N];
        temp = new int[N];

        for(int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(Kinput[i]);
        }
        merge_sort(A, 0, A.length - 1);

        System.out.println(result);
    }

    public static void merge_sort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        
        int mid = (start + end) / 2;
        
        merge_sort(arr, start, mid);
        merge_sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int t = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }
            else{
                temp[t++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[t++] = arr[i++];
        }

        while(j <= end){
            temp[t++] = arr[j++];
        }

        i = start;
        t = 0;

        while(i <= end){
            arr[i++] = temp[t++];
            a += 1;
            if(a == K){
                result = temp[t - 1];
                break;
            }
        }
    }
}