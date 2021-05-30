package quizst3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Type your name!");

        String userName = myObj.nextLine();  // Read user input
        //1 done
        System.out.println("Σε ποίο γυμνάσιο θα πας?");
        String Gymnasio = myObj.nextLine();  // Read user input
        //2 done
        System.out.println("Θα παραμεινεις στην ομαδικη μετα το γυμνασιο?");
        String Omadikh = myObj.nextLine();  // Read user input
        //3 done
        System.out.println("Παίζεις minecraft");
        String minecraft = myObj.nextLine();  // Read user input
        //4 done
        System.out.println("Σε ποιό τμήμα είσαι(στο δημοτικό)?");
        String Tmhma = myObj.nextLine();  // Read user input
        //5 done
        System.out.println("Παιζεις cod?");
        String cod = myObj.nextLine();  // Read user input

        System.out.println("Βλέπεις dreamSMP?");
        String DREAMSMP = myObj.nextLine();  // Read user input


        System.out.println("So you're name is " + userName);
        System.out.println("Θα πας στο " + Gymnasio);
        System.out.println("Θα μεινεις στην ομαδα?:" + Omadikh);
        System.out.println("I will compile it and add it to the database");
        System.out.println("Shuting Down...");
    }
}
