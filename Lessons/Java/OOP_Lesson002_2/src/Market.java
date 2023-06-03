import java.util.*;

public class Market implements MarketBehaivour, QueueBehaviour{
    private List<Human> humansInMarket;
    private Queue<Human> humansQueue;
    public Market() {
        this.humansQueue = new LinkedList<>();
        this.humansInMarket = new ArrayList<>();
    }
    @Override
    public void acceptToMarket(Human human) {
        humansInMarket.add(human);
    }
    @Override
    public void releaseFromMarket(Human human) {
        humansInMarket.remove(human);
    }
    @Override
    public void takeQueue(Human human) {
        humansQueue.offer(human);
    }
    @Override
    public void takeOrders() {
        humansQueue.peek().setMakeOrder();
    }
    @Override
    public void givenOrders() {
        humansQueue.peek().setTakeOrder();
    }
    @Override
    public void releaseFromQueue() {
        System.out.println("Good buy " + humansQueue.peek().name);
        releaseFromMarket(humansQueue.poll());
        System.out.println("Humans in market " + humansInMarket.size());
    }
    public void update(){
        for(Human h : humansInMarket){
            humansQueue.offer(h);
        }
        while (!humansQueue.isEmpty()){
            takeOrders();
            givenOrders();
            releaseFromQueue();
        }
        System.out.println("Queue is empty");
    }
}
