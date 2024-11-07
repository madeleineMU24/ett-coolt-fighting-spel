import java.util.Random;

public class Player {

    private int id;
    private long score;

    private String name;
    private int health;
    private int damage;

private Item equippedItem;

    public Player(){

    }

    public Player(String name){

        this.name = name;
        this.health = 100;
        this.damage = 10;
    }


public void attack(Player enemy){
        Random rng = new Random();


    int damageVariance = rng.nextInt(this.damage-2, this.damage+2);

    int totalDamage = damageVariance + this.equippedItem.getDamageModifier();
    enemy.takeDamage(totalDamage);
    System.out.println(this.name + " attacks " + enemy.name + " and the total damage is: " + totalDamage);
}

public void takeDamage(int damage){
        if(this.equippedItem.getArmourValue() > 0){
            damage -= this.equippedItem.getArmourValue();
            System.out.println(this.name + " blocks " +
                    this.equippedItem.getArmourValue() + " damages with their " + this.equippedItem.getName());
            System.out.println(" The total damage is " + damage);
        }
        this.health -= damage;
}

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public Item getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem) {
        this.equippedItem = equippedItem;
        System.out.println(this.name + " found a " + this.equippedItem.getName() + "!!");
        if (equippedItem.getHealthModifier() > 0){
            this.health = this.health + equippedItem.getHealthModifier();
            System.out.println(this.name + "'s health increases to " + this.health);

        }

    }
}
