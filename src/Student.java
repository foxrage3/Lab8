public class Student extends People{
    Student(String name1, String lastname1, int age1){
        super(name1, lastname1, age1);
    }

    void learn(){
        System.out.println("Student " + name + " is learning");
    }
}