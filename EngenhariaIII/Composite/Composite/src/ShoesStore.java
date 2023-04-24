import java.util.ArrayList;

public class ShoesStore implements Details{
    private ArrayList<Shoes> shoesList = new ArrayList<Shoes>();
    public void addItems(Shoes shoe){
        shoesList.add(shoe);
    }
    @Override
    public void getDetails() {
        for(Shoes shoe: shoesList){
            shoe.getDetails();
        }

    }

    @Override
    public int getPrice() {
        int total = 0;
        for(Shoes shoe: shoesList){
           total = total +  shoe.getPrice();
        }
        return total;
    }
}
