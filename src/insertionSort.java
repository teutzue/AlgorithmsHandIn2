
/**
 * Created by CosticaTeodor on 09/03/2017.
 */
public class insertionSort {

    public static void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
    }
}
