public class Player {
    String playerName;
    int health;
    Weapon playerWeapon;

    public Player() {
        playerName = "N/A";
        health = 100;
    }
    
    public void SetName(String name) {
        this.playerName = name;
    }

    public String GetName() {
        return this.playerName;
    }

    public void SetWeapon(Weapon weapon) {
        this.playerWeapon = weapon;
    }

    public Weapon GetWeapon() {
        return this.playerWeapon;
    }

    public void SetHealth(int newHealth) {
        this.health = newHealth;
    }

    public int GetHealth() {
        return this.health;
    }

    public String Attack(int dmg) {
        this.health -= dmg;

        if (this.health < 0) {
            this.health = 0;
        }
        return playerName + " is now at " + health + " health";
    }
}
