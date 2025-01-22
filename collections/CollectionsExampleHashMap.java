package collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsExampleHashMap {
    //Stores in form of key-value pairs. Used for lookups, storage, and retrieval.
    //Fast Access O(1) Average.
    //Common Methods: put(key,value), get(key), remove(key), containsKey(key), containsValue(value), size(), keySet(), values(), entrySet().
    public static void main(String[] args) {
        HashMap <String,Integer> credit_score = new HashMap<>();
        credit_score.put("Sanha", 750);
        credit_score.put("Emily", 500);
        credit_score.put("Josh", 670);

        System.out.println(credit_score.containsKey("Sanha"));
        System.out.println(credit_score.containsValue(670));
        System.out.println(credit_score.get("Josh"));
        System.out.println(credit_score.size());

        for (Integer score: credit_score.values()) {
            System.out.println(score);
        }

        for (Map.Entry<String,Integer> entry: credit_score.entrySet()) {
            System.out.println(entry);
        }
    }
}
