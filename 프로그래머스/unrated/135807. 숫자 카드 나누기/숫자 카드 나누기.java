class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = 0;
        int largeA = 0;
        int smallA = 0;
        
        for(int i = 1 ; i < arrayA.length ; i++){
            if(i == 1){
                largeA = arrayA[1] > arrayA[0] ? arrayA[1] : arrayA[0];
                smallA = arrayA[1] < arrayA[0] ? arrayA[1] : arrayA[0];
                gcdA = gcd(largeA, smallA);
            }
            else{
                largeA = arrayA[i] > gcdA ? arrayA[i] : gcdA;
                smallA = arrayA[i] < gcdA ? arrayA[i] : gcdA;
                gcdA = gcd(largeA, smallA);
            }
        }
        
        int gcdB = 0;
        int largeB = 0;
        int smallB = 0;
        
        for(int i = 1 ; i < arrayB.length ; i++){
            if(i == 1){
                largeB = arrayB[1] > arrayB[0] ? arrayB[1] : arrayB[0];
                smallB = arrayB[1] < arrayB[0] ? arrayB[1] : arrayB[0];
                gcdB = gcd(largeB, smallB);
            }
            else{
                largeB = arrayB[i] > gcdB ? arrayB[i] : gcdB;
                smallB = arrayB[i] < gcdB ? arrayB[i] : gcdB;
                gcdB = gcd(largeB, smallB);
            }
        }
        
        if(arrayA.length == 1 && gcdA == 0){
            gcdA = arrayA[0];
        }
        
        if(arrayB.length == 1 && gcdB == 0){
            gcdB = arrayB[0];
        }

        int resultA = 0;
        int resultB = 0;
        boolean isContinue = false;

        for(int i = gcdA ; i >= 2 ; i--){
            for(int j = 0 ; j < arrayA.length ; j++){
                if(arrayA[j] % i != 0){
                    break;
                }
                if(j == arrayA.length - 1){
                    isContinue = true;
                }
            }
            if(isContinue){
                for(int j = 0 ; j < arrayB.length ; j++){
                    if(arrayB[j] % i == 0){
                        break;
                    }
                    if(j == arrayB.length - 1){
                        resultB = i;
                    }
                }
            }
            
            if(resultB != 0){
                break;
            }
            isContinue = false;
        }
        
        for(int i = gcdB ; i >= 2 ; i--){
            for(int j = 0 ; j < arrayB.length ; j++){
                if(arrayB[j] % i != 0){
                    break;
                }
                if(j == arrayB.length - 1){
                    isContinue = true;
                }
            }

            if(isContinue){
                for(int j = 0 ; j < arrayA.length ; j++){
                    if(arrayA[j] % i == 0){
                        break;
                    }
                    if(j == arrayA.length - 1){
                        resultA = i;
                    }
                }
            }

            if(resultA != 0){
                break;
            }
            isContinue = false;
        }
        
        return resultB > resultA ? resultB : resultA;
    }
    
    public static int gcd(int large, int small){
        if(large % small == 0){
            return small;
        }
        else{
            return gcd(small, large % small);
        }
    }
}