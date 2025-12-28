package model;
import interfaces.studies;
import interfaces.works;

public class Employee extends Human implements studies, works {
    private String work;
    private float salary;

    public static int count = 0;

    public Employee(int age, String name, boolean man, String work, float salary) {
        super(age, name, man);
        this.work = work;
        this.salary = salary;
        count++;

    }

    @Override
    public String getType() {
        return "Employee";
    }
    @Override
    public String study() {return "Employee learn";}
    @Override
    public String speak() {return "Employee speaks";}
    @Override
    public String work() {return "Employee works ";}
    @Override
    public String salary() {return "Employee salary: " + salary;}
    public String getWork() {return work;}
    public void setWork(String work) {this.work = work;}
    public float getSalary() {return salary;}
    public void setSalary(float salary) {this.salary = salary;}


}