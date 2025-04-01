import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamList {
    public static Stream printList(ArrayList<Integer> list) {
        Stream<Integer> stream=list.stream();
        stream.forEach(i -> System.out.println(i));
        return stream;
    }
}
