public class CowDriver {
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.move();
        myCow.makeSound();
        myCow.onAnimalMadeSound();
        myCow.onAnimalMoved();
        myCow.getEyes();

       AnimalBehavior myCow1 = new Cow();
       myCow1.move();
       myCow1.makeSound();


       AnimalListener myCow2 = new Cow();
       myCow2.onAnimalMadeSound();
       myCow2.onAnimalMoved();

    }
}
