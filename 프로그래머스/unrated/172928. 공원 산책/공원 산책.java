class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        
        for(int i = 0 ; i < park.length ; i++){
            if(park[i].indexOf("S") > -1){
                x = park[i].indexOf("S");
                y = i;
                break;
            }
        }
        
        for(int i = 0 ; i < routes.length ; i++){
            String[] route = routes[i].split(" ");
            String direction = route[0];
            int distance = Integer.parseInt(route[1]);

            int[] result = move(park, x, y, distance, direction);
            x = result[0];
            y = result[1];
        }
        
        return new int[]{y, x};
    }
    
    public static int[] move(String[] park, int x, int y, int distance, String direction){
        boolean isPossible = true;
        int count = 0;

        for(int i = 0 ; i < distance ; i++){
            switch(direction){
                case "W":
                    x--;
                    break;
                case "E":
                    x++;
                    break;
                case "N":
                    y--;
                    break;
                case "S":
                    y++;
                    break;
                default:
                    break;
            }

            count++;

            if(park.length <= y || y < 0 || park[y].length() <= x || x < 0){
                isPossible = false;
                break;
            }

            if(park[y].charAt(x) == 'X'){
                isPossible = false;
                break;
            } 
        }
        
        if(!isPossible){
            switch(direction){
                case "W":
                    x += count;
                    break;
                case "E":
                    x -= count;
                    break;
                case "N":
                    y += count;
                    break;
                case "S":
                    y -= count;
                    break;
                default:
                    break;
            }
        }
        
        return new int[]{x, y};
    }
}