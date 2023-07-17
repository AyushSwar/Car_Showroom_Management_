import java.util.Scanner;

public class Cars implements utility {
    String car_name;
    String car_model;
    Integer car_price;
    String car_color;


    @Override
    public void get_details(){
        System.out.println("Car Name:" + car_name);
        System.out.println("Cae Model:" + car_model);
        System.out.println("Car Price:" + car_price);
        System.out.println("Car Color:" + car_color);

    }
    @Override
    public void set_details(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------Enter Cars Details:----------------");
        System.out.println("Enter Car Name:");
        car_name = scan.nextLine();
        System.out.println("Enter Car Model:");
        car_model = scan.nextLine();
        System.out.println("Enter Car Price:");
        car_price = scan.nextInt();
        System.out.println("Enter Car Color:");
        car_color = scan.nextLine();
    }
}
