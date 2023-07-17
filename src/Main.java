import java.util.Scanner;

interface utility{
     void get_details();
     void set_details();

}

public class Main{
    static void main_menu(){
        System.out.println("-------------------------Enter the number----------------");
        System.out.println();
        System.out.print("1) Add Showroom \t \t \t");
        System.out.print("2) Add Employees \t \t \t");
        System.out.println("3) Add Cars \t \t \t");
        System.out.print("4) Get Showroom \t \t \t");
        System.out.print("5) Get Employees \t \t \t");
        System.out.println("6) Get Cars \t \t \t");
        System.out.println();
        System.out.println("---------------------------Enter 0 to Exit----------------");
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];


        int showroom_counter = 0;
        int employee_counter = 0;
        int cars_counter = 0;
        int choice = 10;

        while(choice != 0){

            main_menu();
            choice = scan.nextInt();

            while(choice != 9 || choice != 0){
                switch (choice){

                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.print("1) Add Showroom \t \t \t");
                        System.out.print("7) Go Back to main menu");
                        choice = scan.nextInt();
                        break;
                    case 2:
                        employees[employee_counter] = new Employees();
                        employees[employee_counter].set_details();
                        employee_counter++;
                        System.out.println("2) Add Employee \t \t \t");
                        System.out.println("7) Go Back to main menu");
                        choice = scan.nextInt();
                        break;
                    case 3:
                        cars[cars_counter] = new Cars();
                        cars[cars_counter].set_details();
                        cars_counter++;
                        System.out.println("3) Add Cars \t \t \t");
                        System.out.println("7) Go Back to main menu");
                        choice = scan.nextInt();

                        break;
                    case 4:
                        for(int i = 0; i < showroom_counter; i++ ){
                            showroom[i].get_details();
                            System.out.println("Showroom Details");
                        }

                        break;
                    case 5:
                        for(int i = 0; i < employee_counter; i ++){
                            employees[i].get_details();
                            System.out.println("Employee Details");
                        }
                        break;
                    case 6:
                        for(int i = 0; i < cars_counter; i ++){
                            cars[i].get_details();
                            System.out.println("Cars Details");
                        }
                        break;

                    default:
                        main_menu();
                }
                break;
             }

        }

    }
}