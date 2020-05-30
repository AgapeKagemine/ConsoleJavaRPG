package rpg;

// TODO: Recheck
// TODO: Documentation

public class Main implements Interface {
    /*-----Init-----*/
    java.util.Scanner sc = new java.util.Scanner(System.in);
    java.util.ArrayList<equipment> list = new java.util.ArrayList<>();
    Character player = new Character("Player");

    /*-----Main Menu-----*/
    public void menu () {
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
                    System.out.println("Press Enter to Retry..."); sc.nextLine();
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
                    System.out.println("Press Enter to Retry..."); sc.nextLine();
                    boss = 0;
                }sc.nextLine();
            }while(boss < 1 || boss > 5);
            switch(boss) {
                case 1:
                    Boss goblin = new Boss("Goblins", 40, 3, 5, 2);
                    bossFight(goblin);
                    break;
                case 2:
                    Boss talon = new Boss("Talon The Mercenary", 100, 5, 10, 5);
                    bossFight(talon);
                    break;
                case 3:
                    Boss medusa = new Boss("Queen of Snakes: Medusa", 250, 15, 25, 8);
                    bossFight(medusa);
                    break;
                case 4:
                    Boss galakrond = new Boss("Galakrond The Undying", 500, 30, 50, 10);
                    bossFight(galakrond);
                    break;
            }
        }while(boss != 5);
    }

    /*-----Boss Fight-----*/
    public void bossFight (Boss boss) {
        int fightChoice = 0;
        int health = player.getHp();
        do {
            do {
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.println("+                                                           +");
                System.out.printf("+            %-25s                      +\n", boss.getName());
                System.out.printf("+            HP: %-3d                                        +\n", boss.getHp());
                System.out.println("+                                                           +");
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("+                                                           +");
                System.out.printf("+             %-10s                                          +\n", player.getName());
                System.out.printf("+             Health Point: %-3d                             +\n", health);
                System.out.printf("+             Attack Power: %-3d                             +\n", player.getAp());
                System.out.println("+                                                           +");
                System.out.println("+                     1. Attack                             +");     
                System.out.println("+                     2. Heal                               +");
                System.out.println("+                     3. Run Away                           +");
                System.out.println("+                                                           +");
                System.out.println("+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+");
                System.out.print("Your Decision: ");
                try {
                    fightChoice = Integer.parseInt(sc.next());
                }
                catch (Exception e) {
                    System.out.println("Error! Input Must Be A Number Between 1 to 4!");
                    System.out.println("Press Enter to Retry..."); sc.nextLine();
                    fightChoice = 0;
                }sc.nextLine();
            }while(fightChoice < 1 || fightChoice > 3);
            System.out.println("");
            //kalo dua"nya msh idup
            if(health > 0 && boss.getHp() > 0 && fightChoice != 3){  
                switch(fightChoice) {
                    case 1: /*-------Attack-------*/
                        int temp = searchEquip();
                        Weapon w = new Weapon(list.get(temp).getName(), list.get(temp).getAp(), 0);
                        int damage = java.util.concurrent.ThreadLocalRandom.current().nextInt(w.getMinAttack(), w.getMaxAttack()) + 5;
                        System.out.println(player.getName() + " Dealt " + damage + " Damage");
                        boss.setHp(boss.getHp() - damage);
                        break;
                    case 2: /*-------Heal--------*/
                        if(health < player.getHp()){
                            int diff = player.getHp() - health;
                            if(player.getHp() > 50)
                                if(diff < 50)
                                    health = health + diff;
                                else
                                    health = health + heal;
                            else
                                health = health + diff;
                            System.out.println(player.getName() + " Recovered " + diff + " HP");
                        }else{
                            System.out.println("You Can't do This Anymore Due to Having Full Health");
                        }
                        break;
                }
                int boss_damage = java.util.concurrent.ThreadLocalRandom.current().nextInt(boss.getMinAP(), boss.getMaxAP());
                // Boss Attack Player
                System.out.println(boss.getName() + " Dealt " + boss_damage + " Damage");
                health = health - boss_damage;
            }    
            //klo boss nya mati
            if(boss.getHp() <= 0) {
                java.util.Random random_zenny = new java.util.Random();
                int loot = random_zenny.nextInt(boss.getMaxZen()) + 1;
                player.setZenny(player.getZenny() + loot);
                System.out.println("You Got " + loot + " Zenny");
                System.out.println("Mission Accomplished!");
                System.out.println("Press Enter to Continue..."); sc.nextLine();
            }
            //klo playernya mati 
            else if(health <= 0){
                System.out.println("You Have Been Slain, Try Again Next Time!");
                System.out.println("Press Enter to Continue..."); sc.nextLine();
            }
        }while(fightChoice != 3 && (boss.getHp() > 0 && health > 0));
    }
    
    /*------Buat nyari index item yang mau di equip-------*/
    public int searchEquip () {
        int a = 0;
        for(equipment x : list){
            if(player.getEquipWeapon().equalsIgnoreCase(x.getName()))
                break;
            a++; 
        }
        return a;
    }

    /*-----Menu Customization-----*/
    public void charCustomization () {
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
                    System.out.println("Error! Input Must Be A Number Between 0 to 14!");
                    System.out.println("Press Enter to Retry..."); sc.nextLine();
                    customChoice = 0;
                }sc.nextLine();
            }while(customChoice < 0 || customChoice > 14);
            if(customChoice > 0){
                if(list.get(customChoice - 1).getCount() == 0){
                    System.out.println("There Are No Weapon in Inventory");
                    System.out.println("Press Enter to Continue..."); sc.nextLine();
                }else{
                    if(customChoice < 8){
                        if(!list.get(customChoice - 1).getName().equalsIgnoreCase(player.getEquipWeapon())){
                            player.setEquipWeapon(list.get(customChoice - 1).getName());
                            System.out.println("The Weaponpiece Called " + list.get(customChoice - 1).getName() 
                                + " Has Successfuly Been Equipped");
                            player.setAp(base_char_attack + list.get(customChoice - 1).getAp());
                            System.out.println("Press Enter to Continue..."); sc.nextLine();
                        }else{
                            System.out.println(list.get(customChoice - 1).getName() + " Already Been Equipped...");
                            System.out.println("Press Enter to Continue..."); sc.nextLine();
                        }
                    }else{
                        if(!list.get(customChoice - 1).getName().equalsIgnoreCase(player.getEquipArmor())){   
                            player.setEquipArmor(list.get(customChoice - 1).getName());
                            System.out.println("The Armorpiece Called " + list.get(customChoice - 1).getName() 
                                + " Has Successfuly Been Equipped");
                            player.setHp(base_char_hp + list.get(customChoice - 1).getHp());
                            System.out.println("Press Enter to Continue..."); sc.nextLine();
                        }else{
                            System.out.println(list.get(customChoice - 1).getName() + " Already Been Equipped...");
                            System.out.println("Press Enter to Continue..."); sc.nextLine();
                        }
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
                System.out.printf("+               %-2d" + ". %-25s x%-3d" + "( +%-3d" + " Damage )         +\n",
                    a, x.getName(), x.getCount(), x.getAp());
            }else{
                System.out.printf("+               %-2d" + ". %-25s x%-3d" + "  ( +%-3d" + " HP )           +\n", 
                    a, x.getName(), x.getCount(), x.getHp());
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
                    System.out.println("Error! Input Must Be A Number Between 1 to 3!");
                    System.out.println("Press Enter to Retry..."); sc.nextLine();
                    rollOptions = 0;
                }sc.nextLine();
                switch(rollOptions){
                    case 1:
                        if(player.getZenny() < 5){
                            System.out.println("Not Enough Zenny!");
                        }else{
                            player.setZenny(player.getZenny() - 5);
                            gacha solo = new gacha(list);
                            solo.roll(1);
                        }
                        break;
                    case 2:
                    if(player.getZenny() < 15){
                        System.out.println("Not Enough Zenny!");
                    }else{
                        player.setZenny(player.getZenny() - 15);
                        gacha tri = new gacha(list);
                        tri.roll(3);
                        }
                        break;
                }
                System.out.println("Press Enter to Continue..."); sc.nextLine();
            }while(rollOptions < 1 || rollOptions > 3);
        }while(rollOptions != 3);
    }

    public void init(){
        String name = new String();
        
        do {
            System.out.println("Warning! Players Name Can't Be Changed!");
            System.out.print("Insert Players Name [10 Character Max.]: ");
            name = sc.nextLine();
        }while(name.length() > 10);

        Weapon e = new Weapon("Copper Sword", 5, 1);
        list.add(e);
        e = new Weapon("Iron Sword", 10, 0);
        list.add(e);
        e = new Weapon("Gold Sword", 15, 0);
        list.add(e);
        e = new Weapon("Diamond Sword", 25, 0);
        list.add(e);
        e = new Weapon("Nightedge", 30, 0);
        list.add(e);
        e = new Weapon("Blade of The Ruin King", 40, 0);
        list.add(e);
        e = new Weapon("Terra Blade", 100, 0);
        list.add(e);
        
        Armor d = new Armor("Copper Plate", 10, 1);
        list.add(d);
        d = new Armor("Iron Plate", 15, 0);
        list.add(d);
        d = new Armor("Gold Plate", 25, 0);
        list.add(d);
        d = new Armor("Diamond Plate", 40, 0);
        list.add(d);
        d = new Armor("Galakrond Plate", 60, 0);
        list.add(d);
        d = new Armor("Mirror Plate", 30, 0);
        list.add(d);
        d = new Armor("Terra Plate", 100, 0);
        list.add(d);

        player.setName(name);
        player.setEquipWeapon(list.get(0).getName());
        player.setAp(list.get(0).getAp() + base_char_attack);
        player.setEquipArmor(list.get(7).getName());
        player.setHp(list.get(7).getHp() + base_char_hp);
    }

    public void print(){
        for(int x = 0; x <= 20; x++){
            System.out.println("");
        }
    }

    public Main() {
        init();
        menu();
        sc.close();
        list.clear();
    }

    public static void main(String args[]){
        new Main();
    }
}