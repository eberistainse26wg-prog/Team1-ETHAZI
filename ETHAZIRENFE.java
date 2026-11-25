import java.util.Scanner;

public class ETHAZIRENFE {
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
        String [] Train1 = new String [400];
        FillTrain(Train1);
        DisplayTrain(Train1);
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
