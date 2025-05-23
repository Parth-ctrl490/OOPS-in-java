//multilevel inheritance
class Dinosaur {
    void roar(){
        System.out.println("dino roars");
    }
}
class trex extends Dinosaur{
    void carnivore(){
        System.out.println("trex is carnivore");
    }
}
class Fossil extends trex{
    void found(){
        System.out.println("trex fossil found");
    }
}
