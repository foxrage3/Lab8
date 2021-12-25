public class Teacher extends People{
    Teacher(String name1, String lastname1, int age1){
        super(name1, lastname1, age1);
    }

    void teach(){
        System.out.println("Teacher " + name + " is teaching");
    }
}