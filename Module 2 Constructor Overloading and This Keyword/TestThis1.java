//1) this: to refer current class instance variable

class Student1{  
    int rollno;  
    String name;  
    float fee;  
    public Student1(int rollno,String name,float fee){  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;    
    }  
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }  
}  

public class TestThis1{  
    public static void main(String args[]){  
        Student1 s1=new Student1(111,"ankit",5000f);  
        Student1 s2=new Student1(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    }
}