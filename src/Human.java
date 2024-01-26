public class Human extends Entity{


    public Human(String name){super(name);}


    public void wearArmour(int number){
        switch (number){
            case 1:
                System.out.println("Human wear normaln jacket and he has a knife.... he is ready to fight!!! ");
                setDamage(10);
                setDefense(12);
                break;
            case 2:
                System.out.println("Human wear knights armor and he has small sword.... he is ready to fight!!! ");
                setDamage(8);
                setDefense(14);
                break;
        }

    }



}
