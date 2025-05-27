//Marker Interface i.e.An interface with no methods or fields. It's used to mark a
// class for a special purpose.
interface Printable {
}
class document implements Printable{
    void print(){
        System.out.println("printing document");
    }
    public static void main(String[] args){
        document d=new document();
        d.print();
    }
}
