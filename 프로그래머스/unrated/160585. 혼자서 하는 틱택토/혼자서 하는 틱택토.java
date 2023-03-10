class Solution {
    public static String[] bd = new String[3];
    public static int answer = 0;
    public static String[] publicBoard;
    
    public int solution(String[] board) {
        publicBoard = board;
        
        for(int i = 0 ; i < 3 ; i++){
            bd[i] = "...";
        }
        
        ttt(0, "O");
        
        return answer;
    }
    
    
    public static void ttt(int depth, String ox){
        if(publicBoard[0].equals(bd[0]) && publicBoard[1].equals(bd[1]) && publicBoard[2].equals(bd[2])){
            answer = 1;
            return;
        }
        
        if(depth == 9){
            return;
        }
        
        if(
            ((bd[0].charAt(0) != '.') && (bd[0].charAt(0) == bd[0].charAt(1) && bd[0].charAt(0) == bd[0].charAt(2))) ||
            ((bd[1].charAt(0) != '.') && (bd[1].charAt(0) == bd[1].charAt(1) && bd[1].charAt(0) == bd[1].charAt(2))) ||
            ((bd[2].charAt(0) != '.') && (bd[2].charAt(0) == bd[2].charAt(1) && bd[2].charAt(0) == bd[2].charAt(2))) ||

            ((bd[0].charAt(0) != '.') && (bd[0].charAt(0) == bd[1].charAt(0) && bd[0].charAt(0) == bd[2].charAt(0))) ||
            ((bd[0].charAt(1) != '.') && (bd[0].charAt(1) == bd[1].charAt(1) && bd[0].charAt(1) == bd[2].charAt(1))) ||
            ((bd[0].charAt(2) != '.') && (bd[0].charAt(2) == bd[1].charAt(2) && bd[0].charAt(2) == bd[2].charAt(2))) ||

            ((bd[0].charAt(0) != '.') && (bd[0].charAt(0) == bd[1].charAt(1) && bd[0].charAt(0) == bd[2].charAt(2))) ||
            ((bd[0].charAt(2) != '.') && (bd[0].charAt(2) == bd[1].charAt(1) && bd[0].charAt(2) == bd[2].charAt(0)))
        ){
            return;
        }
        
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(bd[i].charAt(j) == '.'){
                    String origin = bd[i];
                    if(j == 0){
                        bd[i] = ox + bd[i].substring(1, 3);
                    }
                    else if(j == 1){
                        bd[i] = bd[i].substring(0, 1) + ox + bd[i].substring(2, 3);
                    }
                    else{
                        bd[i] = bd[i].substring(0, 2) + ox;
                    }
                    ttt(depth + 1, ox.equals("X") ? "O" : "X");
                    bd[i] = origin;
                }
            }
        }
    }
}