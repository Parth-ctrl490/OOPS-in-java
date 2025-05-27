//Interface with Default and Static Methods i.e.nterfaces with default and static methods in Java allow you to include method
// implementations in an interface.
interface SmartDevice {
    void poweron();
    default void greet(){
        System.out.println("this is a smart device ");
    }
    static void about(){
        System.out.println("about the device");
    }
}
class Phone implements SmartDevice{
    public void poweron(){
        System.out.println("power is on");
    }
    public static void main(String[] args){
        Phone p=new Phone();
        p.poweron();
        p.greet();
        SmartDevice.about();
    }
}
