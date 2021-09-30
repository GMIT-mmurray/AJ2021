public class Student extends Person {

    private final String id;

    public Student(String id, int age, int height, String name ) {
        super (age, height, name);
        this.id = id;
    }
}
