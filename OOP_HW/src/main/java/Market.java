import java.util.LinkedHashMap;

public class Market implements QueueBehaviour {
    public static LinkedHashMap<Integer,Integer> orders;

    public Market(LinkedHashMap orders){
        this.orders = orders;
    }
    public static void TakeOrder(String name){
        orders.put(Buyer.GetIdBuyer(name), orders.size()+1);
        System.out.println("Покупатель " + Buyer.GetName(Buyer.GetIdBuyer(name)) + " с порядковым номером " + Buyer.GetIdBuyer(name) + " сделал заказ.");
        Buyer.SetIdOrder(Buyer.GetIdBuyer(name));
    }

    public static void MakeOrder(String name){
        orders.remove(Buyer.GetIdBuyer(name));
        System.out.println("Покупатель " + Buyer.GetName(Buyer.GetIdBuyer(name)) + " с порядковым номером " + Buyer.GetIdBuyer(name) + " получил свой заказ.");
        Buyer.SetIdOrder(Buyer.GetIdBuyer(name));
    }
}
