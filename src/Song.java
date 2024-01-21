public class Song {

    //Instance variables: things the object KNOWS
    //Encapsulation plays a big part here to avoid code to be add anything that is inappropriate.
    //We force this making the rest of the code go through setter methods and validate the parameter.
    private String title;
    private String artist;

    public Song(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Methods - Behavior, things the object DOES
    public void setArtist(String artist) {
        if( artist != null && !artist.isBlank()) {
            this.artist = artist;
            return;
        }
        throw new IllegalArgumentException("Artists cannot be empty");
    }

    //    Things that an object DOES
    public String play() {
        return "Now playing "+this.title+" from "+this.artist;
    }
    public String getTitle() {
        return this.title;
    }
}
