import java.io.*;

public class TestFile {

    public static void readFile(String filename) {
        try {
            InputStream is = new FileInputStream(filename);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            while(line != null ) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
