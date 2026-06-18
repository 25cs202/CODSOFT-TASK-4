import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("     CODSOFT CURRENCY CONVERTER      ");
        System.out.println("Available Currencies:");
        System.out.println("INR - Indian rupees" );
        System.out.println("USD - US Dollars");
        System.out.println("EUR - Euros");
        System.out.println("CNY - China YEN");
        System.out.println("GBP - Britain pound");
        System.out.println("RUB - Russian Rubels");
        System.out.println("These are the currencies available in CODSOFT CURRENCY CONVERTER");

        System.out.print("\nEnter Base Currency: ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter Target Currency: ");
        String to = sc.next().toUpperCase();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double fromRate = getRate(from);
        double toRate = getRate(to);

        if (fromRate == 0 || toRate == 0 || amount <= 0) {
            System.out.println("Invalid Input!");
        } else {
            double converted = amount * (fromRate / toRate);

            System.out.println("\n     The value of the available currency you have in terms of target currency      ");
            System.out.println("The Value of " + amount + " " + from + "\n in " + to + " currency is "
                    + String.format("%.2f", converted)
                    + " " + to);
        }

        sc.close();
    }

    public static double getRate(String currency) {
        switch (currency) {
            case "INR": return 1.0;
            case "USD": return 83.5;
            case "EUR": return 95.2;
            case "CNY": return 11.9;
            case "GBP": return 115.0;
            case "RUB": return 1.09;
            default: return 0;
        }
    }

    public static String getSymbol(String currency) {
        switch (currency) {
            case "INR": return "₹";
            case "USD": return "$";
            case "EUR": return "€";
            case "CNY": return "¥";
            case "GBP": return "£";
            case "RUB": return "₽";
            default: return "";
        }
    }
}
