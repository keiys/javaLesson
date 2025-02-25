package model1;

public class Archer extends GameCharacter{
    public int arrows;

    public void shootArrow() {
        if (arrows > 0) {
            System.out.println(getName() + " shoots an arrow! Arrows left: " + (--arrows));
        } else {
            System.out.println(getName() + " is out of arrows!");
        }
    }

    public String toString() {
        return "Name: " + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower() +
                " Special Ability: " + " Arrows: " + getSpecialAbility();
    }
}
