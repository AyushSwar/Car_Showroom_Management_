import java.util.Scanner;

public class Employees implements utility{

    String employee_name;
    String employee_address;
    Integer employee_id;
    Integer employee_number;
    Double employee_salary;
    Integer employee_age;
    @Override
    public void get_details(){
        System.out.println("Employee Name:" + employee_name);
        System.out.println("Employee Address:" + employee_address);
        System.out.println("Employee ID:" + employee_id);
        System.out.println("Employee Phone Number" + employee_number);
        System.out.println("Employee Salary:" + employee_salary);
        System.out.println("Employee Age:" + employee_age);
    }

    @Override
    public void set_details(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------Enter Employee Details:----------------");
        System.out.println();
        System.out.print("Enter Employee Name:");
        employee_name = scan.nextLine();
        System.out.println("Enter Employee Address:");
        employee_address = scan.nextLine();
        System.out.println("Enter Employee ID:");
        employee_id = scan.nextInt();
        System.out.println("Enter Employee Phone Number:");
        employee_number = scan.nextInt();
        System.out.println("Enter Employee Salary:");
        employee_salary = scan.nextDouble();
        System.out.println("Enter Employee Age:");
        employee_age = scan.nextInt();
    }


}
