import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Challenge.bottleChallenge();

        int n = 10 ;
        for (int i = 0; i < n ; i++) {
            System.out.println(Challenge.recursiveFibonacci(i));
        }

        Song music = new Song();
        music.setTitle("The Long and Winding Road");
        music.setArtist("The Beatles");
        System.out.println(music.play());

        LearningComparator.checkComparator();
        TestPerformanceCollections.testArrayListPerformance(20000, "HS");
        TestPerformanceCollections.testArrayListPerformance(20000, "AL");
        TestPerformanceCollections.testArrayListPerformance(20, "");
        LearningComparator.checkComparatorWithLambda();

        TestFile.readFile("src\\text.txt");

    }
}