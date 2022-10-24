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

            public WarriorFred(String setNickName, int setLifeForce, int setDamage) { //constructor
                this.nickName = setNickName; //explicit setters
                this.lifeForce = setLifeForce;
                this.damage = setDamage;
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
                return damage;
            }

            public void setDamage(int damage) {
                this.damage = damage;
            }


            public int takenDamage() { //random number for damage taken (1-10)
                int[] damageDone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                Random random = new Random();
                int newDamageDone = (damageDone[random.nextInt(damageDone.length)]);
                int calculatedDamage = damage + newDamageDone;

                if (calculatedDamage >= 10) {
                    lifeForce = lifeForce - 1; //subtract 1 from health
                    calculatedDamage = 0; //new total set to 0
                }
                if (calculatedDamage < 10) {
                    damage = calculatedDamage; //sets damage to taken+damage
                }
                return newDamageDone;
            }


            public void reaction() {
                String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
                Random random = new Random();
                System.out.println(sound[random.nextInt(sound.length)]);
            }


            public void reSpawn() { //sets lifeForce back to 10 hp
                lifeForce = 10;
            }

            public boolean isDead() {
                if (lifeForce <= 0) return true;
                else return false;
            }

            public boolean isAlive() {
                if (lifeForce > 0) return true;
                else return false;
            }

            public void display() {
                System.out.println("\n" + getNickName() + " status (health=" + getLifeForce() + ", damage=" + getDamage() + ")");
                System.out.println("Archer is attacked and takes " + takenDamage() + " units of damage");
                reaction();
            }

            public void fare() {
                System.out.println("\n" + getNickName() + " status (health=" + getLifeForce() + ", damage=" + getDamage() + ")");
            }


        }

        WarriorFred[] arr;
        arr = new WarriorFred[5];

        arr[0] = new WarriorFred("Warrior Archer", 10, 0);
        arr[1] = new WarriorFred("Warrior Mage", 10, 0);
        arr[2] = new WarriorFred("Warrior Healer", 10, 0);
        arr[3] = new WarriorFred("Warrior Tank", 10, 0);
        arr[4] = new WarriorFred("Warrior Rouge", 10, 0);


        System.out.println("*** Battle! ***   All warriors start with 10 units of health for 10 rounds");

        for (int i = 1; i < 11; i++) { // 10 rounds loops through
            System.out.println("\nRound: " + i);

            arr[0].display();
            arr[1].display();
            arr[2].display();
            arr[3].display();
            arr[4].display();

            if (i == 10) { //final status message for last round: Only prints on last round
                arr[0].fare();
                arr[1].fare();
                arr[2].fare();
                arr[3].fare();
                arr[4].fare();
            }
        }
    }
}




