import java.util.Random;

public class Environment {

    public static void main(String[] args) {
        Environment environment = new Environment();

        Human h1 = new Human("Kuba");
        Alien a1 = new Alien("Dave");

        h1.wearArmour(2);
        a1.eat(1);


        int distance;

        while (h1.getHealth() > 0 && a1.getHealth() > 0) {
            environment.placeEntity(h1);
            environment.placeEntity(a1);
            distance = Math.abs(h1.getPosition() - a1.getPosition());
            System.out.println("Distance:" + distance);
            if (distance > 6) {
                System.out.println("Unsuccessful attack!!! They are too far apart");
            }
            if (distance > 3) {
                h1.setHealth(h1.getHealth() - a1.getDamage() + 3);
                a1.setHealth(a1.getHealth() - h1.getDamage() + 3);
                System.out.println("Nice battle! Human health: " + h1.getHealth() + "  Alien health: " + a1.getHealth());
            } else {
                h1.setHealth(h1.getHealth() - a1.getDamage());
                a1.setHealth(a1.getHealth() - h1.getDamage());
                System.out.println("WOW!!! What a battle! Human health: " + h1.getHealth() + "  Alien health: " + a1.getHealth());
            }


        }
    }

    public void placeEntity(Entity entity) {
        Random rand = new Random();
        int pos;

        pos = 1 + rand.nextInt(10);
        entity.setPosition(pos);
        System.out.println("Entity " + entity + " position is: " + entity.getPosition());
    }
}
