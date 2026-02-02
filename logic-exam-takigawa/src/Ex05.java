import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        String[] sports = { "soccer", "baseball", "jogging", "jogging",
                "soccer", "surfing", "surfing", "soccer",
                "surfing", "baseball", "boxing", "surfing",
                "soccer", "surfing", "jogging", "boxing", "jogging",
                "baseball", "soccer", "soccer" };

        Map<String, Integer> countMap = new HashMap<>();

        for (String sport : sports) {
            if (countMap.containsKey(sport)) {
                countMap.put(sport, countMap.get(sport) + 1);
            } else {
                countMap.put(sport, 1);
            }
        }

        String maxSport = null;
        int maxCount = 0;

        Set<String> keySet = countMap.keySet();
        for (String key : keySet) {
            int count = countMap.get(key);
            if (count > maxCount) {
                maxCount = count;
                maxSport = key;
            }
        }
        System.out.println("最も出現回数の多いスポーツは " + maxSport + " で、出現回数は " + maxCount + " 回です");
    }
}
