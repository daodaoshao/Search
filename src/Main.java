import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int a[] = new int[10];
        for (int i = 0; i < 10; ++i) {
            a[i] = (int) (Math.random() * (10 - 1) + 1);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        BinarySearch binarySearch = new BinarySearch();
        int index[] = binarySearch.search(a, 3);
        System.out.println(Arrays.toString(index));
    }
}
