package Monster;

import java.util.Scanner;

public class MonsterBattleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player();

        player.addMonster(new Monster("Dragon", 100, 25));
        player.addMonster(new Monster("Troll", 120, 20));
        player.addMonster(new Monster("Goblin", 80, 30));

        System.out.println("Your monsters:");
        player.showMonsters();

        System.out.print("Choose the index of the first monster: ");
        int firstIndex = scanner.nextInt();
        System.out.print("Choose the index of the second monster: ");
        int secondIndex = scanner.nextInt();

        Monster monster1 = player.chooseMonster(firstIndex);
        Monster monster2 = player.chooseMonster(secondIndex);

        if (monster1 == null || monster2 == null) {
            System.out.println("Invalid monster selection.");
            return;
        }

        System.out.println("Battle begins between " + monster1.toString() + " and " + monster2.toString());

        while (!monster1.isDefeated() && !monster2.isDefeated()) {
            System.out.println(monster1.getName() + " attacks " + monster2.getName());
            monster1.attack(monster2);
            System.out.println(monster2.getName() + " health: " + monster2.getHealth());

            if (monster2.isDefeated()) {
                System.out.println(monster2.getName() + " is defeated!");
                break;
            }

            System.out.println(monster2.getName() + " attacks " + monster1.getName());
            monster2.attack(monster1);
            System.out.println(monster1.getName() + " health: " + monster1.getHealth());

            if (monster1.isDefeated()) {
                System.out.println(monster1.getName() + " is defeated!");
                break;
            }
        }

        System.out.println("Total monsters created: " + Monster.getTotalMonsters());

        scanner.close();
    }
}
