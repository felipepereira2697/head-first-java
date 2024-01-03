import java.sql.Array;
import java.util.*;

public class TestPerformanceCollections {
//    This class wants to perform couple of tests on collection performance

    public static void testArrayListPerformance(int n, String collectionType) {
        System.out.println("Starting...");
//        Instantiating this way it's nice because we can use polimorphism and depending on the parameter.
//        we can use the same variable to instantiate different types of Collections
//        Here what makes difference between implementations is the searching
//        Searching takes a lot more time on ArrayList in comparison of HashSets.
        Collection<Integer> test;
        if(collectionType.equals("AL")) {
            test = new ArrayList<>();
        } else if(collectionType.equals("HS")){
            test = new HashSet<>();
        } else {
            test = new LinkedList<>();
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            test.add(i);
        }

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time to insert in testArrayListPerformance with "+n+" records is "+time);

        start = System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            test.contains(i);
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("Time to search in testArrayListPerformance with "+n+" records is "+time);



    }
}
