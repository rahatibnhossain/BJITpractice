package co.bjit.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    Scanner sc = new Scanner(System.in);
    static List<Person> StudentTeacherList = new ArrayList<>();
    static List<Teacher> TeacherList = new ArrayList<>();
    static List<Student> StudentList = new ArrayList<>();
    static List<Staff> StaffList = new ArrayList<>();


    public static void main(String[] args) {



        StudentTeacherList.add(new Teacher(1, "Nira Khan", 31, "Math"));
        TeacherList.add(new Teacher(1, "Nira Khan", 31, "Math"));
        StudentTeacherList.add(new Student(2, "Hira Khan", 16, 10));
        StudentList.add(new Student(2, "Hira Khan", 16, 10));
        StudentTeacherList.add(new Staff(3, "Hima Khan", 18, "Pion"));
        StaffList.add(new Staff(3, "Hima Khan", 18, "Pion"));

        StudentManagement sm = new StudentManagement();
        sm.start();

    }

    public void start() {

        showMembers();
        int x;
        for (; ; ) {
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("1 Add Teacher");
            System.out.println("2 Add Student");
            System.out.println("3 Add Staff");
            System.out.println("4 Show All");
            System.out.println("5 Select A Member Using ID");
            System.out.println("0 Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter the option: ");

            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    addStudent();

                    break;
                case 3:
                    addStaff();

                    break;
                case 4:
                    showMembers();
                    break;
                case 5:
                    selectMember();
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public void selectMember() {
        System.out.println();
        System.out.println("Enter the ID of the Person You Want to Select");
        int id = sc.nextInt();
        sc.nextLine();
        for (Person p : StudentTeacherList) {
            if (p.id == id) {

                p.showDetails();
                System.out.println();
                isAdult(p);

                if (p.type == "Staff") {
                    for (Staff sf : StaffList) {
                        if (sf.id == id) {
                            for (; ; ) {
                                System.out.println();
                                System.out.println("1 Set Salary");
                                System.out.println("2 View Salary");
                                System.out.println("3 Years of Experience");
                                System.out.println("0 Go To Main Menu");
                                System.out.print("Enter the option: ");

                                int x = sc.nextInt();
                                sc.nextLine();
                                boolean shouldBreak = false;

                                switch (x) {
                                    case 1:
                                        sf.setSalary();
                                        break;
                                    case 2:
                                        sf.showSalary();
                                        break;
                                    case 3:
                                        sf.yearsOfExperience();
                                        break;

                                    case 0:
                                        shouldBreak = true;

                                }
                                if (shouldBreak) break;

                            }


                        }
                    }
                }
                if (p.type == "Student") {
                    for (Student sf : StudentList) {
                        if (sf.id == id) {
                            for (; ; ) {
                                System.out.println();
                                System.out.println("1 Years of Experience");
                                System.out.println("0 Go To Main Menu");
                                System.out.print("Enter the option: ");

                                int x = sc.nextInt();
                                sc.nextLine();
                                boolean shouldBreak = false;

                                switch (x) {

                                    case 1:
                                        sf.yearsOfExperience();
                                        break;

                                    case 0:
                                        shouldBreak = true;

                                }
                                if (shouldBreak) break;

                            }


                        }
                    }
                }
                if (p.type == "Teacher") {
                    for (Teacher sf : TeacherList) {
                        if (sf.id == id) {
                            for (; ; ) {
                                System.out.println();
                                System.out.println("1 Set Salary");
                                System.out.println("2 View Salary");
                                System.out.println("3 Years of Experience");
                                System.out.println("0 Go To Main Menu");
                                System.out.print("Enter the option: ");

                                int x = sc.nextInt();
                                sc.nextLine();
                                boolean shouldBreak = false;

                                switch (x) {
                                    case 1:
                                        sf.setSalary();
                                        break;
                                    case 2:
                                        sf.showSalary();
                                        break;
                                    case 3:
                                        sf.yearsOfExperience();
                                        break;

                                    case 0:
                                        shouldBreak = true;

                                }
                                if (shouldBreak) break;

                            }

                        }
                    }
                }
            }
        }


    }

    public void addStaff() {
        System.out.println();
        System.out.println("Enter the details of the Staff");
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Post : ");
        String post = sc.nextLine();


        StudentTeacherList.add(new Staff(id, name, age, post));

        System.out.println();
        showMembers();
    }


    public void showMembers() {
        System.out.println();
        System.out.println("List of all members");
        for (Person p : StudentTeacherList) {
            p.showDetails();


        }
    }


    public void addStudent() {
        System.out.println();
        System.out.println("Enter the details of the Student");
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Class : ");
        int classNumber = sc.nextInt();
        sc.nextLine();

        StudentTeacherList.add(new Student(id, name, age, classNumber));

        System.out.println();
        showMembers();
    }

    public void addTeacher() {
        System.out.println();
        System.out.println("Enter the details of the teacher");
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject : ");
        String subject = sc.nextLine();


        StudentTeacherList.add(new Teacher(id, name, age, subject));
        System.out.println("Hi " + name + ". Your ID is " + id);

        System.out.println();
        showMembers();
    }

    //using Child classes Object as an input where object of
    public void isAdult(Person p) {
        if (p.age >= 18) {
            System.out.println("Yes, He is an adult");
        } else {
            System.out.println("Sorry, He is not an adult");
        }
    }


}
interface Experience {
    void yearsOfExperience();
}

class Person implements Experience {
    public String name;
    public int id;
    public int age;
    public int experienceYear = 0;

    public String type;


    @Override
    public void yearsOfExperience() {
        System.out.println("This person have experience of " + experienceYear + " years");
    }
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public void showDetails() {
        System.out.println("ID :" + this.id + " Name : " + this.name + " Age :" + this.age + " Type : " + this.type);

    }


}

interface salaryFunctions {

    // Declaring Properties in interface
    boolean isEmployee = true;

    void setSalary();

    void showSalary();

}



//Over Writing the interfaces method
class Student extends Person implements Experience {
    public int classNumber;

    @Override
    public void yearsOfExperience() {
//        super.yearsOfExperience();
        System.out.println();
        System.out.println("Students does not have working Experience");
    }


    public Student(int id, String name, int age, int classNumber) {
        super(id, name, age);
        this.classNumber = classNumber;
        this.type = "Student";
    }

}

class Teacher extends Person implements salaryFunctions {
    public String subject;
    public int salary;

    @Override
    public void setSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Salary : ");
        int salary = sc.nextInt();
        sc.nextLine();
        this.salary = salary;
        showSalary();
    }

    @Override
    public void showSalary() {
        System.out.println();
        System.out.println("The salary of " + this.name + " is " + this.salary + " BDT");
        System.out.println();
    }

    public Teacher(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
        this.type = "Teacher";

    }


}

class Staff extends Person implements salaryFunctions {
    public String post;
    public int salary;

    public void setSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Salary : ");
        int salary = sc.nextInt();
        sc.nextLine();
        this.salary = salary;
        showSalary();
    }

    @Override
    public void showSalary() {
        System.out.println();
        System.out.println("The salary of " + this.name + " is " + this.salary + " BDT");
        System.out.println();

    }

    public Staff(int id, String name, int age, String post) {
        super(id, name, age);
        this.post = post;
        this.type = "Staff";

    }

}

