import java.util.Scanner;

public class ETHAZIRENFE {

    public class Train{
        int train_id;
        int route_id;
        String departure_time;

        public Train(int train_id, int route_id, String departure_time) {
            this.train_id=train_id;
            this.route_id=route_id;
            this.departure_time = departure_time;
        }

        public static void FillTrain(String[] seats)
        {
            int SeatRow = 1;
            for (int i = 0; i < seats.length; i++)
            {
                if(i % 4 == 0)
                {
                    seats[i] = SeatRow + "A";
                    seats[i + 1] = SeatRow + "B";
                    seats[i + 2] = SeatRow + "C";
                    seats[i + 3] = SeatRow + "D";
                    SeatRow++;
                }
            }
        }
        public static void DisplayTrain(String[] seats)
        {
            for (int i = 0; i < seats.length; i++)
            {
                if(i % 4 == 0 && i <396)
                {
                    System.out.println();
                    System.out.print(seats[i] + "\t" + "\t");
                }
                else if (i % 4 != 0 && i <396){
                    System.out.print(seats[i]+ "\t" + "\t");
                }
                if (i >= 396 && i % 4 == 0)
                {
                    System.out.println();
                    System.out.print(seats[i]+ "\t");
                }
                if (i > 396 && i % 4 != 0)
                {
                    System.out.print(seats[i]+ "\t");
                }
            }
        }
    }

    public class Route{
        int route_id;
        String name;
        String Total_time;

        public Route(int route_id, String name, String Total_time) {
            this.route_id=route_id;
            this.name=name;
            this.Total_time = Total_time;
        }
    }

    public class Passenger{
        int passenger_id;
        String name;
        String surname;
        String DNI;
        String Email;
        int phone_number;
        String password;


        public Passenger(int passenger_id, String name, String surname,String DNI, String Email, int phone_number, String password) {
            this.passenger_id=passenger_id;
            this.name=name;
            this.surname = surname;
            this.DNI = DNI;
            this.Email = Email;
            this.phone_number = phone_number;
            this.password = password;
        }
    }

    public class Reservation{
        int reservation_id;
        int passenger_id;
        int starting_station_id;
        int ending_station_id;
        int train_id;
        String reservation_code;
        String reservation_date_time;
        String travel_date_time;

        public Reservation(int reservation_id, int passenger_id, int starting_station_id,int ending_station_id,int train_id,String reservation_code, String reservation_date_time, String travel_date_time) {
            this.reservation_id=reservation_id;
            this.passenger_id=passenger_id;
            this.starting_station_id = starting_station_id;
            this.ending_station_id = ending_station_id;
            this.train_id = train_id;
            this.reservation_code = reservation_code;
            this.reservation_date_time = reservation_date_time;
            this.travel_date_time = travel_date_time;
        }
    }

    void main()
    {
        Scanner sc =new Scanner(System.in);
        DisplayMenu();
        int option = sc.nextInt();
        while (option != 6)
        {
            switch (option){
                case 1:
                    System.out.println("1. Search for train.");
                    break;
                case 2:
                    System.out.println("2. Buy ticket.");
                    break;
                case 3:
                    System.out.println("3. Check Reservation");
                    break;
                case 4:
                    System.out.println("4. Modify reservation.");
                    break;
                case 5:
                    System.out.println("5. Cancel reservation.");
                    break;
                default:
                    System.out.println("Invalid input, please use a number described on the menu.");
            }
            DisplayMenu();
            option = sc.nextInt();
        }
        if (option == 6) {
            System.out.println("Shutting the program down...");
        }
        sc.close();
    }

    public static void DisplayMenu()
    {
        System.out.println("------------------------");
        System.out.println("\t" + "\t" + "  MENU");
        System.out.println("------------------------");
        System.out.println("1. Search for train.");
        System.out.println("2. Buy ticket.");
        System.out.println("3. Check Reservation");
        System.out.println("4. Modify reservation.");
        System.out.println("5. Cancel reservation.");
        System.out.println("6. Exit.");
        System.out.println("------------------------");
    }
}
