package rpg;

public class Weapon extends equipment {
    private int min_attack;
    private int max_attack;

    public Weapon(String name, int ap, int count) {
        super(name, 0, ap, count);
        generator();
    }

    public void generator () {
        this.min_attack = this.getAp() - 5;
        this.max_attack = this.getAp() + 5;
    }

    public int getMinAttack(){
        return min_attack;
    }

    public int getMaxAttack(){
        return max_attack;
    }
}