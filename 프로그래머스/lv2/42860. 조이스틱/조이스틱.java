class Solution {
    public int solution(String name) {
        int[] values = new int[91];
        for(int i = 'A' ; i <= 'Z' ; i++){
            values[i] = Math.min(i - 'A', 'Z' - i + 1);
        }

        int result = 0;

        for(int i = 0 ; i < name.length() ; i++){
            result += values[name.charAt(i)];
        }
        
        result += getMoveCount(name);

        return result;
    }

    public static int getMoveCount(String name){
        int min = name.length();
        String rightCurName = name;
        String leftCurName = name;

        for(int i = 0 ; i < name.length() ; i++){
            if(i > 0){
                String part1 = name.substring(0, i);
                StringBuffer sbPart2 = new StringBuffer(name.substring(0, i - 1));
                String part2 = sbPart2.reverse().toString();
                StringBuffer sbPart3 = new StringBuffer(name.substring(i, name.length()));
                String part3 = sbPart3.reverse().toString();
                rightCurName = part1 + part2 + part3;
            }

            for(int j = rightCurName.length() - 1 ; j > 0 ; j--){
                if(rightCurName.charAt(j) == 'A'){
                    rightCurName = rightCurName.substring(0, j);
                }
                else{
                    break;
                }
            }

            if(rightCurName.length() == 0){
                min = 0;
            }
            else{
                min = rightCurName.length() - 1 > min ? min : rightCurName.length() - 1;
            }
        }

        for(int i = name.length() - 1 ; i > 0 ; i--){
            if(i > 0){
                StringBuffer sbPart1 = new StringBuffer(name.substring(i, name.length()));
                String part1 = sbPart1.reverse().toString();
                String part2 = name.substring(i + 1, name.length());
                String part3 = name.substring(0, i);
                leftCurName = part1 + part2 + part3;
            }

            for(int j = leftCurName.length() - 1 ; j > 0 ; j--){
                if(leftCurName.charAt(j) == 'A'){
                    leftCurName = leftCurName.substring(0, j);
                }
                else{
                    break;
                }
            }

            min = leftCurName.length() > min ? min : leftCurName.length();
        }

        return min;
    }
}