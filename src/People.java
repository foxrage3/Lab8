public class People {
    protected String name;
    protected String lastname;
    protected int age;
    People(){
        name = "";
        lastname = "";
        age = 0;
    }
    People(String name1, String lastname1, int age1){
        name = name1;
        lastname = lastname1;
        age = age1;
    }
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    void walk(){
        System.out.println(name + " is walking");
    }
    void voice(){
        System.out.println(name + " is talking");
    }
    void run(){
        System.out.println(name + " is running");
    }
}