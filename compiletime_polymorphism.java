class Calculator {
    void add(int a,int b) {
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);

    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
//compile time polymorphism i.e.It is a type of polymorphism where the method to be executed is determined during compile time,
// based on the method signature (name, number, and type of parameters).
//Also called Method Overloading in Java.
