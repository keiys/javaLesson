package model1;

public class Warrior extends GameCharacter{
    public int armor;

    public void blockAttack() {
        System.out.println(getName() + " blocks an attack, reducing damage by " + armor + " points.");
    }

    public String toString() {
        return "Name: " + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower() +
                " Special Ability: " + getSpecialAbility() + " Armor: " + armor;
    }
}
