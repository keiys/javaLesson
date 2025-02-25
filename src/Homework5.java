import model1.*;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();
        Healer healer = new Healer();
        Assassin assassin = new Assassin();

        Scanner sc = new Scanner(System.in);
        boolean isActiveAbility = true;
        boolean isActiveStart = true;
        while (isActiveStart) {
            System.out.println("---------Create Character--------");
            System.out.println("1.                     Warrior");
            System.out.println("2.                     Mage");
            System.out.println("3.                     Archer");
            System.out.println("4.                     Healer");
            System.out.println("5.                     Assassin");
            System.out.println("6.                     Start Game");
            System.out.println("7.                     Exit Game");
            System.out.println("---------------------------------");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    warrior.setName(sc.next());
                    System.out.print("Enter Health: ");
                    warrior.setHealth(sc.nextInt());
                    System.out.print("Enter Attack Power: ");
                    warrior.setAttackPower(sc.nextInt());
                    System.out.print("Enter Armor: ");
                    warrior.armor = sc.nextInt();
                    System.out.println(warrior);
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    mage.setName(sc.next());
                    System.out.print("Enter Health: ");
                    mage.setHealth(sc.nextInt());
                    System.out.print("Enter Attack Power: ");
                    mage.setAttackPower(sc.nextInt());
                    System.out.print("Enter Mana: ");
                    mage.mana = sc.nextInt();
                    System.out.println(mage);
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    archer.setName(sc.next());
                    System.out.print("Enter Health: ");
                    archer.setHealth(sc.nextInt());
                    System.out.print("Enter Attack Power: ");
                    archer.setAttackPower(sc.nextInt());
                    System.out.print("Enter Mana: ");
                    archer.arrows = sc.nextInt();
                    System.out.println(archer);
                    break;
                case 4:
                    System.out.print("Enter Name: ");
                    healer.setName(sc.next());
                    System.out.print("Enter Health: ");
                    healer.setHealth(sc.nextInt());
                    System.out.print("Enter Attack Power: ");
                    healer.setAttackPower(sc.nextInt());
                    System.out.print("Enter Mana: ");
                    healer.healingPotions = sc.nextInt();
                    System.out.println(healer);
                    break;
                case 5:
                    System.out.print("Enter Name: ");
                    assassin.setName(sc.next());
                    System.out.print("Enter Health: ");
                    assassin.setHealth(sc.nextInt());
                    System.out.print("Enter Attack Power: ");
                    assassin.setAttackPower(sc.nextInt());
                    System.out.print("Enter Mana: ");
                    String hidden = sc.next();
                    if (hidden.equals("Yes")) {
                        assassin.isHidden = true;
                    } else {
                        assassin.isHidden = false;
                    }
                    System.out.println(assassin);
                    break;
                case 6:
                    while(isActiveAbility) {
                        System.out.println("---------Choose Ability--------");
                        System.out.println("1.     Warrior Attack");
                        System.out.println("2.     Mage Cast Spell");
                        System.out.println("3.     Archer Shoot");
                        System.out.println("4.     Healer Heal");
                        System.out.println("5.     Assassin Go Stealth");
                        System.out.println("6.     Assassin Attack From Stealth");
                        System.out.println("7.     Show Special Abilities of Characters");
                        System.out.println("8.     Return To Menu");
                        System.out.println("-------------------------------------------");
                        System.out.println();
                        System.out.print("Enter your choice: ");
                        int ability = sc.nextInt();
                        switch (ability) {
                            case 1:
                                System.out.print("Choose character for attacking (mage, archer, healer, assassin):  ");
                                String enemy = sc.next();
                                switch (enemy) {
                                    case "mage":
                                        warrior.attack(mage);
                                        break;
                                    case "archer":
                                        warrior.attack(archer);
                                        break;
                                    case "healer":
                                        warrior.attack(healer);
                                        break;
                                    case "assassin":
                                        warrior.attack(assassin);
                                        break;
                                    default:
                                        System.out.println("Invalid Character");
                                }
                                break;
                            case 2:
                                mage.castSpell();
                                break;
                            case 3:
                                archer.shootArrow();
                                break;
                            case 4:
                                System.out.print("Choose character for healing (mage, archer, warrior, assassin):  ");
                                String teammate = sc.next();
                                switch (teammate) {
                                    case "mage":
                                        healer.healAlly(mage);
                                        break;
                                    case "archer":
                                        healer.healAlly(archer);
                                        break;
                                    case "warrior":
                                        healer.healAlly(warrior);
                                        break;
                                    case "assassin":
                                        healer.healAlly(assassin);
                                        break;
                                    default:
                                        System.out.println("Invalid Character");
                                }
                                break;
                            case 5:
                                assassin.goStealth();
                                break;
                            case 6:
                                if (assassin.isHidden == false) {
                                    assassin.goStealth();
                                }
                                System.out.print("Choose character for attacking (mage, archer, warrior, healer):  ");
                                String target = sc.next();
                                switch (target) {
                                    case "mage":
                                        assassin.attackFromStealth(mage);
                                        break;
                                    case "archer":
                                        assassin.attackFromStealth(archer);
                                        break;
                                    case "warrior":
                                        assassin.attackFromStealth(warrior);
                                        break;
                                    case "healer":
                                        assassin.attackFromStealth(healer);
                                        break;
                                    default:
                                        System.out.println("Invalid Character");
                                }
                                break;
                            case 7:
                                System.out.println("Warrior's special ability is "+ warrior.getSpecialAbility());
                                System.out.println("Mage's special ability is "+ mage.getSpecialAbility());
                                System.out.println("Archer's special ability is "+ archer.getSpecialAbility());
                                System.out.println("Healer's special ability is "+ healer.getSpecialAbility());
                                System.out.println("Assassin's special ability is "+ assassin.getSpecialAbility());
                                break;
                            case 8:
                                isActiveAbility = false;
                                break;
                            default:
                                System.out.println("Invalid Choice");
                        }
                    }
                case 7:
                    isActiveStart = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
