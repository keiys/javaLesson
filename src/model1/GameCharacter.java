package model1;

public abstract class GameCharacter {
    private String name;
    private int health;
    private int attackPower;
    private String specialAbility;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public void attack(GameCharacter enemy) {
        System.out.println(name + " attacks " + enemy.name + " for " + attackPower + " damage.");
        enemy.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
    }

    public String toString() {
        return "Name: " + name + " Health: " + health + " Attack Power: " + attackPower + " Special Ability: " + specialAbility;
    }

    public void UseSpecialAbility() {
        System.out.println(name + " uses " + specialAbility);
    }
}
