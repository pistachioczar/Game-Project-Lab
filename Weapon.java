public class Weapon {
    private String weaponType;
    private String weaponAction;

    public void SetWeaponType(String type) {
        this.weaponType = type;
    }

    public void SetWeaponAction(String action) {
        this.weaponAction = action;
    }

    public String Strike(int dmg) {
        return "The " + weaponType + " " + weaponAction + " and deals " + dmg + " damage.";
    }
}
