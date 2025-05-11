import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args){
        HashMap<String, String> capital = new HashMap<>();
        capital.put("USA", "New York");
        capital.put("France", "Paris");
        capital.put("Germany", "Berlin");
        capital.put("England", "London");

        //To get a value in the element
        System.out.println("The capital of Germany is " + capital.get("Germany"));

        //To remove a value
        System.out.println("The capital remove is " + capital.remove("France"));

        //replace an item in the
        capital.replace("England", "Manchester");

        //Iterate on map
        for(Map.Entry<String, String> item: capital.entrySet()){
            System.out.println(
                    "Country: " + item.getKey() +
                            ", Capital: " + item.getValue());
        }
    }
}
