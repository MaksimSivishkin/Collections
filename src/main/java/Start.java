import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Start {
    public static void main(String[] args) {
        List<Integer>integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);


        for(int i=0; i<integerList.size(); i++){
            if(i%2==0){
                Collections.swap(integerList, i, i+1);
            }
        }
        System.out.println(integerList);
    }
}
