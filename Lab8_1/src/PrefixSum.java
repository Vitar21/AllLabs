public class PrefixSum {
    private final int[] prefix;

    public PrefixSum(int[] array){
        this.prefix = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            prefix[i + 1] = prefix[i] + array[i];
        }
    }

    public int getRangeSum(int left, int right){
        if (left > right){
            int temp = left;
            left = right;
            right = temp;
        }
        return prefix[right + 1] - prefix[left];
    }
}
