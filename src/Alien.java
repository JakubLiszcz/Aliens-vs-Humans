public class Alien extends Entity {


    public Alien(String name){super(name);}


    public void eat(int number) {
        switch (number) {
            case 1:
                System.out.println("Alien has just eaten big fat cow..... he is ready to fight!!!!");
                setDamage(10);
                setDefense(12);
                break;
            case 2:
                System.out.println("Alien has just eaten pizza with pineapple..... he is ready to fight!!!!");
                setDamage(8);
                setDefense(14);
                break;
        }
    }
}