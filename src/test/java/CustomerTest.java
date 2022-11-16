import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork desiredArtwork;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Montgomery", 3000000);
        Artist artist1 = new Artist("Vincent");
        Artwork artwork1 = new Artwork("Starry night", artist1, 999999, "NFT1");
        Artist artist2 = new Artist("Monet");
        Artwork artwork2 = new Artwork("The Water Lilies", artist2, 999999, "NFT2");
        Artist artist3 = new Artist("Picasso");
        Artwork artwork3 = new Artwork("Self-portrait", artist3, 999999, "NFT3");
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

}
