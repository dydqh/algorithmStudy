class Solution {
    public long solution(String expression) {
        long answer = 0;
        String[] signs = new String[]{"\\*", "\\+", "-"};
        String[] orders = new String[3];

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(i != j){
                    for(int k = 0 ; k < 3 ; k++){
                        if(k != i && k != j){
                            orders[0] = signs[i];
                            orders[1] = signs[j];
                            orders[2] = signs[k];
                            long curAnswer = getAnswer(expression, orders);
                            answer = Math.max(Math.abs(curAnswer), answer);
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static long getAnswer(String expression, String[] orders){
        String[] ranks = new String[]{"F", "S", "T"};
        expression = expression.replaceAll(orders[0], ranks[0]).replaceAll(orders[1], ranks[1]).replaceAll(orders[2], ranks[2]);

        for(int i = 0 ; i < 3 ; i++){
            while(expression.contains(ranks[i])){
                int curIndex = expression.indexOf(ranks[i]);
                int start = curIndex;
                int end = curIndex;

                for(int j = curIndex - 1 ; j >= 0 ; j--){
                    if(expression.charAt(j) == 'F' || expression.charAt(j) == 'S' || expression.charAt(j) == 'T'){
                        start = j + 1;
                        break;
                    }
                }

                for(int j = curIndex + 1 ; j < expression.length() ; j++){
                    if(expression.charAt(j) == 'F' || expression.charAt(j) == 'S' || expression.charAt(j) == 'T'){
                        end = j;
                        break;
                    }
                }

                start = curIndex == start ? 0 : start;
                end = curIndex == end ? expression.length() : end;
                long pre = Long.parseLong(expression.substring(start, curIndex));
                long cur = Long.parseLong(expression.substring(curIndex + 1, end));
                StringBuilder sb = new StringBuilder();
                switch (orders[i]){
                    case "\\+":
                        expression = sb.append(expression, 0, start).append(String.valueOf(pre + cur)).append(expression.substring(end)).toString();
                        break;
                    case "-":
                        expression = sb.append(expression, 0, start).append(String.valueOf(pre - cur)).append(expression.substring(end)).toString();
                        break;
                    case "\\*":
                        expression = sb.append(expression, 0, start).append(String.valueOf(pre * cur)).append(expression.substring(end)).toString();
                        break;
                    default:
                        break;
                }
            }
        }

        return Long.parseLong(expression);
    }
}