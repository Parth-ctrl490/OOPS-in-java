// Abstraction
abstract class Avengers {
    abstract void hulk();

    void thor(){
        System.out.println("mjolnir");
    }
}
class Ironman extends Avengers{
    void hulk(){
        System.out.println("hulk smash");
    }
}
