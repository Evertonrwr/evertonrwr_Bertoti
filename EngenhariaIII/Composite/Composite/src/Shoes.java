import javax.xml.namespace.QName;

public class Shoes implements Details{
    int Price;
    String Name;
    String Brand;
    public Shoes(int price,String name, String brand){
        this.Price = price;
        this.Name = name;
        this.Brand = brand;

    }

    @Override
    public void getDetails() {
        System.out.println(this.Brand+"'s "+ this.Name + " $" +this.getPrice());
    }

    @Override
    public int getPrice() {
        return this.Price;
    }
}
