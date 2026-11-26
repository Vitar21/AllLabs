public class DiplomBoxSolver {

    public long findMinSqSide(long n, long w, long h){
        long left = Math.max(w, h);
        long right = n * Math.max(w, h);

        while (left < right){
            long mid = left + (right - left) / 2;

            if (canFit(mid, n, w, h)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canFit(long side, long n, long w, long h){
        long cols = side / w;
        long rows = side / h;

        if (cols == 0 || rows == 0){
            return false;
        }

        return cols >= (n - 1) / rows + 1;
    }
}
