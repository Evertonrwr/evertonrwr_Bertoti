public class Person implements Observer{
    public int PersonNumber;
    public Person(int personNumber){
        PersonNumber = personNumber;
    }
    @Override
    public void update(TrafficLightColor color) {
        switch (color){
            case Red:
                System.out.println("Person number "+ this.PersonNumber+ " crossed the street");
                break;
            case Green:
                System.out.println("Person number "+ this.PersonNumber+ " stopped");
                break;
            case Yellow:
                System.out.println("Person number "+ this.PersonNumber+ " looked at the road ");
                break;
        }
    }
}
