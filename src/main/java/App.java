import model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.getName();
        s1.setName("Rim");
        System.out.println(s1.printInfo());
    }
}
