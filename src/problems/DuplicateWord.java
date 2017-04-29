package problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        displayDuplicates(str);
    }
    	public static void displayDuplicates(String str){
    		
    		Map<Character,Integer> map = new HashMap<>();
    		
    		char [] characters=str.toCharArray();
    		
    		for(char c : characters){
    			
    			if(!map.containsKey(c)){
    				
    				map.put(c, 1);
    				
    			}else{
    				
    				map.put(c, map.get(c)+1);
    				
    				}
    			
    			Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
    			for(Map.Entry<Character, Integer> entry : entrySet){
    				if(entry.getValue()>1){
    					System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
    				}
    			}
    		}
    		
    	}
}
