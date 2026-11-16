public class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public String get_name(){
        return name;
    }

    public int get_age(){
        return age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student next){
        int comp_age = Integer.compare(this.age, next.age);
        if ( comp_age != 0){
            return comp_age;
        }

        return this.name.compareTo(next.name);
    }

    @Override
    public String toString(){
        return name + " " + age;
    }

}
