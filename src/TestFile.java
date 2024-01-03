import java.io.*;
import java.util.Scanner;

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

    public static void writeFile() {

        try {
            OutputStream os = new FileOutputStream("src//text.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("test26");
            bw.newLine();
            bw.write("testing");
            bw.close();
        }catch (IOException io) {
            System.out.println(io.getMessage());
        }

    }


    public static void readFromInputUserSaveFile(String filename) throws FileNotFoundException {
        //Waits on user inputs and after program finishes it saves in the text2.txt file
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("text2.txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }



    }
}
