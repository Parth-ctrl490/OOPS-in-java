//An interface declared inside another interface or class is NESTED
// INTERFACE
class Outer {
    interface Inner{
        void show();
    }
}
class Nested implements Outer.Inner{
    public void show(){
        System.out.println("nested interface");
    }
    public static void main(String[] args){
        Outer.Inner obj=new Nested();
        obj.show();
    }
}
