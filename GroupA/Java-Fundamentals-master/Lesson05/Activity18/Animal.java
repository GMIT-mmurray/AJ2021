public class Animal {
 int legs;
   int ears;
   int eyes;
   String family;
   String name;

  public Animal() {
    this(4, 2, 2);
  }

  public Animal(int legs, int ears, int eyes) {
    this.legs = legs;
    this.ears = ears;
    this.eyes = ears;

  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



}
