import java.util.ArrayList;

public class Gallery {

    private String  name;
    private long till;
    private ArrayList<Artwork> stock;

    public Gallery (String name, ArrayList<Artwork> stock){
        this.name = name;
        this.stock = stock;
        this.till = 0;
    }

    // Method
    public long stock_take(){
        
        long totalValue = 0;
        for (Artwork artwork : this.stock){
            totalValue += artwork.getPrice();
        }
        return totalValue;
    }


    // Getters & setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public long getTill(){
        return this.till;
    }
    public void setTill(long till){
        this.till = till;
    }

    public ArrayList<Artwork> getStock (){
        return this.stock;
    }
    public void setStock (ArrayList<Artwork> stock){
        this.stock = stock;
    }


}
