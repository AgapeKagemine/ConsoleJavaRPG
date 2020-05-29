package rpg;

// TODO: Check Character Class

public class Character extends Base{
    private Integer zenny = 15;
    private String equipWeapon = "Copper Sword";
    private String equipArmor = "Copper Plate";

    public Character(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public Integer getZenny() {
        return zenny;
    }

    public void setZenny(Integer zenny) {
        this.zenny = zenny;
    }

    public String getEquipWeapon() {
        return equipWeapon;
    }

    public void setEquipWeapon(String equipWeapon) {
        this.equipWeapon = equipWeapon;
    }

    public String getEquipArmor() {
        return equipArmor;
    }

    public void setEquipArmor(String equipArmor) {
        this.equipArmor = equipArmor;
    }
}