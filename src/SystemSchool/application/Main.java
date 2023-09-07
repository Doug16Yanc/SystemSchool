/*Created by Douglas*/

package SystemSchool.application;

import SystemSchool.domain.School;
import SystemSchool.domain.Student;
import SystemSchool.domain.Teacher;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int number;
    static int number1;
    static Scanner sc = new Scanner(System.in);
    static List <Teacher> teachers = new ArrayList<>();
    static List <Student> students = new ArrayList<>();

    static List<School> schools = new ArrayList<>();
    public static void main(String[] args) {
        openMenu();
    }

    private static void openMenu() {
        System.out.println("Welcome to system school of the college 'Your cash, our qualificated education.'\n");
        System.out.println("Please, fill in the list of the masters:\n");

        do{
            System.out.println("A integer number to fill in or 0 to end:\n");
            number = sc.nextInt();

            System.out.println("Please, the id:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Name of the teacher:");
            String name = sc.next();

            System.out.println("Please, informe the salary (in $) of this master:");
            double salary = sc.nextDouble();

            Teacher te = new Teacher(id, name, salary);

            teachers.add(te);

            Random num = new Random();

            System.out.println("Process conclused of number " + num);
        }
        while(number != 0);

        System.out.println("Ok, now we´ll fill in the list the data of the students:\n");

        do{
            System.out.println("A integer number to fill in or 0 to end:\n");
            number1 = sc.nextInt();

            System.out.println("Please, the id:");
            int id1 = sc.nextInt();

            sc.nextLine();

            System.out.println("Name of the student:");
            String name1 = sc.next();

            System.out.println("Average grade of this student:");
            double grade = sc.nextDouble();

            Student st = new Student(id1, name1, grade);

            students.add(st);

            Random num1 = new Random();

            System.out.println("Process conclused of the number " + num1);
        }
        while(number1 != 0);

        School school = new School(students, teachers);

    }
}