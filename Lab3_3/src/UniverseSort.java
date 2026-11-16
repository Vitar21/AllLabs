import java.util.List;

public class UniverseSort<T extends Comparable<? super T>> implements Sorting<T> {
    @Override
    public void sort(List<T> list){
        for (int i = 1; i < list.size(); i++){
            T _this = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).compareTo(_this) > 0){
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, _this);
        }
    }
}
