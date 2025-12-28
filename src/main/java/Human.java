package model;
public abstract class Human {
    protected int age;
    protected String name;
    protected boolean man;

    public Human(int age, String name, boolean man) {
        this.age = age;
        this.name = name;
        this.man = man;

    }

    public String sayHello() {
        return "Hello " + name;
    }
    public String getType() {
        return "Human";
    }
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public boolean isMan() {return man;}
    public void setMan(boolean man) {this.man = man;}




}
