package model1;

public class Healer extends GameCharacter{
    public int healingPotions;


    public void healAlly(GameCharacter ally) {
        int health = getHealth();
        if (healingPotions > 0) {
            health += 30;
            System.out.println(getName() + " heals " + ally.getName() + " for 30 HP! Potions left: " + (--healingPotions));
        } else {
            System.out.println(getName() + " is out of healing potions!");
        }
        setHealth(health);
    }

    public String toString() {
        return "Name: " + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower() +
                " Special Ability: " + " Healing Potions: " + healingPotions;
    }
}
