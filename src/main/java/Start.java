import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));

        Class catNull = cat.getClass();
        for (Field field: catNull.getDeclaredFields()){
            try {
                field.setAccessible(true);
                field.set(cat, null);
            } catch (IllegalAccessException | NullPointerException | IllegalArgumentException e) {
                System.err.println("Не удалось обнулить поле <"+field.getName()+"> так как это примитив!");
            }
        }
        System.out.println(cat);
    }
}
