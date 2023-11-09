import java.util.Scanner;
public class Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, tempChoice, weightChoice, currencyChoice;
        double cel = 0,fahr = 0,kg = 0,lb = 0,usd = 0,eur = 0;
        String rerun;
        do {
            System.out.println("Choose a conversion: ");
            System.out.println("1) Temperature\n2) Weight\n3) Currency\n4) Quit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1) Celsius to Fahrenheit");
                    System.out.println("2) Fahrenheit to Celsius");
                    System.out.print("Choice: ");
                    tempChoice = sc.nextInt();

                    if (tempChoice == 1) {
                        System.out.print("Enter a temperature in Celsius: ");
                        cel = sc.nextDouble();
                        tempConversion temp = new tempConversion(cel,fahr);
                        System.out.println(temp.cel+" degrees Celsius is equal to "+temp.celToFahr(cel)+" degrees Fahrenheit.");
                    } else if (tempChoice == 2) {
                        System.out.print("Enter a temperature in Fahrenheit: ");
                        fahr = sc.nextDouble();
                        tempConversion temp = new tempConversion(cel,fahr);
                        System.out.println(temp.fahr+" degrees Fahrenheit is equal to "+temp.fahrToCel(fahr)+" degrees Celsius.");
                    }
                    break;
                case 2:
                    System.out.println("1) lbs to kgs");
                    System.out.println("2) kgs to lbs");
                    System.out.print("Choice: ");
                    weightChoice = sc.nextInt();

                    if (weightChoice == 1) {
                        System.out.print("Enter a weight in lbs: ");
                        lb = sc.nextDouble();
                        weightConversion weight = new weightConversion(kg, lb);
                        System.out.println(weight.lb+" lb(s) is equal to "+weight.lbTokg(lb)+" kg(s).");

                    } else if (weightChoice == 2) {
                        System.out.print("Enter a weight in kgs: ");
                        kg = sc.nextDouble();
                        weightConversion weight = new weightConversion(kg, lb);
                        System.out.println(weight.kg+" kg(s) is equal to "+weight.kgTolb(kg)+" lb(s).");
                    }
                    break;
                case 3:
                    System.out.println("1) USD to EUR");
                    System.out.println("2) EUR to USD");
                    System.out.print("Choice: ");
                    currencyChoice = sc.nextInt();

                    if (currencyChoice == 1) {
                        System.out.print("Enter a currency in USD: ");
                        usd = sc.nextDouble();
                        currencyConversion currency = new currencyConversion(usd, eur);
                        System.out.println("$"+currency.usd+" is equal to "+currency.usdToEur(usd)+" EUR.");
                    } else if (currencyChoice == 2) {
                        System.out.print("Enter a currency in EUR: ");
                        eur = sc.nextDouble();
                        currencyConversion currency = new currencyConversion(usd, eur);
                        System.out.println(currency.eur+" EUR is equal to "+" $"+currency.eurToUsd(eur)+".");
                    }
                    break;
                case 4:
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("Would you like to perform another conversion? ");
            rerun = sc.next().toUpperCase();
            if (choice == 4 && rerun.equals("NO")) {
                System.out.println("Thank you for using our conversion program!");
            }
        } while (rerun.equals("YES") && choice != 4);

    }
}
