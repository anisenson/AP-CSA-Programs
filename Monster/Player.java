package Monster;

import java.util.ArrayList;

public class Player {
    private ArrayList<Monster> monsters = new ArrayList<Monster>();

    public void addMonster(Monster m) {
        monsters.add(m);
    }

    public Monster chooseMonster(int index) {
        if (index >= 0 && index < monsters.size()) {
            return monsters.get(index);
        } else {
            return null; 
        }
    }

    public void showMonsters() {
        for (Monster m : monsters) {
            System.out.println(m);
        }
    }
}
