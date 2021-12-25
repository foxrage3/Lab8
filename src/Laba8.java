public class Laba8 {
    public static void main(String[] args) {
        People people =  new People("Alexey","Alexeev",20);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Robert","Petrov",19);
        student.learn();
        student.walk();
        student.run();
        student.voice();
        Teacher teacher = new Teacher("Boris","Borisov",29);
        teacher.teach();
        teacher.walk();
        teacher.run();
        teacher.voice();
    }
}