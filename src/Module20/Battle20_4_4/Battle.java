package Module20.Battle20_4_4;

public class Battle {
    public static void main(String[] args) {
        Good johnSnow = new Good();
        Evil drakaris = new Evil();
        fight(johnSnow, drakaris);
    }

    private static void fight(Good johnSnow, Evil drakaris){
        while (true){
            if (!johnSnow.isAlive && !drakaris.isAlive){
                System.out.println("All are dead.");
                break;
            } else if (!johnSnow.isAlive && drakaris.isAlive) {
                System.out.println("Good is dead. Evil wins!");
                break;
            } else if (johnSnow.isAlive && drakaris.isAlive) {
                System.out.println("Evil is dead. Good wins!");
                break;
            }

            if (johnSnow.health <= 0){
                johnSnow.isAlive = false;
            } else johnSnow.health -= drakaris.damage;

            if (drakaris.health <= 0){
                drakaris.isAlive = false;
            } else drakaris.health -= johnSnow.damage;
        }
    }
}

