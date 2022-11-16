import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp(){
        //
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
    }

    @Test
    public void can_stock_take(){
        assertThat(gallery.stock_take()).isEqualTo(2999997);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Gallery");
    }

    @Test
    public void canSetName(){
        gallery.setName("Victoria & Albert");
        assertThat(gallery.getName()).isEqualTo("Victoria & Albert");
    }

    @Test
    public void hasStock(){
        Artwork artwork1 = gallery.getStock().get(0);
        Artwork artwork2 = gallery.getStock().get(1);
        Artwork artwork3 = gallery.getStock().get(2);

        assertThat(artwork1.getTitle()).isEqualTo("Starry night");
        assertThat(artwork2.getTitle()).isEqualTo("The Water Lilies");
        assertThat(artwork3.getTitle()).isEqualTo("Self-portrait");

    }

    @Test
    public void canSetStock(){
        Artist artist4 = new Artist("Manet");
        Artwork artwork4 = new Artwork("Landscape", artist4, 999999, "NFT4");
        ArrayList<Artwork> newStock = new ArrayList<>();
        newStock.add(artwork4);
        gallery.setStock(newStock);
        assertThat(gallery.getStock().get(0).getTitle()).isEqualTo("Landscape");
    }

    @Test
    public void hasTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(100);
        assertThat(gallery.getTill()).isEqualTo(100);
    }

}
