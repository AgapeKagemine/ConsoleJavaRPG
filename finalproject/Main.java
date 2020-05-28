package finalproject;

import java.util.ArrayList;
import java.util.Scanner;

/*
        +===============================================================+
        + Food                         |   Price                        +
        +------------------------------|--------------------------------+
        + Nasi Goreng                  |   Rp.25.000,-                  +
        + Mie Goreng                   |   Rp.20.000,-                  +
        + Kwetiau Goreng               |   Rp.28.000,-                  +
        + Bihun Goreng                 |   Rp.22.000,-                  +
        + Ayam Kalasan                 |   Rp.18.000,-                  +
        + Sate Ayam(1 tusuk)           |   Rp.2.000,-                   +
        + Telur Dadar                  |   Rp.5.000,-                   +
        +------------------------------|--------------------------------+
        + Drinks                       |   Price                        +
        +------------------------------|--------------------------------+
        + Teh Manis                    |   Rp.8.000,-                   +
        + Teh Tawar                    |   Rp.6.000,-                   +
        + Aqua                         |   Rp.5.000,-                   +
        + Es Cappuccino                |   Rp.18.000,-                  +
        + Es Jeruk                     |   Rp.18.000,-                  +
        +===============================================================+
*/

public class Main implements Runnable{

    private Scanner sc = new Scanner(System.in);
    private Integer choice = 0;
    private String name = new String();
    private Integer quantity = -1;
    private Long price = null;
    private String type = new String();

    ArrayList<MenuResto> resto = new ArrayList<>();

    public void run(){
        Food f = new Food("Nasi Goreng", 2, (long)25000); resto.add(f);
        f = new Food("Mie Goreng", 5, (long)20000); resto.add(f);
        f = new Food("Kwetiau Goreng", 4, (long)28000); resto.add(f);
        f = new Food("Bihun Goreng", 5, (long)22000); resto.add(f);
        f = new Food("Ayam Kalasan", 10, (long)18000); resto.add(f);
        f = new Food("Sate Ayam", 30, (long)2000); resto.add(f);
        f = new Food("Telur Dadar", 15, (long)5000); resto.add(f);
        Drink d = new Drink("Teh Manis", 10, (long)8000); resto.add(d);
        d = new Drink("Teh Tawar", 5, (long)6000); resto.add(d);
        d = new Drink("Aqua", 10, (long)5000); resto.add(d);
        d = new Drink("Es Cappuccino", 4, (long)18000); resto.add(d);
        d = new Drink("Es Jeruk", 7, (long)18000); resto.add(d);
    }

