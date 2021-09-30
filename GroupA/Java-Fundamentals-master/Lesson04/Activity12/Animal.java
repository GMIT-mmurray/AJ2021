public class Animal {
  private int legs;
  private int ears;
  private int eyes;
  private String family;
  private String name;

  public Animal() {
    this(4, 2, 2);
  }  // legs = 4; ears = 2; eyes =2;

  public Animal(int legs, int ears, int eyes) {
    this.legs = legs;
    this.ears = ears;
    this.eyes = ears;

  }

  public int getLegs() {    return legs;
  }

  public void setLegs(int legs) {    this.legs = legs;
  }

  public int getEars() {    return ears;
  }

  public void setEars(int ears) {    this.ears = ears;
  }

  public int getEyes() {    return eyes;
  }

  public void setEyes(int eyes) {    this.eyes = eyes;
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


