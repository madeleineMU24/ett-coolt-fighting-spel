public class Item {

    private String name;
    private int damageModifier;
    private int armourValue;
    private int healthModifier;

    public Item(int armourValue, int damageModifier, String name, int healthModifier) {
        this.armourValue = armourValue;
        this.damageModifier = damageModifier;
        this.name = name;
        this.healthModifier = healthModifier;
    }

    public String getName() {
        return name;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public int getHealthModifier() {
        return healthModifier;
    }

    public int getArmourValue() {
        return armourValue;
    }
}
