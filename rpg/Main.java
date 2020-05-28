package rpg;

import java.util.Scanner;

// TODO: Gacha
// TODO: Implements MultiThreadding
// TODO: HashMap for Storing Weapon List
// TODO: Recheck
// TODO: Documentation

public class Main {
    /*-----Init-----*/
    Scanner sc = new Scanner(System.in);

    /*-----Main Menu-----*/
    public void menu(){
        // TODO: Main Menu
        int choice;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                           +");
                System.out.println("+                                                           +");
                System.out.println("+                        JAVA QUEST                         +");
                System.out.println("+                                                           +");
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                           +");
                System.out.println("+                      1. Battle                            +");
                System.out.println("+                      2. Character Customization           +");
                System.out.println("+                      3. Gacha                             +");
                System.out.println("+                      4. Exit The Game                     +");
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your choice: ");
                try {
                    choice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 4!");
                    System.out.println("Press enter to retry...");
                    choice = 0;
                    sc.nextLine();
                }
            }while(choice < 1 || choice > 4);
            switch(choice) {
                case 1:
                    battle();
                    break;
                case 2:
                    charCustomization();
                    break;
                case 3:

                    break;
            }
        }while(choice != 4);
    }

    /*-----Menu Battle-----*/
    public void battle () {
        // TODO: Battle Menu
        int boss;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                                   +");
                System.out.println("+                              *BOSSES*                             +");
                System.out.println("+                    1. Galakron The Undying [Hard]                 +");
                System.out.println("+                    2. Queen of Snakes: Medusa [Medium]            +");
                System.out.println("+                    3. Talon The Mercenary [Easy]                  +");
                System.out.println("+                    4. Goblins [Beginner]                          +");
                System.out.println("+                                                                   +");
                System.out.println("+-------------------------------------------------------------------+");
                System.out.println("+                                                                   +");
                System.out.println("+                    5. Quit The Battle                             +");
                System.out.println("+                                                                   +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your choice: ");
                try {
                    boss = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 5!");
                    System.out.println("Press enter to retry...");
                    boss = 0;
                    sc.nextLine();
                }
            }while(boss < 1 || boss > 5);
            switch(boss) {
                case 1:
                    // TODO: Galakron Boss Fight
                    break;
                case 2:
                    // TODO: Medusa Boss Fight
                    break;
                case 3:
                    // TODO: Talon Boss Fight
                    break;
                case 4:
                    // TODO: Goblins Boss Fight
                    break;
            }
        }while(boss != 5);
    }

    /*-----Boss Fight-----*/
    public void bossFight    () {
        // TODO: bossFight
        int fightChoice;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                           +");
                System.out.println("+                        {BOSS NAME}                        +");
                System.out.println("+                         {BOSS HP}                         +");
                System.out.println("+                                                           +");
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("+                                                           +");
                System.out.println("+                         1. Attack                         +");
                System.out.println("+                         2. Guard                          +");
                System.out.println("+                         3. Run Away                       +");
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your Decision: ");
                try {
                    fightChoice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 3!");
                    System.out.println("Press enter to retry...");
                    fightChoice = 0;
                    sc.nextLine();
                }
            }while(fightChoice < 1 || fightChoice > 3);
        }while(fightChoice != 3);
    }

    /*-----Menu Customization-----*/
    public void charCustomization () {
        // TODO: Character Customization Menu
        int customChoice;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                                         +");
                System.out.println("+                Choose The Gear that You Want to Upgrade:                +");
                System.out.println("+                                 1. Weapon                               +");
                System.out.println("+                                 2. Armor                                +");
                System.out.println("+                                                                         +");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println("+                                 3. Exit                                 +");
                System.out.println("+                                                                         +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your choice: ");
                try {
                    customChoice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 3!");
                    System.out.println("Press enter to retry...");
                    customChoice = 0;
                    sc.nextLine();
                }
            }while(customChoice < 1 || customChoice > 3);
            switch(customChoice) {
                case 1:

                    break;
                case 2:

                    break;
            }
        }while(customChoice != 3);
    }

    public void weapon () {
        // TODO: Weapon Listing
        int weaponChoice;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                             +");
                System.out.println("+                     Choose Your Weapon:                     +");
                System.out.println("+                 1. Copper Sword (+5 damage)                 +");
                System.out.println("+                 2. Iron Sword (+10 damage)                  +");
                System.out.println("+                 3. Gold Sword (+15 damage)                  +");
                System.out.println("+                 4. Diamond Sword (+25 damage)               +");
                System.out.println("+                 5. Nightedge (+30 damage)                   +");
                System.out.println("+                 6. Blade of The Ruin King (+40 damage)      +");
                System.out.println("+                 7. Terrablade (+100 damage)                 +");
                System.out.println("+                                                             +");
                System.out.println("+-------------------------------------------------------------+");
                System.out.println("+                 8. Go back                                  +");
                System.out.println("+                                                             +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your choice: ");
                try {
                    weaponChoice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 8!");
                    System.out.println("Press enter to retry...");
                    weaponChoice = 0;
                    sc.nextLine();
                }
            }while(weaponChoice < 1 || weaponChoice > 8);
            
        }while(weaponChoice != 8);
    }

    public void armor () {
        // TODO: Armor Listing
        int armorChoice;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                                 +");
                System.out.println("+                      Choose Your Armor:                         +");
                System.out.println("+                   1. Copper Plate (+10 Hp)                      +");
                System.out.println("+                   2. Iron Plate (+15 Hp)                        +");
                System.out.println("+                   3. Gold Plate (+25 Hp)                        +");
                System.out.println("+                   4. Diamond Plate (+40 Hp)                     +");
                System.out.println("+                   5. Galakron Plate (+60 Hp)                    +");
                System.out.println("+                   6. Mirror Plate (+30 Hp)                      +");
                System.out.println("+                   7. Terra Plate (+100 Hp)                      +");
                System.out.println("+                                                                 +");
                System.out.println("+-----------------------------------------------------------------+");
                System.out.println("+                   8. Go back                                    +");
                System.out.println("+                                                                 +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your Choice: ");
                try {
                    armorChoice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 8!");
                    System.out.println("Press enter to retry...");
                    armorChoice = 0;
                    sc.nextLine();
                }
            }while(armorChoice < 1 || armorChoice > 8);
        }while(armorChoice != 8);
    }

    public Main() {
        menu();
    }

    public static void main(String args[]){
        new Main();
    }
}