public class Car implements Observer{
    public int CarNumber;
    public Car(int carNumber){
        CarNumber = carNumber;
    }
    @Override
    public void update(TrafficLightColor color) {
        switch (color){
            case Red:
                System.out.println("Car number "+ this.CarNumber+ " stopped");
                break;
            case Green:
                System.out.println("Car number "+ this.CarNumber+ " passes the traffic light");
                break;
            case Yellow:
                System.out.println("Car number "+ this.CarNumber+ " reduced the speed");
                break;
        }
    }
}
