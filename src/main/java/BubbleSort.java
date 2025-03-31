import java.util.ArrayList;

public class BubbleSort {
    public static void bubbleSortArray(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSortList(int[] intArray) {

        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted=true;
            for (int i = 0; i < intArray.length - 1; i++){
                if (intArray[i]>intArray[i+1]) {
                    isSorted=false;

                    buf=intArray[i];
                    intArray[i]=intArray[i+1];
                    intArray[i+1]=buf;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }
}
