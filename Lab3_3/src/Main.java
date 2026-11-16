import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Main{
    public static void main(String[] args){
        // Иеты
        Sorting<Integer> sorter_int = new UniverseSort<>();
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 7, 3, 8, 1, 2, 3, 3));
        sorter_int.sort(ints);
        System.out.println("Numbers: " + ints);

        // Стринги
        Sorting<String> sorter_string = new UniverseSort<>();
        List<String> strings = new ArrayList<>(Arrays.asList("Gay", "Bomj", "ComparableBTS"));
        sorter_string.sort(strings);
        System.out.println("Stroka: " + strings);

        // Дата время
        Sorting<LocalDateTime> sorter_data = new UniverseSort<>();
        List<LocalDateTime> dates = new ArrayList<>(Arrays.asList(LocalDateTime.now().plusDays(12), LocalDateTime.now().plusDays(1), LocalDateTime.now()));
        sorter_data.sort(dates);
        System.out.println("LocalDateTime: " + dates);

        // Студентки
        Sorting<Student> sorter_stud = new UniverseSort<>();
        List<Student> students = new ArrayList<>(Arrays.asList(new Student("Nastya", 19), new Student("Sasha", 18), new Student("Dura", 16)));
        sorter_stud.sort(students);
        System.out.println("Studentki: " + students);

        //ЮЮИД
        Sorting<UUID> sorter_uuid = new UniverseSort<>();
        List<UUID> uuids = new ArrayList<>(Arrays.asList(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID()));
        sorter_uuid.sort(uuids);
        System.out.println("UUIDS: " + uuids);
    }
}