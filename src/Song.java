public class Song {

//    Instance variables: things the object KNOWS
    private String title;
    private String artist;

    public Song(){

    }
    public void setTitle(String title) {
        this.title = title;
    }

    //Methods - Behavior, things the object DOES
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String play() {
        return "Now playing "+this.title+" from "+this.artist;
    }
}
