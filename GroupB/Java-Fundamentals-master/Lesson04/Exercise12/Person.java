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

}