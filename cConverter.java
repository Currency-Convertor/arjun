package currencyConverter;

import java.util.Scanner;

public class cConverter {
    public static void main(String args[]){
        double todayRate;
        int choice;
        double inr;
        char ansr ;
        do {
            System.out.println("different types of converters");
            System.out.println("1.DollarToInr");
            System.out.println("2.DollarToEuro");
            System.out.println("3.DollarToYen");
            System.out.println("4.DollarToPound");
            System.out.println("5.DollarToCad");
            System.out.println("6.InrToDollar");

            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            choice = sc.nextInt();
            System.out.println("enter today rate");
            todayRate = sc.nextDouble();
            currencyCov cc = new currencyCov(todayRate);
            switch (choice){
                case 1 :
                    System.out.println("enter dollar");
                    double dollar = sc.nextDouble();
                    System.out.println(dollar+"dollar are converted to "+ cc.DollarToInr(dollar)+ "INR");
                    break;
                case 2 :
                    System.out.println("enter dollar");
                    double dollare = sc.nextDouble();
                    System.out.println(dollare+"dollar are converted to "+ cc.DollarToEuro(dollare)+ "Euro");
                    break;
                case 3 :
                    System.out.println("enter dollar");
                    double dollary = sc.nextDouble();
                    System.out.println(dollary+"dollar are converted to "+ cc.DollarToYen(dollary)+ "Yen");
                    break;
                case 4 :
                    System.out.println("enter dollar");
                    double dollarp = sc.nextDouble();
                    System.out.println(dollarp+"dollar are converted to "+ cc.DollarToPound(dollarp)+ "Pound");
                    break;
                case 5 :
                    System.out.println("enter dollar");
                    double dollarc = sc.nextDouble();
                    System.out.println(dollarc+"dollar are converted to "+ cc.DollarToCad(dollarc)+ "CAD");
                    break;
                case 6 :
                    System.out.println("enter inr");
                    double Inr = sc.nextDouble();
                    System.out.println(Inr+"Inr are converted to "+cc.InrToDollar(Inr)+ "Dollar");
                    break;
            }
            System.out.println(" Click 'y' if u wanna try another one");
            ansr = sc.next().charAt(0);

        }while (ansr =='y');


    }
}

