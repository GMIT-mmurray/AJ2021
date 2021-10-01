public class Cat extends Animal {

  // Fields specific to the Cat family
  private String owner;
  private int numberOfTeeth;
  private int age;

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getNumberOfTeeth() {
    return numberOfTeeth;
  }

  public void setNumberOfTeeth(int numberOfTeeth) {
    this.numberOfTeeth = numberOfTeeth;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
