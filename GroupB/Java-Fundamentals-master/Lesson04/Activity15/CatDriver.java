public class CatDriver {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        // Since Cat inherits from Animal, we have access to it's methods and fields
        // We don't need to redefine these methods and fields
        myCat.setFamily("Cat");
        myCat.setName("Puppy");
        myCat.setEars(2);
        myCat.setLegs(4);
        myCat.setEyes(2);
        System.out.println(myCat.getFamily());
        System.out.println(myCat.getName());
        System.out.println(myCat.getEars());
        System.out.println(myCat.getLegs());
        System.out.println(myCat.getEyes());
    }
}
