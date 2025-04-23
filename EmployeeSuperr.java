import java.util.Scanner;

class Employer {
    int Empid, Salary;
    String Name, Address;

    Employer(int eid, int sal, String name, String addr) {
        Empid = eid;
        Salary = sal;
        Name = name;
        Address = addr;
    }
}

class Teacher extends Employer {
    String department, Subjects_taught;

    Teacher(int eid, int sal, String name, String addr, String dept, String sub) {
        super(eid, sal, name, addr);
        department = dept;
        Subjects_taught = sub;
    }

    void display() {
        System.out.println("\nEmployee ID: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + Subjects_taught);
    }
}

public class EmployeeSuperr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        Teacher[] teacher = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int eid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subjects Taught: ");
            String subj = sc.nextLine();

            teacher[i] = new Teacher(eid, salary, name, address, dept, subj);
        }

        System.out.println("\nDetails of Teachers");
        System.out.println("-------------------------");
        for (int i = 0; i < n; i++) {
            teacher[i].display();
        }

        sc.close();
    }
}
