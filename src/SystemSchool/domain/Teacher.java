package SystemSchool.domain;

import SystemSchool.repositories.ICalcule;

public class Teacher implements ICalcule {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    public Teacher(){

    }
    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculate() {
        double salary = 0.0;
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
        return salaryEarned;
    }
    @Override
    public String toString(){
        return "Name of the teacher: " + name +
                "\nTotal salary earned :" + calculate();
    }
}
