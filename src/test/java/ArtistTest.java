import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtistTest {

    private Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Vincent");
    }

    @Test
    public void hasName(){
        // Arrange
        // Act
        String name = artist.getName();
        // Assert
        assertThat(name).isEqualTo("Vincent");
    }

    @Test
    public void canSetName(){
        // Arrange
        // Act
        artist.setName("Monet");
        assertThat(artist.getName()).isEqualTo("Monet");
    }

}
