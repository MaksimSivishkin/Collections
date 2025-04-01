import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Start {
    public static void main(String[] args) {
        ArrayList<String>wards=new ArrayList<>(Arrays.asList("Лес","Погода","Земля","Солнце","Свет","Дождь"));
        Stream<String> stream=wards.stream();
        StreamString.getStringFromStream(stream);
    }
}
