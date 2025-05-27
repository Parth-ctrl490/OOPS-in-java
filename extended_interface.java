//Extended Interfacei.e.An interface that inherits from another interface.
interface Engine {
    void on();
}
interface turboEngine extends Engine{
    void boost();
}
class SportsCar implements turboEngine{
    public void on(){
        System.out.println("engine on");
    }
    public void boost(){
        System.out.println("boost the engine");
    }
    public static void main(String[] args){
        SportsCar sc=new SportsCar();
        sc.on();
        sc.boost();
    }
}
