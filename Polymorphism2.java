//Polymorphism
class Prehistoric {
    void dino(){
        System.out.println("jurassic");
    }
}
class allosaurus extends Prehistoric{
    void dino(){
        System.out.println("critaceous");
    }
}
class raptor extends Prehistoric{
    void dino(){
        System.out.println("ice age");
    }
}
//main function in sauraus class
//this is example of runtime polymorphism i.e. A subclass provides a specific implementation of a method that is already defined in its superclass. The method to be called is determined at runtime.
