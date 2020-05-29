package rpg;

// TODO: Check Base Class
public abstract class Base{
    private String name;
    private Integer hp;
    private Integer ap;

    public Base(String name, int hp, int ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAp() {
        return ap;
    }

    public void setAp(Integer ap) {
        this.ap = ap;
    }
} 