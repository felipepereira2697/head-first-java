import java.io.IOException;

public class SongMainClass {
    public static void main(String[] args)  {
        Song am = new Song();
        am.setArtist("Arctic Monkeys");
        am.setTitle("505");
        System.out.println(am.play());

    }

}
