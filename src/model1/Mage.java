package model1;

public class Mage extends GameCharacter{
    public int mana;

    public void castSpell() {
        if (mana >= 20) {
            System.out.println(getName() + " casts a powerful spell! Mana left: " + (mana - 20));
            mana -= 20;
        } else {
            System.out.println(getName() + " doesn't have enough mana to cast a spell.");
        }
    }

    public String toString() {
        return "Name: " + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower() +
                " Special Ability: " + " Mana: " + getSpecialAbility();
    }

}
