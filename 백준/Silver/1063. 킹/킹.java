import java.io.*;

public class Main {
    public static int kingCol;
    public static int kingRow;
    public static int stoneCol;
    public static int stoneRow;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        kingCol = input[0].charAt(0) - 65;
        kingRow = input[0].charAt(1) - 49;
        stoneCol = input[1].charAt(0) - 65;
        stoneRow = input[1].charAt(1) - 49;
        int count = Integer.parseInt(input[2]);

        for(int i = 0 ; i < count ; i++){
            move(br.readLine());
        }

        String[] col = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] row = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
        sb.append(col[kingCol]).append(row[kingRow]).append("\n");
        sb.append(col[stoneCol]).append(row[stoneRow]);

        System.out.println(sb.toString());
    }

    public static void move(String direction){
        switch (direction) {
            case "R":
                if(kingCol == 7){
                    break;
                }
                else{
                    kingCol += 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneCol < 7){
                            stoneCol += 1;
                        }
                        else{
                            kingCol -= 1;
                        }
                    }
                }
                break;
            case "L":
                if(kingCol == 0){
                    break;
                }
                else{
                    kingCol -= 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneCol > 0){
                            stoneCol -= 1;
                        }
                        else{
                            kingCol += 1;
                        }
                    }
                }
                break;
            case "B":
                if(kingRow == 0){
                    break;
                }
                else{
                    kingRow -= 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneRow > 0){
                            stoneRow -= 1;
                        }
                        else{
                            kingRow += 1;
                        }    
                    }
                }
                break;
            case "T":
                if(kingRow == 7){
                    break;
                }
                else{
                    kingRow += 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneRow < 7){
                            stoneRow += 1;
                        }
                        else{
                            kingRow -= 1;
                        }    
                    }
                }
                break;
            case "RT":
                if(kingCol == 7 || kingRow == 7){
                    break;
                }
                else{
                    kingCol += 1;
                    kingRow += 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneCol < 7 && stoneRow < 7){
                            stoneCol += 1;
                            stoneRow += 1;
                        }
                        else{
                            kingCol -= 1;
                            kingRow -= 1;
                        }
                    }
                }
                break;
            case "LT":
                if(kingCol == 0 || kingRow == 7){
                    break;
                }
                else{
                    kingCol -= 1;
                    kingRow += 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneCol > 0 && stoneRow < 7){
                            stoneCol -= 1;
                            stoneRow += 1;
                        }
                        else{
                            kingCol += 1;
                            kingRow -= 1;
                        }    
                    }
                }
                break;
            case "RB":
                if(kingCol == 7 || kingRow == 0){
                    break;
                }
                else{
                    kingCol += 1;
                    kingRow -= 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneCol < 7 && stoneRow > 0){
                            stoneCol += 1;
                            stoneRow -= 1;
                        }
                        else{
                            kingCol -= 1;
                            kingRow += 1;
                        }    
                    }
                }
                break;
            case "LB":
                if(kingCol == 0 || kingRow == 0){
                    break;
                }
                else{
                    kingCol -= 1;
                    kingRow -= 1;
                    if(kingCol == stoneCol && kingRow == stoneRow){
                        if(stoneCol > 0 && stoneRow > 0){
                            stoneCol -= 1;
                            stoneRow -= 1;
                        }
                        else{
                            kingCol += 1;
                            kingRow += 1;
                        }    
                    }
                }
                break;
            default:
                break;
        }
    }
}