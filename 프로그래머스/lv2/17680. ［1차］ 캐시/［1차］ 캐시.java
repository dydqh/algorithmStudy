import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int result = 0;
        List<String> cache = new ArrayList<>();
        
        for(int i = 0 ; i < cities.length ; i++){
            if(cacheSize == 0){
                result += 5;
            }
            // cache miss
            else if(!cache.contains(cities[i].toLowerCase())){
                if(cache.size() == cacheSize){
                    cache.remove(cache.get(0));
                }
                cache.add(cities[i].toLowerCase());
                result += 5;
            }
            // cache hit
            else{
                cache.remove(cities[i].toLowerCase());
                cache.add(cities[i].toLowerCase());
                result += 1;
            }
        }
        
        return result;
    }
}