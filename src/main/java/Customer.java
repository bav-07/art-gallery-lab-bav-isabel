import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private long wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, long wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    public void buyArtwork(Gallery gallery, Artwork desiredArtwork){

        // go through every artwork in the gallery stock
        // if the customer's desired artwork is found
        // subtract money from customer's wallet
        // add money to gallery's till
        // remove artwork from gallery's stock
        // add artwork to customer's artCollection
        
        boolean canBuy = false;
        long currentTill = gallery.getTill();
        ArrayList<Artwork> stock = gallery.getStock();
        int index = 0;

        for (int i = 0; i < stock.size(); i++) {
            if (desiredArtwork.getTitle() == stock.get(i).getTitle()){

                canBuy = true;
                index = i;

            }
        }

        if (canBuy) {
            wallet -= desiredArtwork.getPrice();
            gallery.setTill(currentTill + desiredArtwork.getPrice());

            stock.remove(index);
            gallery.setStock(stock);
            artCollection.add(desiredArtwork);
        }

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public long getWallet(){
        return this.wallet;
    }
    public void setWallet(long wallet){
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getArtCollection(){
        return this.artCollection;
    }
    public void setArtCollection(ArrayList<Artwork> artCollection){
        this.artCollection = artCollection;
    }

}
