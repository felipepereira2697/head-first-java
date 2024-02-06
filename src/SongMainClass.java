import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SongMainClass {
    public static void main(String[] args)  {
        Song am = new Song();
        am.setArtist("Arctic Monkeys");
        am.setTitle("505");
        Song beatles = new Song();
        beatles.setArtist("The Beatles");
        beatles.setTitle("The Long and Winding Road");
        List<Song> songList = new ArrayList<Song>();
        songList.add(am);
        songList.add(beatles);

        //Using Enhanced for
        for(Song item : songList) {
            System.out.println(item.play());
        }




    }

}
