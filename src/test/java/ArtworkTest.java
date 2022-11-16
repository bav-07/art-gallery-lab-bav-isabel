import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtworkTest {

    private Artwork artwork;
    private Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Vincent");
        artwork = new Artwork("Starry night", artist, 999999, "NFT");
    }

    @Test
    public void hasTitle(){
        // Arrange
        // Act
        String title = artwork.getTitle();
        // Assert
        assertThat(title).isEqualTo("Starry night");
    }

    @Test
    public void canSetTitle(){
        // Arrange
        // Act
        artwork.setTitle("Self-portrait");
        assertThat(artwork.getTitle()).isEqualTo("Self-portrait");
    }

    @Test
    public void hasArtist(){
        Artist artist = artwork.getArtist();
        String artistName = artist.getName();
        assertThat(artistName).isEqualTo("Vincent");
    }

    @Test
    public void canSetArtist(){
        Artist newArtist = new Artist("Monet");
        artwork.setArtist(newArtist);
        assertThat(artwork.getArtist().getName()).isEqualTo("Monet");
    }

    @Test
    public void hasPrice(){
        long price = artwork.getPrice();
        assertThat(price).isEqualTo(999999);
    }

    @Test
    public void setPrice(){
        // Act
        artwork.setPrice(500000);
        assertThat(artwork.getPrice()).isEqualTo(500000);
    }

    @Test
    public void hasNft(){
        String nft = artwork.getNft();
        assertThat(nft).isEqualTo("NFT");
    }

    @Test
    public void setNft(){
        // Act
        artwork.setNft("NFT2");
        assertThat(artwork.getNft()).isEqualTo("NFT2");
    }

}
