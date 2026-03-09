public abstract class GameCharacter {

    private String name;
    private String race;
    private int level;
    private int hitPoints;
    private int armorClass;
    private int gold;
    private int expPoints;

    private Weapon weapon1;
    private Weapon weapon2;

    // No parameter constructor
    public GameCharacter() {
        name = "Unknown";
        race = "Unknown";
        level = 1;
        hitPoints = 10;
        armorClass = 10;
        gold = 0;
        expPoints = 0;
        weapon1 = null;
        weapon2 = null;
    }

    // Full constructor
    public GameCharacter(String name, String race, int level,
    int hitPoints, int armorClass,int gold, int expPoints,
    Weapon weapon1, Weapon weapon2) {

        setName(name);
        setRace(race);
        setLevel(level);
        setHitPoints(hitPoints);
        setArmorClass(armorClass);
        setGold(gold);
        setExpPoints(expPoints);

        if (weapon1 != null)
            this.weapon1 = new Weapon(weapon1);

        if (weapon2 != null)
            this.weapon2 = new Weapon(weapon2);
    }

    // Copy constructor
    public GameCharacter(GameCharacter other) {

        if (other != null) {

            this.name = other.name;
            this.race = other.race;
            this.level = other.level;
            this.hitPoints = other.hitPoints;
            this.armorClass = other.armorClass;
            this.gold = other.gold;
            this.expPoints = other.expPoints;

            if (other.weapon1 != null)
                this.weapon1 = new Weapon(other.weapon1);

            if (other.weapon2 != null)
                this.weapon2 = new Weapon(other.weapon2);
        }
    }

    // Setters
    public void setName(String name) {
        if (name != null && name.length() > 0)
            this.name = name;
    }

    public void setRace(String race) {
        if (race != null && race.length() > 0)
            this.race = race;
    }

    public void setLevel(int level) {
        if (level >= 0)
            this.level = level;
    }

    public void setHitPoints(int hp) {
        if (hp >= 0)
            this.hitPoints = hp;
    }

    public void setArmorClass(int armor) {
        if (armor >= 0)
            this.armorClass = armor;
    }

    public void setGold(int gold) {
        if (gold >= 0)
            this.gold = gold;
    }

    public void setExpPoints(int exp) {
        if (exp >= 0)
            this.expPoints = exp;
    }

    public void setWeapon1(Weapon w) {
        if (w == null)
            weapon1 = null;
        else
            weapon1 = new Weapon(w);
    }

    public void setWeapon2(Weapon w) {
        if (w == null)
            weapon2 = null;
        else
            weapon2 = new Weapon(w);
    }

    // Getters
    public String getName() { return name; }
    public String getRace() { return race; }
    public int getLevel() { return level; }
    public int getHitPoints() { return hitPoints; }
    public int getArmorClass() { return armorClass; }
    public int getGold() { return gold; }
    public int getExpPoints() { return expPoints; }
    public Weapon getWeapon1() { return weapon1; }
    public Weapon getWeapon2() { return weapon2; }

    // toString
    public String toString() {

        return "Name: " + name +
                "\nRace: " + race +
                "\nLevel: " + level +
                "\nHP: " + hitPoints +
                "\nArmor Class: " + armorClass +
                "\nGold: " + gold +
                "\nExp: " + expPoints +
                "\nWeapon1: " + weapon1 +
                "\nWeapon2: " + weapon2;
    }

    // equals
    public boolean equals(GameCharacter other) {

        if (other == null) return false;

        return name.equals(other.name) &&
                race.equals(other.race) &&
                level == other.level &&
                hitPoints == other.hitPoints &&
                armorClass == other.armorClass &&
                gold == other.gold &&
                expPoints == other.expPoints;
    }

    // Abstract methods
    public abstract void assist(GameCharacter ally);

    public abstract void attack(GameCharacter enemy);
}