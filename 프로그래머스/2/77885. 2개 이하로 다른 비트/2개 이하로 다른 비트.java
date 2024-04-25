class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0 ; i < numbers.length ; i++){
            String numberBit = getBit(numbers[i]);
            StringBuilder target = new StringBuilder(numberBit);
            int index = -1;

            for (int j = numberBit.length() - 1; j >= 0; j--) {
                if (numberBit.charAt(j) == '0') {
                    index = j;
                    break;
                }
            }

            if (index > -1) {
                target.replace(index, index + 1, "1");
            }
            else {
                target.insert(0, "1");
                index = 0;
            }

            for (int j = index + 1; j < target.length(); j++) {
                if (target.charAt(j) == '1') {
                    target.replace(j, j + 1, "0");
                    break;
                }
            }
            long result = getNumber(target.toString());
            answer[i] = result;
        }
        return answer;
    }

    public static String getBit(long number){
        StringBuilder sb = new StringBuilder();
        while(number > 0){
            sb.append(number % 2);
            number /= 2;
        }
        return sb.reverse().toString();
    }

    public static long getNumber(String bit){
        long answer = 0;
        long number = 1;
        for(int i = bit.length() - 1 ; i >= 0 ; i--){
            answer += bit.charAt(i) == '1' ? number : 0;
            number *= 2;
        }
        return answer;
    }
}