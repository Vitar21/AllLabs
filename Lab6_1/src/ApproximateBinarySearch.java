public class ApproximateBinarySearch implements BinarySearch{
    @Override
    public int findClosest(int[] sortedArray, int target){
        int n = sortedArray.length;
        int left = 0, right = n - 1;

        if (target <= sortedArray[0]){
            return sortedArray[0];
        }
        if (target >= sortedArray[n - 1]){
            return sortedArray[n - 1];
        }

        while (right - left > 1){
            int middle = left + (right - left) / 2;

            if (sortedArray[middle] == target){
                return sortedArray[middle];
            }
            else if (sortedArray[middle] < target){
                left = middle;
            }
            else {
                right = middle;
            }
        }

        long distLeft = (long) target - sortedArray[left];
        long distRight = (long) sortedArray[right] - target;

        return (distLeft <= distRight) ? sortedArray[left] : sortedArray[right];
    }
}
