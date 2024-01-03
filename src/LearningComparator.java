import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearningComparator {

    public static void checkComparator() {
        List<String> names = new ArrayList<>();
        names.add("Arya Stark of Winterfell");
        names.add("Jon Snow");
        names.add("Daenerys Targaryen");
        names.add("Ned Stark");
        names.add("Tyrion Lannister");
        names.add("Aegon Targaryen");
        names.add("Khal Drogo");

        //Comparator with anonymous class
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s, String t1) {
                return Integer.compare(s.length(), t1.length());
            }
        };

        names.sort(comparator);
        System.out.println(names);




    }
}
