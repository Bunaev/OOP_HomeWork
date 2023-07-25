import java.util.ArrayList;

public class Buyer extends Human implements MarketBehaviour {
    public static int idBuyer;
    public static int idOrder;

    public Buyer(String name, int age) {
        super(name, age);
        this.idBuyer = Queue.queue.size()+1;
        this.idOrder = 0;
    }

    public static int GetIdBuyer(String name) {
        for (int i = 1; i < Queue.queue.size()+1; i++) {
            Object [] tmp = Queue.queue.get(i).toString().replaceAll("[\\[\\]]", "").split(", ");
            for (Object o : tmp) {
                if (o.equals(name)) {
                    return i;
                }
            }
        }
        return 0;
    }

        public static int GetIdBuyer () {
            return idBuyer;
        }

        public static String GetName () {
            return name;
        }

        public static String GetName(int id){
            Object [] tmp = Queue.queue.get(id).toString().replaceAll("[\\[\\]]", "").split(", ");
            return tmp[1].toString();
        }

        public static int GetIdOrder () {
            return idOrder;
        }

        public static String GetIdOrder(int id){
            Object [] tmp = Queue.queue.get(id).toString().replaceAll("[\\[\\]]", "").split(", ");
            return (String) tmp[0];
        }

        public static int GetAge() {
            return age;
        }
        public static String GetAge(int id){
            Object [] tmp = Queue.queue.get(id).toString().replaceAll("[\\[\\]]", "").split(", ");
            return (String) tmp[2];
        }

        public static void SetIdOrder (int id) {
            ArrayList<Object> info = new ArrayList<>();
            if (Market.orders.containsKey(id)) {
                info.add(Market.orders.size());
            }
            else {
                info.add(0);
            }
            info.add(GetName(id));
            info.add(GetAge(id));
            Queue.queue.put(id,info);
        }

        public static void GetFullInfo (int id) {
            if (GetIdOrder(id).equals("0")){
                System.out.println("Порядковый номер: " + id + ";\n" + "Номер заказа: Заказ еще не сделан;\n" + "Имя: " + GetName(id) + ";\n" + "Возраст: " + GetAge(id) + ";\n");
            }
            else {
                System.out.println("Порядковый номер: " + id + ";\n" + "Номер заказа: " + GetIdOrder(id) + ";\n" + "Имя: " + GetName(id) + ";\n" + "Возраст: " + GetAge(id) + ";\n");
            }
        }
        public static void AddInQueue (String name) {
            ArrayList<Object> info = new ArrayList<>();
            info.add(GetIdOrder());
            info.add(name);
            info.add(GetAge());
            Queue.queue.put(GetIdBuyer(), info);
            System.out.println(GetName() + " встал в очередь!");
        }



        public static void RemoveFromQueue (String name) {
            Queue.queue.remove(GetIdBuyer(name));
            System.out.println(name + " покинул очередь!");
        }
    }

