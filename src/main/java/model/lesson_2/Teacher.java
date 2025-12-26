package model.lesson_2;

public class Teacher extends Person {
    private String subject;


    public Teacher(){
        this.name = "Ray";
        this.age = 25;
        this.subject = "Math";
    }

    public String teach(){
        String name = this.name;
        String result = String.format("%s is teaching %s", name, subject);
        return result;
    }
}
