public class Person {
    // Properties
    private int age;
    private int height;
    private String name;

    public Person(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void walk() {
        // Do walking operations here
        System.out.println("Walking...");
    }

    public void sleep() {
        // Do sleeping operations here
        System.out.println("Sleeping...");
    }

    private void takeShower() {
        // Do take shower operations here
        System.out.println("Taking a shower...");
    }

    public void walk(int speed) {
        // Do walking operations here
        if (speed > 10) {
            System.out.println("Walking...");
        }
    }

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
       }
}