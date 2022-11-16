public class Artwork {

    private String title;
    private Artist artist;
    private long price;
    private String nft;

    public Artwork(String title, Artist artist, long price, String nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public Artist getArtist(){
        return this.artist;
    }
    public void setArtist(Artist artist){
        this.artist = artist;
    }

    public long getPrice(){
        return this.price;
    }
    public void setPrice(long price){
        this.price = price;
    }

    public String getNft(){
        return this.nft;
    }
    public void setNft(String nft){
        this.nft = nft;
    }

}