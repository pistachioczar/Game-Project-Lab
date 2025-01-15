import java.util.Random;

public class main {
    
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public class Weapon{
        String weaponType;
        String weaponAction;

        Weapon(){
            weaponType="Rubber Duck";
            weaponAction="squishes";
        }

        public static int Strike(int damage){
            Random random = new Random();
            damage = random.nextInt(7);
            

            return damage;
        }
    }

    public class Player{
        String playerName;
        int health;
        Weapon weapon;
    
        Player(){
            playerName="unnamed";
            health=100;
            weapon = new Weapon();
        }
    }
}