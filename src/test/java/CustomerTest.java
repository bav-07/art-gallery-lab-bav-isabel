import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork desiredArtwork;
    Artwork artwork1;
    Artwork artwork2;
    Artwork artwork3;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Montgomery", 3000000);
        Artist artist1 = new Artist("Vincent");
        artwork1 = new Artwork("Starry night", artist1, 999999, "NFT1");
        Artist artist2 = new Artist("Monet");
        artwork2 = new Artwork("The Water Lilies", artist2, 999999, "NFT2");
        Artist artist3 = new Artist("Picasso");
        artwork3 = new Artwork("Self-portrait", artist3, 999999, "NFT3");
        ArrayList<Artwork> stock = new ArrayList<>();
        stock.add(artwork1);
        stock.add(artwork2);
        stock.add(artwork3);
        gallery = new Gallery("Gallery", stock);

        desiredArtwork = new Artwork("Self-portrait", artist3, 999999, "NFT3");
    }

    @Test
    public void canBuyArtwork(){

        customer.buyArtwork(gallery, desiredArtwork);
        assertThat(gallery.getTill()).isEqualTo(999999);
        assertThat(customer.getWallet()).isEqualTo(2000001);
        assertThat(gallery.getStock().size()).isEqualTo(2);
        assertThat(customer.getArtCollection().size()).isEqualTo(1);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Montgomery");
    }

    @Test
    public void canSetName(){
        customer.setName("Gunther");
        assertThat(customer.getName()).isEqualTo("Gunther");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(3000000);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(0);
        assertThat(customer.getWallet()).isEqualTo(0);
    }

    @Test
    public void hasArtCollection(){
        assertThat(customer.getArtCollection()).isEmpty();
        customer.buyArtwork(gallery,desiredArtwork);
        assertThat(customer.getArtCollection().get(0)).isEqualTo(desiredArtwork);
    }

    @Test
    public void canSetArtCollection(){
        ArrayList<Artwork> newCollection = new ArrayList<Artwork>();
        newCollection.add(artwork1);
        newCollection.add(artwork2);
        customer.setArtCollection(newCollection);
        assertThat(customer.getArtCollection().size()).isEqualTo(2);
    }

}
