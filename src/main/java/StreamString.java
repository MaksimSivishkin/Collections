import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;

public class StreamString {
    public static String getStringFromStream(Stream<String> stringStream) {
        stringStream.forEach(i-> out.print(i+" "));
        return stringStream.toString();
    }
}
