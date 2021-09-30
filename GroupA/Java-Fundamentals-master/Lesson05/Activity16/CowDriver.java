public class CowDriver {

    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.move();
        myCow.makeSound();
        myCow.onAnimalMadeSound();
        AnimalBehavior myCow1 = new Cow();
        myCow1.makeSound();
        AnimalListener myCow2 = new Cow();
        myCow2.onAnimalMadeSound();
        myCow.getFamily();
    }
}
