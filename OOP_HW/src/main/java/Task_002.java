import java.util.*;

public class Task_002 {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList> buyers = new LinkedHashMap<>();
        HashMap<Integer,Integer> market = new LinkedHashMap<>();
        Market orders = new Market((LinkedHashMap) market);
        Queue queue = new Queue((LinkedHashMap) buyers);
        Buyer jo = new Buyer("Jon",  25);
        Buyer.AddInQueue("Jon");
        Market.TakeOrder("Jon");
        Buyer ashley = new Buyer("Ashley",  27);
        Buyer.AddInQueue("Ashley");
        Buyer alex = new Buyer("Alex", 32);
        Buyer.AddInQueue("Alex");
        Market.MakeOrder("Jon");
        Buyer.RemoveFromQueue("Jon");
        Market.TakeOrder("Ashley");

    }
}
