public class Weapon {

    private String name;
    private String type;
    private int damage;
    private int weight;

    // No parameter constructor
    public Weapon() {
        name = "None";
        type = "None";
        damage = 0;
        weight = 0;
    }

    // Full constructor
    public Weapon(String name, String type, int damage, int weight) {
        setName(name);
        setType(type);
        setDamage(damage);
        setWeight(weight);
    }

    // Copy constructor
    public Weapon(Weapon other) {
        if (other != null) {
            this.name = other.name;
            this.type = other.type;
            this.damage = other.damage;
            this.weight = other.weight;
        }
    }

    // Setters
    public void setName(String name) {
        if (name != null && name.length() > 0)
            this.name = name;
    }

    public void setType(String type) {
        if (type != null && type.length() > 0)
            this.type = type;
    }

    public void setDamage(int damage) {
        if (damage >= 0)
            this.damage = damage;
    }

    public void setWeight(int weight) {
        if (weight >= 0)
            this.weight = weight;
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type; }
    public int getDamage() { return damage; }
    public int getWeight() { return weight; }

    // toString
    public String toString() {
        return "Weapon: " + name + " Type: " + type +
                " Damage: " + damage + " Weight: " + weight;
    }

    // equals
    public boolean equals(Weapon other) {
        if (other == null) return false;

        return name.equals(other.name) && type.equals(other.type) &&
        damage == other.damage && weight == other.weight;
    }
}