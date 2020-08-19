import java.util.Scanner;

public class bank {
    public static int chequing_amount = 0;
    public static int savings_amount = 0;
    
    public static void main(String[] args) {
        main_screen();
    }

    public static void main_screen() {
            int total_amount = chequing_amount + savings_amount;
            System.out.println("**************************");
            System.out.println("|\tJAVA BANK\t|");
            System.out.println("**************************");
            
            System.out.println("CHEQUING: $" + chequing_amount);
            System.out.println("\nSAVINGS: $" + savings_amount);
            System.out.println("\nTOTAL FUNDS: $" + total_amount);

            Scanner input = new Scanner(System.in);
            System.out.print("\nWould you like to add funds to your account? (y/n): ");
            String add_fund = input.nextLine();

            switch (add_fund) {
                case "Yes":
                Account();
                break;

                case "yes":
                Account();
                break;

                case "y" :
                Account();
                break;

                case "Y" :
                Account();
                break;

                default:
                System.out.println("\n**************************");
                System.out.println("|\tRECEIPT\t\t |");
                System.out.println("**************************");
                System.out.println("\nCHEQUING: $" + chequing_amount);
                System.out.println("\nSAVINGS: $" + savings_amount);
                System.out.println("\nTOTAL: $" + total_amount);
                System.out.println("\nHave a good day!");

                System.exit(0);
                break;
            }
            input.close();
    }

    public static void Account() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich account would you like to put it in? (Choices: 1. CHEQUING, 2. SAVINGS): ");
        String account = input.nextLine();

        switch (account) {
            case "1":
            Chequing();
            break;
            
            case "2":
            Savings();
            break;

            default:
            System.out.println("Please enter 1 or 2!");
            Account();
            break;
        }
        input.close();
        System.out.println(chequing_amount);
    }

    public static int Chequing() {  
        System.out.print("\nHow much would you like to add to your account?: $");
        Scanner amount = new Scanner(System.in);
        chequing_amount = amount.nextInt();
        System.out.println("You have added: $" + chequing_amount);

        System.out.print("Would you like to add more?: ");
        Scanner options = new Scanner(System.in);
        String choice = options.nextLine();

        switch (choice) {
            case "y":
            Chequing();
            break;

            case "yes":
            Chequing();
            break;

            case "Y":
            Chequing();
            break;

            case "Yes":
            Chequing();
            break;

            default:
            main_screen();            
            break;
        }
        options.close();
        amount.close();
        return chequing_amount;
    }

    public static int Savings() {
        System.out.print("How much would you like to add to your account?: $");
        Scanner amount = new Scanner(System.in);
        savings_amount = amount.nextInt();
        System.out.println("You have added: $" + savings_amount);

        System.out.print("Would you like to add more?: ");
        Scanner options = new Scanner(System.in);
        String choice = options.nextLine();

        switch (choice) {
            case "y":
            Chequing();
            break;

            case "yes":
            Chequing();
            break;

            case "Y":
            Chequing();
            break;

            case "Yes":
            Chequing();
            break;

            default:
            main_screen();
            break;
        }
        options.close();
        amount.close();
        return savings_amount;
    }
}