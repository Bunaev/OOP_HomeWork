import java.util.LinkedHashMap;

public class Queue {
    public static LinkedHashMap queue;

    public Queue(LinkedHashMap queue){
        this.queue = queue;
    }

    public LinkedHashMap GetQueue(){
        return queue;
    }
}