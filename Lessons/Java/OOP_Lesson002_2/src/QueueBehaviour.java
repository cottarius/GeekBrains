public interface QueueBehaviour {
    void takeQueue(Human human);
    void takeOrders();
    void givenOrders();
    void releaseFromQueue();
}
