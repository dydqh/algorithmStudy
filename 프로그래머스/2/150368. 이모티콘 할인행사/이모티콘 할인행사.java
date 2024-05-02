class Solution {
    public static int maxPlus = 0;
    public static int maxPrice = 0;

    public int[] solution(int[][] users, int[] emoticons) {
        dfs(new int[emoticons.length], 0, users, emoticons);
        int[] answer = {};
        return new int[]{maxPlus, maxPrice};
    }

    public static void dfs(int[] arr, int depth, int[][] users, int[] emoticons){
        if(depth == arr.length){
            solve(users, emoticons, arr);
            return;
        }

        for(int i = 1 ; i <= 4 ; i++){
            arr[depth] = i * 10;
            dfs(arr, depth + 1, users, emoticons);
            arr[depth] = 0;
        }
    }

    public static void solve(int[][] users, int[] emoticons, int[] discount){
        int plus = 0;
        int price = 0;

        for (int[] user : users) {
            int curPrice = 0;
            for (int j = 0; j < discount.length; j++) {
                if (user[0] <= discount[j]) {
                    curPrice += (emoticons[j] / 100 * (100 - discount[j]));
                }
            }
            if (curPrice >= user[1]) {
                plus++;
            } else {
                price += curPrice;
            }
        }

        if(plus == maxPlus && price >= maxPrice){
            maxPrice = price;
        }
        else if(plus > maxPlus){
            maxPlus = plus;
            maxPrice = price;
        }
    }
}