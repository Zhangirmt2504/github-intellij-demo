package model;
import interfaces.studies;
public final class Student extends Human implements studies {
    private final String group;
    private float gpa;

    public Student(int age, String name, boolean man, String group, float gpa) {
        super(age, name, man);
        this.group = group;
        this.gpa = gpa;
    }

    @Override
    public String getType() {return "I'm student";}
    @Override
    public String study() {return "Student learn";}
    @Override
    public String speak() {return "Student speak";}


    public final String getGroup() {return group;}
    public  float getGpa() {return gpa;}

}
