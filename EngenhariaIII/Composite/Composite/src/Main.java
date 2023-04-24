public class Main {
    public static void main(String[] args) {
        Shoes shoe1 = new Shoes(100, "550", "New Balance");
        Shoes shoe2 = new Shoes(100, "Air force 1", "Nike");
        Shoes shoe3 = new Shoes(150, "Blazer mid", "Nike");
        ShoesStore store = new ShoesStore();
        store.addItems(shoe1);
        store.addItems(shoe2);
        store.addItems(shoe3);

        System.out.println("Welcome!");
        System.out.println("These are our available shoes");
        store.getDetails();

        System.out.println("Nice! I'll get all");
        System.out.println("Wow, ok! Your total will be: $" + store.getPrice());

    }
}