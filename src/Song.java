public class Song {

    //Instance variables: things the object KNOWS
    //Encapsulation plays a big part here to avoid code to be add anything that is inappropriate.
    //We force this making the rest of the code go through setter methods and validate the parameter.
    //Instance variables are declared inside a class but no within a method.
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
        //Local variables do not get a default value, please initialize them.
        //for this example, I'll keep in that way.
        String musicDetails = "Now playing "+this.title+" from "+this.artist;
        return musicDetails;
    }
    public String getTitle() {
        return this.title;
    }
}
