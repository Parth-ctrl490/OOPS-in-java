//multilevel inheritance
public class Animal2 {
    void eat(){
        System.out.println("animal eats");
    }
}
class dog extends Animal2{
    void bark(){
        System.out.println("dog barks");
    }
}
class puppy extends dog{
    void weep(){
        System.out.println("dog weeps");
    }
}
