import java.util.HashMap;

public class iterationofTickets {
    public static String getstart(HashMap<String,String> tick){
        HashMap<String,String> rev = new HashMap<>();
        for(String key: tick.keySet()){
            rev.put(tick.get(key),key);
        }
        for(String key: tick.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null; // Return null if no starting point is found
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai","banglore");
        tickets.put("mumbai","Delhi");
        tickets.put("goa","chennai");
        tickets.put("Delhi","goa");
        
        String start = getstart(tickets);
        while(tickets.containsKey(start)) {
            System.out.println(start);
            start = tickets.get(start);
        }System.out.println(start);
    }

}
