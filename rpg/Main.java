package rpg;

// TODO: Gacha
// TODO: Implements MultiThreadding
// TODO: Recheck
// TODO: Documentation
// TODO: Make Heal
// TODO: Damage Calculation + Crit Chances
// TODO: Boss Lines
// TODO: Special Interactions
// TODO: Try To Make Pixel Pics
// TODO: Interface

public class Main {
    /*-----Init-----*/
    java.util.Scanner sc = new java.util.Scanner(System.in);
    java.util.ArrayList<equipment> list = new java.util.ArrayList<>();
    Character player = new Character("", 30, 5);

    /*-----Main Menu-----*/
    public void menu () {
        // TODO: Main Menu
        int choice = 0;
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
                System.out.printf("+                Hero: %-10s                           +\n", player.getName());
                System.out.printf("+                Health Point: %-4d                         +\n", player.getHp());
                System.out.printf("+                Attack Power: %-4d                         +\n", player.getAp());
                System.out.printf("+                Weapon: %-26s         +\n", player.getEquipWeapon());
                System.out.printf("+                Armor: %-27s         +\n", player.getEquipArmor());
                System.out.printf("+                Zenny: %-4d                                +\n", player.getZenny());
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                           +");
                System.out.println("+                      1. Battle                            +");
                System.out.println("+                      2. Equipment                         +");
                System.out.println("+                      3. Gacha                             +");
                System.out.println("+                      4. Exit The Game                     +");
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your choice: ");
                try {
                    choice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input Must Be A Number Between 1 to 4!");
                    System.out.println("Press Enter to Retry...");
                    choice = 0;
                }sc.nextLine();
            }while(choice < 1 || choice > 4);
            switch(choice) {
                case 1:
                    print();
                    battle();
                    System.out.println("Press Enter to Continue..."); sc.nextLine();
                    print();
                    break;
                case 2:
                    print();
                    charCustomization();
                    System.out.println("Press Enter to Continue..."); sc.nextLine();
                    print();
                    break;
                case 3:
                    print();
                    menuGacha();
                    System.out.println("Press Enter to Continue..."); sc.nextLine();
                    print();
                    break;
            }
        }while(choice != 4);
    }

    /*-----Menu Battle-----*/
    public void battle () {
        // TODO: Battle Menu
        int boss = 0;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                                   +");
                System.out.println("+                             *BOSSES*                              +");
                System.out.println("+                                                                   +");
                System.out.println("+-------------------------------------------------------------------+");
                System.out.println("+                                                                   +");
                System.out.println("+                    1. Goblins [Beginner]                          +");
                System.out.println("+                    2. Talon The Mercenary [Easy]                  +");
                System.out.println("+                    3. Queen of Snakes: Medusa [Medium]            +");
                System.out.println("+                    4. Galakrond The Undying [Hard]                +");
                System.out.println("+                                                                   +");
                System.out.println("+-------------------------------------------------------------------+");
                System.out.println("+                                                                   +");
                System.out.println("+                    5. Back To Menu                                +");
                System.out.println("+                                                                   +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your choice: ");
                try {
                    boss = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input Must Be A Number Between 1 to 5!");
                    System.out.println("Press Enter to Retry...");
                    boss = 0;
                }sc.nextLine();
            }while(boss < 1 || boss > 5);
            switch(boss) {
                case 1:
                    // TODO: Goblins Boss Fight 
                    break;
                case 2:
                    // TODO: Talon Boss Fight
                    break;
                case 3:
                    // TODO: Medusa Boss Fight 
                    break;
                case 4:
                    // TODO: Galakrond Boss Fight
                    break;
            }
        }while(boss != 5);
    }

    /*-----Boss Fight-----*/
    public void bossFight () {
        // TODO: 4 Boss
        int fightChoice = 0;
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
                System.out.println("+                         3. Heal                           +");
                System.out.println("+                         4. Run Away                       +");
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your Decision: ");
                try {
                    fightChoice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input Must Be A Number Between 1 to 4!");
                    System.out.println("Press Enter to Retry...");
                    fightChoice = 0;
                }sc.nextLine();
            }while(fightChoice < 1 || fightChoice > 4);
        }while(fightChoice != 4);
    }

    /*-----Menu Customization-----*/
    public void charCustomization () {
        // TODO: Enchance Weapon
        int customChoice = 0;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                                         +");
                System.out.println("+                Choose The Gear that You Wish to Equip:                  +");
                equip();
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println("+                                                                         +");
                System.out.println("+                                 0. Back                                 +");
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
                }sc.nextLine();
            }while(customChoice < 0 || customChoice > 14);
            if(customChoice > 0){
                if(list.get(customChoice - 1).getCount() == 0){
                    System.out.println("There Are No Weapon in Inventory");
                    System.out.println("Press Enter to Continue..."); sc.nextLine();
                }else{
                    if(customChoice < 8){
                        player.setEquipWeapon(list.get(customChoice - 1).getName());
                        System.out.println("The Weaponpiece Called " + list.get(customChoice - 1).getName() + " Has Successfuly Been Equipped");
                        player.setAp(player.getAp() + list.get(customChoice - 1).getAp());
                        System.out.println("Press Enter to Continue..."); sc.nextLine();
                    }else{
                        player.setEquipArmor(list.get(customChoice - 1).getName());
                        System.out.println("The Armorpiece Called " + list.get(customChoice - 1).getName() + " Has Successfuly Been Equipped");
                        player.setHp(player.getHp() + list.get(customChoice - 1).getHp());
                        System.out.println("Press Enter to Continue..."); sc.nextLine();
                    }
                }
            }
        }while(customChoice != 0);
    }

    public void equip () {
        System.out.println("+                                                                         +");
        int a = 1;
        for(equipment x : list){
            if(a == 1){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println("+                                 Weapon                                  +");
                System.out.println("+-------------------------------------------------------------------------+");
            }else if(a == 8){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println("+                                 Armor                                   +");
                System.out.println("+-------------------------------------------------------------------------+");
            }
            if(x instanceof Weapon){
                System.out.printf("+               %-2d" + ". %-25s x%-3d" + "( +%-3d" + " Damage )         +\n", a, x.getName(), x.getCount(), x.getAp());
            }else{
                System.out.printf("+               %-2d" + ". %-25s x%-3d" + "  ( +%-3d" + " HP )           +\n", a, x.getName(), x.getCount(), x.getHp());
            }
            a++;
        }
    }

    public void menuGacha () {
        int rollOptions = 0;
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                                 +");
                System.out.printf("+                          Zenny: %-4d                            +\n", player.getZenny());
                System.out.println("+                                                                 +");
                System.out.println("+             Select How Many Times You Want to Roll              +");
                System.out.println("+            ----------------------------------------             +");
                System.out.println("+                       1. 1 Roll (5 Zenny)                       +");
                System.out.println("+                      2. 3 Rolls (15 Zenny)                      +");
                System.out.println("+                                                                 +");
                System.out.println("+-----------------------------------------------------------------+");
                System.out.println("+                           3. Go Back                            +");
                System.out.println("+                                                                 +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your Choice: ");
                try {
                    rollOptions = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input must be a number between 1 to 3!");
                    System.out.println("Press enter to retry...");
                    rollOptions = 0;
                }sc.nextLine();
                switch(rollOptions){
                    case 1:
                        if(player.getZenny() < 5){
                            System.out.println("Not Enough Zenny!");
                            System.out.println("Press Enter to Continue..."); sc.nextLine();
                        }else{
                            player.setZenny(player.getZenny() - 5);
                            gacha solo = new gacha(list);
                            solo.roll(1);
                        }
                        break;
                    case 2:
                    if(player.getZenny() < 15){
                        System.out.println("Not Enough Zenny!");
                        System.out.println("Press Enter to Continue..."); sc.nextLine();
                    }else{
                        player.setZenny(player.getZenny() - 15);
                        gacha tri = new gacha(list);
                        tri.roll(3);
                        }
                        break;
                }
            }while(rollOptions < 1 || rollOptions > 3);
        }while(rollOptions != 3);
    }

    public void init(){
        String name = new String();
        do {
            System.out.println("Warning! Players Name Can't Be Changed!");
            System.out.print("Insert Players Name [10 Character Max.]: ");
            name = sc.next();
        }while(name.length() > 10);

        player.setName(name);

        Weapon e = new Weapon("Copper Sword", 0, 5, 1);
        list.add(e);
        e = new Weapon("Iron Sword", 0, 10, 0);
        list.add(e);
        e = new Weapon("Gold Sword", 0, 15, 0);
        list.add(e);
        e = new Weapon("Diamond Sword", 0, 25, 0);
        list.add(e);
        e = new Weapon("Nightedge", 0, 30, 0);
        list.add(e);
        e = new Weapon("Blade of The Ruin King", 0, 40, 0);
        list.add(e);
        e = new Weapon("Terra Blade", 0, 100, 0);
        list.add(e);
        
        Armor d = new Armor("Copper Armor", 10, 0, 1);
        list.add(d);
        d = new Armor("Iron Plate", 15, 0, 0);
        list.add(d);
        d = new Armor("Gold Plate", 25, 0, 0);
        list.add(d);
        d = new Armor("Diamond Plate", 40, 0, 0);
        list.add(d);
        d = new Armor("Galakrond Plate", 60, 0, 0);
        list.add(d);
        d = new Armor("Mirror Plate", 30, 0, 0);
        list.add(d);
        d = new Armor("Terra Plate", 100, 0, 0);
        list.add(d);
    }

    public void print(){
        for(int x = 0; x <= 10; x++){
            System.out.println("");
        }
    }

    public Main() {
        init();
        menu();
    }

    public static void main(String args[]){
        new Main();
    }
}