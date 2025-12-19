package model;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(){
        this.name = "Ray";
        this.age = 25;
        this.grade = 12;
    }

    /**
     * GET/SET Properties
     */
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public double getGrade(){
        return grade;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    /**
     * OTHER METHODS
     */
    public String printInfo(){
        return "Student{" +
           "name='" + name + '\'' +
           ", age=" + age +
           ", grade=" + grade +
           '}';
    }
}

