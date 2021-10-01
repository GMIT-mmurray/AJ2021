public class Cow extends Animal implements AnimalBehavior, AnimalListener {
  String sound;
  String movementType;

  @Override
  public void move() {
    this.movementType = "Walking";
    this.onAnimalMoved();
  }

  @Override
  public void makeSound() {
    this.sound = "Moo";
    this.onAnimalMadeSound();
  }

  @Override
  public void onAnimalMoved() {
    System.out.println("Animal moved: " + this.movementType);
  }

  @Override
  public void onAnimalMadeSound() {
    System.out.println("Sound made: " + this.sound);
  }


}
