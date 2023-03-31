public interface Subject {
    void register(Observer o);
    void notify(TrafficLightColor color) throws InterruptedException;

}
