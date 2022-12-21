import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int priceCount = Integer.parseInt(input.split(" ")[0]);
        int recipeCount = Integer.parseInt(input.split(" ")[1]);

        Map<String, Double> priceMap = new HashMap<>();
        Queue<String> recipeQueue = new LinkedList<>();
        //Map<String, Boolean> whileBreak = new HashMap<>();

        for(int i = 0 ; i < priceCount; i++){ 
            input = br.readLine();
            priceMap.put(input.split(" ")[0], Double.parseDouble(input.split(" ")[1]));
        }

        if(recipeCount != 0){
            for(int i = 0 ; i < recipeCount; i++){
                input = br.readLine();
                recipeQueue.add(input);
                //whileBreak.put(input, false);
            }

            int recipeQueueSize = recipeQueue.size();
            int whileBreakCount = recipeQueueSize;

            while(true){
                String currentInput = recipeQueue.poll();
                String currentInputKey = currentInput.split("=")[0];
                recipeQueue.add(currentInput);

                if(calcPrice(currentInput, priceMap) != null){
                    Double curPrice = priceMap.get(currentInputKey);
                    Double newPrice = calcPrice(currentInput, priceMap).get(currentInputKey);
                    Double updatedPrice = (curPrice != null && curPrice >= newPrice) ? newPrice : curPrice;

                    if(priceMap.containsKey(currentInputKey)){
                        priceMap.put(currentInputKey, curPrice >= newPrice ? newPrice : curPrice);
                    }
                    else{
                        priceMap.put(currentInputKey, newPrice);
                    }

                    if(curPrice != null && Double.compare(curPrice, updatedPrice) == 0){
                        //whileBreak.put(currentInput, true);
                        whileBreakCount -= 1;
                    }
                    else{
                        whileBreakCount = recipeQueueSize;
                        // for(String whileBreakKey : whileBreak.keySet()){
                        //     whileBreak.put(whileBreakKey, false);
                        // }
                    }
                }
                else{
                    //whileBreak.put(currentInput, true);
                    whileBreakCount -= 1;
                }
    
                // for(String whileBreakKey : whileBreak.keySet()){
                //     if(whileBreak.get(whileBreakKey) == true){
                //         whileBreakCount -= 1;
                //     }
                // }
    
                // if(whileBreakCount > 0){
                //     whileBreakCount = recipeQueueSize;
                // }
                // else{
                //     break;
                // }
                if(whileBreakCount == 0){
                    break;
                }
            }
        }

        if(priceMap.containsKey("LOVE")){
            System.out.println((int) Math.round(priceMap.get("LOVE")));
        }
        else{
            System.out.println("-1");
        }
    }

    public static Map<String, Double> calcPrice(String input, Map<String, Double> priceMap){
        Map<String, Double> result = new HashMap<>();
        String key = input.split("=")[0];
        String value = input.split("=")[1];

        if(value.contains("+")){                
            String[] valueItem = value.split("\\+");
            double price = 0;
            int matching = valueItem.length;

            for(int i = 0 ; i < valueItem.length ; i++){
                String targetString = getTargetString(valueItem[i]);
                Double targetDouble = getTargetDouble(valueItem[i]);

                if(priceMap.containsKey(targetString)){
                    price += targetDouble * priceMap.get(targetString);
                    if(price > 1000000000){
                        price = 1000000001;
                    }
                    matching -= 1;
                }
                else{
                    break;
                }
            }

            if(matching == 0){
                result.put(key, price);
                return result;
            }
            else{
                return null;
            }
        }
        else{
            double price = 0;
            
            String targetString = getTargetString(value);
            Double targetDouble = getTargetDouble(value);

            if(priceMap.containsKey(targetString)){
                price += targetDouble * priceMap.get(targetString);
                if(price > 1000000000){
                    price = 1000000001;
                }
                result.put(key, price);
                return result;
            }
            else{
                return null;
            }
        }
    }

    public static String getTargetString(String s) {
        if(s.charAt(1) >= 48 && s.charAt(1) <= 57){
            return s.substring(2, s.length());
        }
        else if(s.charAt(0) >= 48 && s.charAt(0) <= 57){
            return s.substring(1, s.length());
        }
        else{
            return null;
        }
    }

    public static Double getTargetDouble(String s) {
        if(s.charAt(1) >= 48 && s.charAt(1) <= 57){
            return Double.parseDouble(s.substring(0, 2));
        }
        else if(s.charAt(0) >= 48 && s.charAt(0) <= 57){
            return Double.parseDouble(s.substring(0, 1));
        }
        else{
            return null;
        }
    }
}