import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
    double amount, dollar, pound, code, euro, yen, ringgit, rupee;

    DecimalFormat f = new DecimalFormat("#.###");

    Scanner sc = new Scanner(System.in);

    System.out.println("hi, Welcome to the Currency Converter!");

    System.out.println("which currency You want to Convert ? ");
   
    System.out.println("1:Ruppe \n2:Dollar \n3:Pound \n4:Euro \n5:Yen ");
    code = sc.nextInt();
   
    System.out.println("How much Money you want to convert ?");
    amount = sc.nextFloat();
   
    // For amounts Conversion
    if (code == 1) {
    dollar = amount * 0.012;
    System.out.println("\nYour " + amount + " Rupee is : " + f.format(dollar) + " Dollar\n");

    pound = amount * 0.01;
    System.out.println("\nYour " + amount + " Rupee is : " + f.format(pound) + " Pound\n");

    euro = amount * 0.011;
    System.out.println("\nYour " + amount + " Rupee is : " + f.format(euro) + " Euro\n");

    yen = amount * 1.65;
    System.out.println("\nYour " + amount + " Rupee is : " + f.format(yen) + " Yen\n");
    }
   
    else if (code == 2) {
    // For Dollar Conversion
    rupee = amount * 82.73;
    System.out.println("\nYour " + amount + " Dollar is : " + f.format(rupee) + " Ruppes\n");

    pound = amount * 0.82;
    System.out.println("\nYour " + amount + " Dollar is : " + f.format(pound) + " Pound\n");

    euro = amount * 0.94;
    System.out.println("\nYour " + amount + " Dollar is : " + f.format(euro) + " Euro\n");

    yen = amount * 136.72;
    System.out.println("\nYour " + amount + " Dollar is : " + f.format(yen) + " Yen\n");
    } else if (code == 3) {
    // For Pound Conversion

    rupee = amount * 100.47;
    System.out.println("\nYour " + amount + " pound is : " + f.format(rupee) + " Ruppes\n");

    dollar = amount * 1.21;
    System.out.println("\nYour " + amount + " pound is : " + f.format(dollar) + " Dollar\n");

    euro = amount * 1.15;
    System.out.println("\nYour " + amount + " pound is : " + f.format(euro) + " Euro\n");

    yen = amount * 165.91;
    System.out.println("\nYour " + amount + " pound is : " + f.format(yen) + " Yen\n");
    } 
    
    
    else if (code == 4) {
    // For Euro Conversion

    rupee = amount * 87.65;
    System.out.println("\nYour " + amount + " euro is : " + f.format(rupee) + " Ruppes\n");
    dollar = amount * 1.06;
    System.out.println("\nYour " + amount + " euro is : " + f.format(dollar) + " Dollar\n");

    pound = amount * 0.87;
    System.out.println("\nYour " + amount + " euro is : " + f.format(pound) + " Pound\n");

    yen = amount * 144.84;
    System.out.println("\nYour " + amount + " euro is : " + f.format(yen) + " Yen\n");
    } 
    
    else if (code == 5) {

    // For Yen Conversion

    rupee = amount * 0.61;
    System.out.println("\nYour " + amount + " yen is : " + f.format(rupee) + " Ruppes\n");

    dollar = amount * 0.0073;
    System.out.println("\nYour " + amount + " yen is : " + f.format(dollar) + " Dollar\n");

    pound = amount * 0.0060;
    System.out.println("\nYour " + amount + " yen is : " + f.format(pound) + " Pound\n");

    euro = amount * 0.0069;
    System.out.println("\nYour " + amount + " yen is : " + f.format(euro) + " Euro\n");

    ringgit = amount * 0.037;
    System.out.println("\nYour " + amount + " yen is : " + f.format(ringgit) + " ringgit\n");
    } else {
    System.out.println("Invalid input");
    }
    }

}