package rpg;

public class Boss extends Base{
    private int min_attack;
    private int max_attack;

    public Boss(String name, int hp, int min, int max){
        super(name, hp, 0);
        this.min_attack = min;
        this.max_attack = max;
    }

    public int getMinAP(){
        return this.min_attack;
    }

    public int getMaxAP(){
        return this.max_attack;
    }
}