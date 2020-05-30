package rpg;

public class gacha{

    java.util.ArrayList<equipment> list = new java.util.ArrayList<>();

    public gacha(java.util.ArrayList<equipment> list){
        this.list = list;
    }

    void roll(int times){
        for(int x = 0; x < times; x++){
            Thread t = new Thread(new rng(list));
            t.setName("Roll " + (x+1));
            t.start();
            
            try {
                Thread.sleep(1000);
                t.join();
            } catch (Exception e) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " Interrupted");
            }
        }
    }
}

class rng implements Runnable{
    java.util.Random rng = new java.util.Random();
    java.util.ArrayList<equipment> list = new java.util.ArrayList<>();

    public rng(java.util.ArrayList<equipment> list){
        this.list = list;
    }

    @Override
    public void run(){
        int gacha = (rng.nextInt(100) + 1);
        
        System.out.printf(Thread.currentThread().getName() + ": %-3d" + " Get Weapon: ", gacha);

        int count = 0;

        // name, hp, ap, count
        if(gacha <= 50){
             if(rng.nextInt(2) == 0){   
                System.out.println("Copper Sword");
                count = list.get(0).getCount();
                count += 1;
                Weapon e = new Weapon(list.get(0).getName(), list.get(0).getHp(), list.get(0).getAp(), count);
                list.set(0, e);
             }else{
                System.out.println("Copper Plate");
                count = list.get(7).getCount();
                count += 1;
                Armor d = new Armor(list.get(7).getName(), list.get(7).getHp(), list.get(7).getAp(), count);
                list.set(7, d);
             }
        }else if(gacha <= 70){
            if (rng.nextInt(2) == 0) {
                System.out.println("Iron Sword");
                count = list.get(1).getCount();
                count += 1;
                Weapon e = new Weapon(list.get(1).getName(), list.get(1).getHp(), list.get(1).getAp(), count);
                list.set(1, e);
            }else {
                System.out.println("Iron Plate");
                count = list.get(8).getCount();
                count += 1;
                Armor d = new Armor(list.get(8).getName(), list.get(8).getHp(), list.get(8).getAp(), count);
                list.set(8, d);
            }
        }else if(gacha <= 85){
            if (rng.nextInt(2) == 0) {
                System.out.println("Gold Sword");
                count = list.get(2).getCount();
                count += 1;
                Weapon e = new Weapon(list.get(2).getName(), list.get(2).getHp(), list.get(2).getAp(), count);
                list.set(2, e);
            }else{
                System.out.println("Gold Plate");
                count = list.get(9).getCount();
                count += 1;
                Armor d = new Armor(list.get(9).getName(), list.get(9).getHp(), list.get(9).getAp(), count);
                list.set(9, d);
            }
        }else if(gacha <= 90){
            if (rng.nextInt(2) == 0) {
                System.out.println("Diamond Sword");
                count = list.get(3).getCount();
                count += 3;
                Weapon e = new Weapon(list.get(3).getName(), list.get(3).getHp(), list.get(3).getAp(), count);
                list.set(3, e);
            }else {
                System.out.println("Diamond Plate");
                count = list.get(10).getCount();
                count += 1;
                Armor d = new Armor(list.get(10).getName(), list.get(10).getHp(), list.get(10).getAp(), count);
                list.set(10, d);
            }
        }else if(gacha <= 95){
            if (rng.nextInt(2) == 0) {
                System.out.println("Nightedge");
                count = list.get(4).getCount();
                count += 1;
                Weapon e = new Weapon(list.get(4).getName(), list.get(4).getHp(), list.get(4).getAp(), count);
                list.set(4, e);
            }else {
                System.out.println("Galakrond Plate");
                count = list.get(11).getCount();
                count += 1;
                Armor d = new Armor(list.get(11).getName(), list.get(11).getHp(), list.get(11).getAp(), count);
                list.set(11, d);
            }
        }else if(gacha <= 99){
            if (rng.nextInt(2) == 0) {
                System.out.println("Blade of The Ruin King");
                count = list.get(5).getCount();
                count += 1;
                Weapon e = new Weapon(list.get(5).getName(), list.get(5).getHp(), list.get(5).getAp(), count);
                list.set(5, e);
            }else {
                System.out.println("Mirror Plate");
                count = list.get(12).getCount();
                count += 1;
                Armor d = new Armor(list.get(12).getName(), list.get(12).getHp(), list.get(12).getAp(), count);
                list.set(12, d);
            }
        }else {
            if (rng.nextInt(2) == 0) {
                System.out.println("Terrablade");
                count = list.get(6).getCount();
                count += 1;
                Weapon e = new Weapon(list.get(6).getName(), list.get(6).getHp(), list.get(6).getAp(), count);
                list.set(6, e);
            }else {
                System.out.println("Terra Plate");
                count = list.get(13).getCount();
                count += 1;
                Armor d = new Armor(list.get(13).getName(), list.get(13).getHp(), list.get(13).getAp(), count);
                list.set(13, d);
            }
        }
    } 
}