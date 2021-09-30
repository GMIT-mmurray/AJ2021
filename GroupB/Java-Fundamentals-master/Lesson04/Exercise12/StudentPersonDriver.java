public class StudentPersonDriver {
    public static void main(String[] args) {
        Person me = new Person();
        Person myNeighbour = new Person();
        Person lecturer = new Person();
        Person gmit = new Person(12,6,"java");

        me.walk(20);
        me.walk(5);
        me.sleep();
        myNeighbour.walk(20);
        myNeighbour.walk(5);
        myNeighbour.sleep();
        lecturer.walk(20);
        lecturer.walk(5);
        lecturer.sleep();
        me.walk();
        me.setAge(3);
        gmit.setName("Python");
        Student michael = new Student("7748574",21,6,"michael");
        michael.walk(45);
        michael.setName("David");
    }
}
