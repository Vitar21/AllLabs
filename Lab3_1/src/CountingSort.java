import java.util.List;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums){
        int[] count = new int[128];

        for ( int number : nums){
            count[number] += 1;
        }

        int index = 0;
        for(int i = 0; i < count.length; i++){
            while (count[i] > 0){
                nums.set(index, i);
                index++;
                count[i]--;
            }
        }
    }
}