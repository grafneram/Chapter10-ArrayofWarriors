// Ashley Grafner
// CSC 10606080 , 10 Array of Warriors
// 10/19/2022
/*Array of five Warrior objects. Assign each Warrior a different nickName.
Give each warrior a random amount of damage between 1 and 10 (inclusive).
Print the information for each of the five Warriors by using the printInfo() function of the Warrior class.*/
import java.util.Random;
public class Ch10 {
    public static void main(String[] args) { //main method


        class WarriorFred {
            private String nickName = "unknown";
            private int lifeForce = 10;
            private int damage = 0;

            String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"}; //armory array

            public WarriorFred(String setNickName, int lifeForce, int damage) { //constructor
                this.nickName = setNickName;

            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }


            public int getLifeForce() {
                return lifeForce;
            }

            public void setLifeForce(int lifeForce) {
                this.lifeForce = lifeForce;
            }


            public int getDamage() {
                if (damage + takenDamage() >= 10) {
                    lifeForce= lifeForce - 1;
                    damage = 0;
                }
                if (damage + takenDamage() < 10) {
                    damage = damage + takenDamage();
                }
                return damage;
            }

            public void setDamage (int Damage) {
                this.damage = damage;
            }



            public int takenDamage () { //random number for damage taken (1-10)
                int[] damageDone = {1,2,3,4,5,6,7,8,9,10};
                Random random = new Random();
                return (damageDone[random.nextInt(damageDone.length)]);
            }


            public void reaction () {
                String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
                Random random = new Random();
                System.out.println(sound[random.nextInt(sound.length)]);
            }



            public void reSpawn() { //sets lifeForce back to 10 hp
                lifeForce = 10;
            }
            public boolean isDead () {
                if (lifeForce <= 0) return true;
                else return false;
            }
            public boolean isAlive () {
                if (lifeForce > 0) return true;
                else return false;
            }
        }



        WarriorFred archer = new WarriorFred("Warrior Archer",10,0); //new obj named Warrior Archer
        WarriorFred mage = new WarriorFred("Warrior Mage",10,0);//new obj named Warrior Mage
        WarriorFred healer = new WarriorFred("Warrior Healer",10,0);//new obj named Warrior Healer
        WarriorFred tank = new WarriorFred("Warrior Tank",10,0);//new obj named Warrior Tank
        WarriorFred rouge = new WarriorFred("Warrior Rouge",10,0);//new obj named Warrior Rouge

        System.out.println("*** Battle! ***   All warriors start with 10 units of health for 10 rounds");
        for (int i = 1; i < 11; i++) { // 10 rounds
            System.out.println("\nRound: "+i);

            System.out.println("\n" + archer.getNickName() + " status (health=" + archer.getLifeForce() + ", damage=" + archer.getDamage() + ")");
            System.out.println("Archer is attacked and takes " + archer.takenDamage() + " units of damage");
            archer.reaction();

            System.out.println("\n" + mage.getNickName() + " status (health=" + mage.getLifeForce() + ", damage=" + mage.getDamage() + ")");
            System.out.println("Mage is attacked and takes " + mage.takenDamage() + " units of damage");
            mage.reaction();

            System.out.println("\n" + healer.getNickName() + " status (health=" + healer.getLifeForce() + ", damage=" + healer.getDamage() + ")");
            System.out.println("Healer is attacked and takes " + healer.takenDamage() + " units of damage");
            healer.reaction();

            System.out.println("\n" + tank.getNickName() + " status (health=" + tank.getLifeForce() + ", damage=" + tank.getDamage() + ")");
            System.out.println("Tank is attacked and takes " + tank.takenDamage() + " units of damage");
            tank.reaction();

            System.out.println("\n" + rouge.getNickName() + " status (health=" + rouge.getLifeForce() + ", damage=" + rouge.getDamage() + ")");
            System.out.println("Rouge is attacked and takes " + rouge.takenDamage() + " units of damage");
            rouge.reaction();
        }
    }
}


/*Code should look like this:
    Warrior Archer status (health=10, damage=0) //start at health=10 and damage=0
    Archer is attacked and takes 9 units of damage //random amount of damage
    That one hurt!

    Warrior Archer status (health=10, damage=9) //sets takenDamage -> damage
    Archer is attacked and takes 3 units of damage
    POW!

    Warrior Archer status (health=9, damage=0) //9+3>=10... so damage=0 and health= health - 1
    Archer is attacked and takes 6 units of damage
    Wham!

    Warrior Archer status (health=9, damage=6)
    Archer is attacked and takes 5 units of damage
    KaPow!

    Warrior Archer status (health=8, damage=0)
    Archer is attacked and takes 10 units of damage
    KaPow!
*/




