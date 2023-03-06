package Review4;
import java.util.HashMap;
import java.util.Map;
public class CharCount {
        public static void main(String[] args) {
            String input = "Absbsbbd";
            Map<Character, Integer> counts = new HashMap<>();

            for (char c : input.toCharArray()) {
                if (counts.containsKey(c)) {
                    counts.put(c, counts.get(c) + 1);
                } else {
                    counts.put(c, 1);
                }
            }
            for (char c : counts.keySet()) {
                System.out.println(c + " = " + counts.get(c));
            }
        }
    }
 
