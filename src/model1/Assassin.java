package model1;

public class Assassin extends GameCharacter{
    public boolean isHidden;

    public void goStealth() {
        isHidden = true;
        System.out.println(getName() + " vanishes into the shadows! Now hidden.");
    }

    public void attackFromStealth(GameCharacter target) {
        int attackPower = getAttackPower();
        if (isHidden) {
            System.out.println(getName() + " strikes from the shadows for double damage!");
            target.takeDamage(attackPower * 2);
            isHidden = false;
        } else {
            System.out.println(getName() + " is not hidden! Can't use stealth attack.");
        }
        setAttackPower(attackPower);
    }

    public String toString() {
        String a = "";
        if (isHidden) {
            a = "yes";
        }else {
            a = "no";
        }
        return "Name: " + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower() +
                " Special Ability: " + " Hidden: " + a;
    }
}
