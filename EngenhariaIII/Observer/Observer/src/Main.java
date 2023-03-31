public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Cars are running and people are waiting");
        TrafficLight trafficLight = new TrafficLight();
        for(var n =1 ; n<=5 ; n++){
            Car car = new Car(n);
            Person person = new Person(n);
            trafficLight.register(car);
            trafficLight.register(person);

        }

        System.out.println("Green color");
        trafficLight.notify(TrafficLightColor.Green);
        new Thread().sleep(1000);
        System.out.println("Yellow color");
        trafficLight.notify(TrafficLightColor.Yellow);
        new Thread().sleep(1000);
        System.out.println("Red color");
        trafficLight.notify(TrafficLightColor.Red);

    }
}