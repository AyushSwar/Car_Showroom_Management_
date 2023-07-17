import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    String manager_name;
    Integer phone_number;
    Integer total_cars;
    Integer total_employees;
    @Override
    public void get_details(){
        System.out.println();
        System.out.println("Showroom Name:" + showroom_name);
        System.out.println("Showroom Address:" + showroom_address );
        System.out.println("Manager Name:"+ manager_name);
        System.out.println("Phone Number:" + phone_number);
        System.out.println("Total Number of Cars:" + total_cars);
        System.out.println("Total Employee:"+ total_employees);
    }

    @Override
    public void set_details() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------Enter Showroom Details:----------------");
        System.out.println("Showroom Name:");
        showroom_name = scan.nextLine();
        System.out.println("Showroom Address:");
        showroom_address = scan.nextLine();
        System.out.println("Manager Name:");
        manager_name = scan.nextLine();
        System.out.println("Phone Number:");
        phone_number = scan.nextInt();
        System.out.println("Total Cars:");
        total_cars = scan.nextInt();
        System.out.println("Total Employees:");
        total_employees = scan.nextInt();
    }
}