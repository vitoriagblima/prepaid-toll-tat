package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Tag;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        Tag tag;
        System.out.print("Enter tag number: ");
        int tagNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter tag holder: ");
        String holderName = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            tag = new Tag(tagNumber, holderName, initialDeposit);
        } else {
            tag = new Tag(tagNumber, holderName);
        }

        System.out.println();
        System.out.println("Tag data: ");
        System.out.println(tag);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        tag.recharge(depositValue);
        System.out.println("Updated tag data: ");
        System.out.println(tag);

        System.out.println();
        System.out.print("Enter a toll passage value: ");
        double tollFee = sc.nextDouble();
        tag.payToll(tollFee); 
        System.out.println("Updated tag data: ");
        System.out.println(tag);
        
        sc.close();
    }
}