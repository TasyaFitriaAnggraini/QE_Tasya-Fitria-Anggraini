import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2ArrayNumberUnik2 {
    public static void main(String[] args) {
        String input = "1122";
        List<Integer> result = getUniqueNumbers(input);
        System.out.println(result);
    }

    public static List<Integer> getUniqueNumbers(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // Count the frequency of each digit
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Find the digits that appear only once
        List<Integer> result = new ArrayList<Integer>();
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                result.add(Character.getNumericValue(c));
            }
        }

        return result;
    }
}