    /*-------Main Menu-------*/
    public Main () {
        run();
        while(true){
            do {
                System.out.println("******************************************");
                System.out.println("+                MAIN MENU               +");
                System.out.println("+========================================+");
                System.out.println("+               HARDY RESTO              +");
                System.out.println("+========================================+");
                System.out.println("+ Please choose your role below:         +");
                System.out.println("+----------------------------------------+");
                System.out.println("+ 1. Administrator                       +");
                System.out.println("+ 2. Customers                           +");
                System.out.println("+ 3. Exit                                +");
                System.out.println("+----------------------------------------+");
                System.out.print("Your Choice: ");
                try {
                    choice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 3");
                    choice = 0;
                }
            }while(choice < 1 || choice > 3);

            switch(choice) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    menuCustomer();
                    break;
                case 3:
                    System.out.println("Thanks for Using This Application!");
                    resto.clear();
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
    }
    /*-------Buat nge print list menu makanan/minumannya-------*/
    public void listMenuFood () {
        if (resto.isEmpty()) {
            System.out.println("No Food Available, sorry UwU");
        }
        else {
            System.out.println("+==============================================================================+");
            System.out.println("+ No | Food                           | Total Price                            +");
            System.out.println("+==============================================================================+");
            for (int i = 0; i<resto.size(); i++) {
                MenuResto R = resto.get(i);
                if (R instanceof Food) {
                    System.out.printf("+ %-2d | %-30s | %-38d +\n", i+1, R.getName(), R.getInitialPrice());
                }
            }
        }
        
        
    }

    public void listMenuDrink () {
        if (resto.isEmpty()) {
            System.out.println("No Drink Available, sorry UwU");
        }
        else {
            System.out.println("+==============================================================================+");
            System.out.println("+ No | Drink                          | Total Price                            +");
            System.out.println("+==============================================================================+");
            for (int i = 0; i<resto.size(); i++) {
                MenuResto R = resto.get(i);
                if (R instanceof Drink){
                    System.out.printf("+ %-2d | %-30s | %-38d +\n", i+1, R.getName(), R.getInitialPrice());
                }
            }
        }
        
        
    }

    /*-------Menu Admin utk add item & remove item dari list menu makanan/minumannya-------*/
    public void menuAdmin () {
        do {
            do {
                System.out.println("+==============================================================================+");
                System.out.println("+ Hello Mr/Mrs. Administrator                                                  +");
                listMenuFood();
                listMenuDrink();
                System.out.println("+------------------------------------------------------------------------------+");
                System.out.println("+ 1. Add Item to Menu                                                          +");
                System.out.println("+ 2. Remove Item from Menu                                                     +");
                System.out.println("+ 3. Exit to the Main Menu                                                     +");
                System.out.println("+------------------------------------------------------------------------------+");
                System.out.print("Your Choice: ");
                try {
                    choice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 3");
                    System.out.println("Please Try Again!");
                    choice = 0;
                }
            }while(choice < 1 || choice > 3);
            
            switch(choice) {
                case 1:
                    addItems();
                    break;
                case 2:
                    removeItems();
                    break;
            }
        }while(choice != 3);
    }

    /*-------Menu 'Add Item' utk Admin------- */
    public void addItems () {
        
        type = "";
        name = "";
        quantity = -1;
        price = null;

        do{
            System.out.print("Input Type [Food || Drink]: ");
            type = sc.next();
        }while(!type.equalsIgnoreCase("food") && !type.equalsIgnoreCase("drink"));

        if(type.equalsIgnoreCase("food")){
            do {
                System.out.print("Insert Food Name [4 - 30 characters]: ");
                name = sc.next();
            }while(name.length() < 4 || name.length() > 30); sc.nextLine();
        }
        else{
            do {
                System.out.print("Insert Drink Name [4 - 30 characters]: ");
                name = sc.next();
            }while(name.length() < 4 || name.length() > 30); sc.nextLine();
        }

        do {
            try {
                System.out.print("Insert Quantity [More Than 0]: ");
                quantity = Integer.parseInt(sc.next());
            } catch (Exception e) {
                quantity = -1;
            }
        }while(quantity <= 0); sc.nextLine();
        
        do{
            System.out.print("Insert Price [More than 1000]: ");
            price = Long.parseLong(sc.next());
        }while(price <= 1000); sc.nextLine();
        
        if(type.equalsIgnoreCase("food")){
            Food f = new Food(name, quantity, price);
            resto.add(f);
        }
        else{
            Drink d = new Drink(name, quantity, price);
            resto.add(d);
        }

    }
    
    /*-------Utk remove items (buat Admin)-------*/
    public void removeItems () {
        if (resto.isEmpty()) {
            System.out.println("No Data Available, sorry :/");
            System.out.println("Press Enter to Continue...");
            sc.nextLine();
        }
        else {
            // TODO Remove Items
        }
    }

    /*-------Menu Customers-------*/
    public void menuCustomer () {
        String customer_name = new String();
        
        do{
            System.out.print("Insert Name: ");
            customer_name = sc.next();
        }while(customer_name.length() < 3);

        do{
            do{
                System.out.println("+==============================================================================+");
                System.out.printf("+ Hello Mr/Mrs. %-30s                                 +\n", customer_name);
                listMenuFood();
                listMenuDrink();
                System.out.println("+------------------------------------------------------------------------------+");
                System.out.println("+ 1. Select Menu                                                               +");
                System.out.println("+ 2. Pay                                                                       +");
                System.out.println("+ 3. Exit                                                                      +");
                System.out.println("+------------------------------------------------------------------------------+");
                System.out.print("Your Choice: ");
                try {
                    choice = Integer.parseInt(sc.next());
                } catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 3");
                    System.out.println("Please Try Again!");
                    choice = 0;
                }
            }while(choice < 1 || choice > 3);
            
            switch(choice){
                case 1:
                    customerMenu();
                    break;
                case 2:
                    pay();
                    break;
            }
        }while(choice != 3);
    }

    /*-----Menu untuk pilih makanan atau minuman (customers)-----*/
    public void customerMenu (){
        // TODO Customer Menu Selection
    }

    /*-----Menu untuk pembayaran (customers)-----*/
    public void pay (){
        //TODO Customer Payment
    }
    
    
    /*-------Start------*/
    public static void main (String[] args) {
        new Main();
    }
}