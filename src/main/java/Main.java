import model.*;
import interfaces.works;
import interfaces.studies;


public class Main {
    public static void main(String[] args) {
        Student student = new Student(21, "Azamat",true,"MT",3.2f);
        Human human = new Employee(34,"Rasul",true,"Chef",500000);
        Employee employee = new Employee(22,"Temirlan",true,"Engineer",500000);
        works worker = new Employee(36,"Diana",false,"Doctor",750000);

        System.out.println(student.sayHello());
        System.out.println("Age: " + student.getAge());
        System.out.println("Type: " + student.getType());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Gpa: " + student.getGpa());
        System.out.println("Is man true or false: " + student.isMan());
        System.out.println();

        System.out.println(human.sayHello());
        System.out.println("Type: " + human.getType());
        System.out.println("Age: " + human.getAge());;

        System.out.println("Is man true or false? " + human.isMan());
        System.out.println();

        System.out.println(employee.sayHello());
        System.out.println("Type: " + employee.getType());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Is man true or false? " + employee.isMan());
        System.out.println("Job: " + employee.getWork());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println();
        System.out.println(worker.work());
        System.out.println(worker.salary());

        System.out.println("Employee: " + Employee.count);


    }
}
