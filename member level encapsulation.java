//Member level Encapsulation i.e.Encapsulation applied only to data members
// (fields) of a class using access modifiers.
class Teacher {
    private String name;//private function hence hidden from outside


    public String getName(){//getter function
        return name;
    }
    public void setName(String name){//setter function
        this.name=name;

    }
}
//main function in yoyo2 class
