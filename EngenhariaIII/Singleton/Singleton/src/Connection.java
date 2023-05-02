public class Connection {
    private static Connection uniqueInstance;
    private Connection(){}

    public static Connection getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Connection();
        }
        return uniqueInstance;
    }
    public void getConnection(){
        System.out.println("Now your connected to a database.");
    }

}
