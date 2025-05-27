//Functional interface i.e.An interface that contains only one abstract method. These are used primarily with lambda expressions.
interface Cartoon {
    int operate(int a,int b);
    public static void main(String[] args){
        Cartoon add=(a,b)->a+b;
        Cartoon sub=(a,b)->a-b;
        System.out.println(add.operate(3,5));
        System.out.println(sub.operate(6,4));
    }
}
