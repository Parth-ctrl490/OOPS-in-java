//normal interface i.e. Contains only abstract methods (or methods without body) and constants.
interface Gaadi {
    void start();
    void stop();
}
class auto implements Gaadi{
    public void start(){
        System.out.println("vehicle starts");
    }
    public void stop(){
        System.out.println("vehicle stops");
    }
    public static void main(String[] args){
        Gaadi obj=new auto();
        obj.start();
        obj.stop();
    }
}
