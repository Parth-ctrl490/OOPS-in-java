//encapsulation i.e.Encapsulation is the process of wrapping data (variables) and code (methods) into a
// single unit — like a capsule.
class Teacher {
    private String name;//private function hence hidden from outside
    private int age;

    public String getName(){//getter function
        return name;
    }
    public void setName(String name){//setter function
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }
}
