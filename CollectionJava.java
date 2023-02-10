import java.util.*;
import java.util.stream.Stream;

public class CollectionJava {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(11) ;
        set.add(3) ;
        set.add(6) ;

        Stream<Integer> stream = set.stream();
        stream.forEach((x) -> {System.out.println(x);});

    }

}

