import java.util.HashMap;
import java.util.Map;

public class Test6 {
    public static void main(String[] args){
        String a = "tactcoa";
        char[] charArray = a.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < a.length(); i++){
            if(!map.containsKey(charArray[i])){
                map.put(charArray[i],1);
            }else{
                map.put(charArray[i],map.get(charArray[i]) + 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if(entry.getValue() % 2 != 0){
                count++;
                if(count > 1){
                    System.out.print("false");
                }
            }
        }
        System.out.print(map.toString());
    }
}
