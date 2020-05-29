package rpg;

// TODO: Check Equipment Class
public abstract class equipment{
    private String name;
    private int count;
    private int hp;
    private int ap;

    public equipment(String name, int hp, int ap, int count) {
        this.name = name;
        this.count = count;
        this.hp = hp;
        this.ap = ap;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
}