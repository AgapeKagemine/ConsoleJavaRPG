package rpg;

public class Boss extends Base{
    private int min_attack;
    private int max_attack;
    private int max_zenny;

    public Boss(String name, int hp, int min, int max, int max_zenny){
        super(name, hp, 0);
        this.min_attack = min;
        this.max_attack = max;
        this.max_zenny = max_zenny;
    }

    public int getMinAP(){
        return this.min_attack;
    }

    public int getMaxAP(){
        return this.max_attack;
    }

    public int getMaxZen(){
        return this.max_zenny;
    }
}