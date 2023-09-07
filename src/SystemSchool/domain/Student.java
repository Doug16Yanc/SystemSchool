package SystemSchool.domain;

import SystemSchool.repositories.ICalcule;

public class Student implements ICalcule {
    private int id;
    private String name;
    private double grade;
    private double debtsPaid;
    private double debtsTotal;

    public Student(){

    }
    public Student(int id, String name, double grade){
        this.debtsPaid = 0.0;
        this.debtsTotal = 200.00;
        this.id = id;
        this.name = name;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getDebtsPaid() {
        return debtsPaid;
    }

    public double getDebtsTotal() {
        return debtsTotal;
    }

    @Override
    public double calculate() {
        double debts = 0.0;
        debtsPaid += debts;
        School.updateTotalMoneyEarned(debtsPaid);
        return debtsTotal - debtsPaid;
    }
    @Override
    public String toString(){
        return "Student name: " + name +
                "\nDebts remaining: " + calculate();
    }

}
