import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Challenge.bottleChallenge();

        int n = 10 ;
        for (int i = 0; i < n ; i++) {
            System.out.println(Challenge.recursiveFibonacci(i));
        }
//        LearningComparator.checkComparator();
//        TestPerformanceCollections.testArrayListPerformance(20000, "HS");
//        TestPerformanceCollections.testArrayListPerformance(20000, "AL");
//        TestPerformanceCollections.testArrayListPerformance(20, "");
//        LearningComparator.checkComparatorWithLambda();
//
//        String filename ="src\\text.txt";
//        TestFile.readFile(filename);
//        TestFile.writeFile();
//        System.out.println("Using Print Stream");
//        TestFile.readFromInputUserSaveFile(filename);
//
//        TestThread p1 = new TestThread();
//        p1.setId(1);
//
//        Thread t1 = new Thread(p1);
//        t1.start();
//
//        TestThread p2 = new TestThread();
//        p1.setId(2);
//
//        Thread t2 = new Thread(p2);
//        t2.start();
        //Ideally we should have another program to play the Client
        //SocketServer.startServer();
        //SocketClient.startClient();

        //GuessGame game = new GuessGame();
        //game.startGame();

        DateTimeUpdates.samplePeriod();
        DateTimeUpdates.zoneIdSample();

    }
}