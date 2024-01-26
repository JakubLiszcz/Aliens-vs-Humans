public class Entity {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int position;

    public Entity(String name){
        this.name = name;
        this.health = 100;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }

    public void setDefense(int defense){
        this.defense = defense + health;
    }
    public int getDefense(){
        return defense;
    }
    public void setPosition(int position){
        this.position =position;
    }
    public int getPosition(){
        return position;
    }

    public String toString(){return this.name;}

}
