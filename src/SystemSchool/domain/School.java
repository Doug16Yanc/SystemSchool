package SystemSchool.domain;

import SystemSchool.repositories.ICalcule;

import java.util.List;

public class School implements ICalcule {
    private List<Student> students;
    private List <Teacher> teachers;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    public School(){

    }
    public School(List<Student>students, List<Teacher>teachers){
        this.students = students;
        this.teachers = teachers;
        this.totalMoneyEarned = 0.0;
        this.totalMoneySpent = 0.0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }

    public static double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(double moneyEarned){
        totalMoneyEarned += moneyEarned;
    }
    public static double getTotalMoneySpent() {
        return totalMoneySpent;
    }
    public static void updateTotalMoneySpent(double moneySpent){
        totalMoneySpent -= moneySpent;
    }
    @Override
    public double calculate() {
        double totalMoney = 0.0;
        totalMoney = totalMoneyEarned - totalMoneySpent;
        return totalMoney;
    }
}
