
class Product {
    private String name;
    private final double price;
    private int count;
    private double volume;

    public Product (String name, double price, int count, double volume){
        this.name = name;
        this.price = price;
        this.count = count;
        this.volume = volume;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public  double getPrice(){
        return price;
    }

    public void setPrice(){
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    public String toString(){
        return "Родительский класс {" + "Наименование = " + name + ", цена = " + price + " руб., количество = " + count + " ед., объем 1 ед. = " + volume + " мл.}";
    }
}

class HotDrink extends Product{
    private final int tempereture;

    public HotDrink(String name, double price, int count, double volume, int tempereture){
        super(name,price,count,volume);
        this.tempereture = tempereture;
    }

    public String toString(){
        return "Наследник {" + "Наименование = " + super.getName() + ", цена = " + super.getPrice() + " руб., количество = " + super.getCount() + " ед., температура = " + tempereture + "°С, объем 1 ед. = " + super.getVolume() + " мл.}";
    }
}

public class Task_001 {
    public static void main(String[] args) {
        Product lemonade = new Product("Pepsi", 70.0, 10, 0.4);
        HotDrink coffee = new HotDrink("Кофе", 65.0, 10, 0.3, 90);
        HotDrink tea = new HotDrink("Чай", 30.0, 15, 0.4, 90);
        HotDrink hotChocolate = new HotDrink("Горячий шоколад", 75.0, 8, 0.3, 80);

        System.out.println(coffee.toString());
        System.out.println(tea.toString());
        System.out.println(hotChocolate.toString());
        System.out.println(lemonade.toString());
    }
}

