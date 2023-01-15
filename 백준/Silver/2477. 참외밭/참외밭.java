import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Item[] itemList = new Item[6];
        int[] count = new int[5];
        int smallArea = 1;
        int area = 1;

        for(int i = 0 ; i < 6 ; i++){
            String[] temp = br.readLine().split(" ");
            int direction = Integer.parseInt(temp[0]);
            int distance = Integer.parseInt(temp[1]);
            itemList[i] = new Item(direction, distance);
            count[direction] += 1;
        }

        for(int i = 0 ; i < 6 ; i++){
            if(count[itemList[i].direction] == 1){
                area *= itemList[i].distance;
            }
            else{
                if(i == 0){
                    if(count[itemList[0].direction] == 2 && count[itemList[1].direction] == 2 && count[itemList[5].direction] == 2){
                        smallArea *= itemList[0].distance;
                    }
                }
                else if(i == 5){
                    if(count[itemList[5].direction] == 2 && count[itemList[0].direction] == 2 && count[itemList[4].direction] == 2){
                        smallArea *= itemList[5].distance;
                    }
                }
                else{
                    if(count[itemList[i].direction] == 2 && count[itemList[i + 1].direction] == 2 && count[itemList[i - 1].direction] == 2){
                        smallArea *= itemList[i].distance;
                    }
                }
            }
        }

        int result = (area - smallArea) * K;
        System.out.println(result);
    }
    
    public static class Item{
        int direction;
        int distance;
        
        public Item(int direction, int distance){
            this.direction = direction;
            this.distance = distance;
        }
    }
}