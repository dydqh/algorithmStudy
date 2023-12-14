import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows][columns];
        int number = 1;

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                arr[i][j] = number++;
            }
        }
        
        for(int i = 0 ; i < queries.length ; i++){
            answer[i] = swap(arr, queries[i][0] - 1, queries[i][1] - 1, queries[i][2] - 1, queries[i][3] - 1);
        }
        
        return answer;
    }

    public int swap(int[][] arr, int startRow, int startColumn, int endRow, int endColumn){
        Queue<Integer> queue = new LinkedList<>();
        int min = arr.length * arr[0].length;
        min = setQueue(queue, arr, startRow, startColumn, endRow, endColumn, min);
        setArr(queue, arr, startRow, startColumn, endRow, endColumn);
        return min;
    }

    public int setQueue(Queue<Integer> queue, int[][] arr, int startRow, int startColumn, int endRow, int endColumn, int min){
        for(int i = startColumn ; i < endColumn ; i++){
            queue.add(arr[startRow][i]);
            min = min > arr[startRow][i] ? arr[startRow][i] : min;
        }

        for(int i = startRow ; i < endRow ; i++){
            queue.add(arr[i][endColumn]);
            min = min > arr[i][endColumn] ? arr[i][endColumn] : min;
        }

        for(int i = endColumn ; i > startColumn ; i--){
            queue.add(arr[endRow][i]);
            min = min > arr[endRow][i] ? arr[endRow][i] : min;
        }

        for(int i = endRow ; i > startRow ; i--){
            queue.add(arr[i][startColumn]);
            min = min > arr[i][startColumn] ? arr[i][startColumn] : min;
        }

        return min;
    }

    public void setArr(Queue<Integer> queue, int[][] arr, int startRow, int startColumn, int endRow, int endColumn){
        for(int i = startColumn + 1 ; i < endColumn ; i++){
            arr[startRow][i] = queue.poll();
        }

        for(int i = startRow ; i < endRow ; i++){
            arr[i][endColumn] = queue.poll();
        }

        for(int i = endColumn ; i > startColumn ; i--){
            arr[endRow][i] = queue.poll();
        }

        for(int i = endRow ; i >= startRow ; i--){
            arr[i][startColumn] = queue.poll();
        }
    }
}