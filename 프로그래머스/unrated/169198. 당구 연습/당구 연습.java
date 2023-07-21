class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] result = new int[balls.length];

        for(int i = 0 ; i < balls.length ; i++){
            int[] target = balls[i];

            if(startX == target[0]){
                int min = m - startX > startX ? startX : m - startX;
                int lineMin = 0;
                if(startY > target[1]){
                    lineMin = n - startY + n - target[1];
                }
                else{
                    lineMin = startY + target[1];
                }
                result[i] += Math.min(((startY - target[1]) * (startY - target[1]) + (min * min * 4)), (lineMin * lineMin));
            }
            else if(startY == target[1]){
                int min = n - startY > startY ? startY : n - startY;
                int lineMin = 0;
                if(startX > target[0]){
                    lineMin = m - startX + m - target[0];
                }
                else{
                    lineMin = startX + target[0];
                }
                result[i] += Math.min(((startX - target[0]) * (startX - target[0]) + (min * min * 4)), (lineMin * lineMin));
            }
            else{
                int minX = (m - startX) + (m - target[0]) > startX + target[0] ? startX + target[0] : (m - startX) + (m - target[0]);
                int minY = (n - startY) + (n - target[1]) > startY + target[1] ? startY + target[1] : (n - startY) + (n - target[1]);
                result[i] = Math.min(((minX * minX) + ((startY - target[1]) * (startY - target[1]))), ((minY * minY) + ((startX - target[0]) * (startX - target[0]))));
            }
        }
        
        return result;
    }
}