import java.util.ArrayList;
import java.util.List;

public class BinarySearch implements Search{
    @Override
    //优化后的二分查找法，可查找重复元素。
    //返回值是一个待查元素的下标数组，如果无查找，则返回null。
    public int[] search(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                list.add(mid);
                int temp1 = mid;
                int temp2 = mid;
                while(temp1 > low){

                    if (array[--temp1] == value){
                        list.add(temp1);
                    }
                    else {
                        break;
                    }
                }
                while(temp2 < high) {
                    //
                    if (array[++temp2] == value) {
                        list.add(temp2);
                    } else {
                        break;
                    }
                }


                int size = list.size();
                int[] result = new int[size];
                for (int j = 0; j < size; j++) {
                    result[j] = list.get(j);
                }
                return result;
            }
            else if (array[mid] > value){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return null;
    }
}

