public class Main {
    public static void main(String[] args) {
        Challenge.bottleChallenge();

        int n = 10 ;
        for (int i = 0; i < n ; i++) {
            System.out.println(Challenge.recursiveFibonacci(i));
        }

        Song music = new Song();
        music.setTitle("The Long and Winding Road");
        music.setArtist("The Beatles");
        System.out.println(music.play());

        TestPerformanceCollections.testArrayListPerformance(200000, "HS");
        TestPerformanceCollections.testArrayListPerformance(200000, "AL");
        TestPerformanceCollections.testArrayListPerformance(200000, "");
    }
}