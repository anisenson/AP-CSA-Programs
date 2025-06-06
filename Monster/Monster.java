package Monster;

import java.util.ArrayList;

public class Monster {
    private String name;
    private int health;
    private int attackPower;

    private static int totalMonsters = -1;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        totalMonsters++;
    }

    public void attack(Monster otherMonster) {
        otherMonster.health -= this.attackPower;
    }

    public boolean isDefeated() {
        return health <= 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Health: " + health + " | Attack Power: " + attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public static int getTotalMonsters() {
        return totalMonsters;
    }
}
