package rpg;

public class Character extends Base implements Interface{
    private Integer zenny = base_zenny;
    private String equipWeapon = new String();
    private String equipArmor = new String();

    public Character(String name) {
        super(name, base_char_hp, base_char_attack);
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