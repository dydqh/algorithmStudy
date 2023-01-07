class Main{
    public static void main(String[] args){
        int count = 10000;
        StringBuffer sb = new StringBuffer();
        boolean[] isSelfNumber = new boolean[count + 1];
        
        for(int i = 1 ; i <= count; i++){
            if(isSelfNumber[i]){
                continue;
            }
            sb.append(i).append('\n');
            
            int cur = i;
            int target = i;
            while(cur > 0){
                target += (cur % 10);
                cur /= 10;
            }
            if(target > count){
                continue;
            }
            isSelfNumber[target] = true;
            
            while(true){
                cur = target;
                while(cur > 0){
                    target += (cur % 10);
                    cur /= 10;
                }
                if(target > count){
                    break;
                }
                if(isSelfNumber[target]){
                    break;
                }
                isSelfNumber[target] = true;
            }
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb.toString());
    }
}