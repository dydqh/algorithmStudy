class Solution {
    public String solution(int a, int b) {
        int[] month = new int[13];
        month[1] = month[3] = month[5] = month[7] = month[8] = month[10] = month[12] = 31;
        month[2] = 29;
        month[4] = month[6] = month[9] = month[11] = 30;
        
        int date = b;
        for(int i = 1 ; i <= a ; i++){
            date += month[i - 1];
        }
        
        String result = "";
        switch (date % 7){
            case 0:
                result = "THU";
                break;
            case 1:
                result = "FRI";
                break;
            case 2:
                result = "SAT";
                break;
            case 3:
                result = "SUN";
                break;
            case 4:
                result = "MON";
                break;
            case 5:
                result = "TUE";
                break;
            case 6:
                result = "WED";
                break;
            default:
                break;
        }
        
        return result;
    }
}