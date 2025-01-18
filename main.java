import java.util.Random;


public class main {

    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Weapon weaponOne = new Weapon();
        Weapon weaponTwo = new Weapon();
        int damage;

        weaponOne.SetWeaponType("scythe");
        weaponOne.SetWeaponAction("Slashes");
        weaponTwo.SetWeaponType("axe");
        weaponTwo.SetWeaponAction("hacks");

        playerOne.SetName("Isildur");
        playerOne.SetWeapon(weaponOne);
        playerTwo.SetName("Adar");
        playerTwo.SetWeapon(weaponTwo);


        while (playerOne.GetHealth() >= 0 || playerTwo.GetHealth() >= 0) {
            damage = DamageRoll();
            System.out.println(playerOne.GetWeapon().Strike(damage));
            System.out.println(playerTwo.Attack(damage) + "\n\n");

            if (playerTwo.GetHealth() <= 0) {
                break;
            }

            damage = DamageRoll();
            System.out.println(playerTwo.GetWeapon().Strike(damage));
            System.out.println(playerOne.Attack(damage) + "\n\n");
            

        }
        
        if (playerOne.GetHealth() >= 0) {
            System.out.println(playerOne.GetName() + " wins!!!");
        } else {
            System.out.println(playerTwo.GetName() + " wins !!!");
        }

    }
    
    public static int DamageRoll() {
        Random random = new Random();
        return random.nextInt(30);
    }
    


}       

             

             