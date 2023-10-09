package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
//        to provide fight between to characters and explain via command
//        line what happens during fight, till both of
//        the characters are alive
//        c1.kick(c2);
        System.out.println("BEGINNING OF GAME");
        info(c1, c2);
        System.out.println("----------------------------");
        int count  = 1;

        while (c1.getHp() > 0 && c2.getHp() > 0) {
            if (c1.getClass() == Hobbit.class && c2.getClass() == Hobbit.class){
                System.out.println("Hobbits only cry");
                break;
            }
            if (c1.getClass() == Elf.class && c2.getClass() == Elf.class){
                System.out.println("Elfs are friends, so there's no winner");
                break;
            }
            if (c1.getHp() <= 0 || c2.getHp() <= 0){
//                info(c1, c2);
//                String winner = null;
//                String winner =  (c1.getHp() > 0) ? String.valueOf(c1.getClass()) : String.valueOf(c2.getClass());
                break;
            }
            else if (c1.getHp() > 0 && c2.getHp() > 0) {


//                if ({
                if (c1.isAlive() && c2.isAlive()) {
//                    System.out.println("----------------------------");
                    System.out.println("ROUND " + count);
                    System.out.println("PLAYER 1 KICKS");
                    c1.kick(c2);
                info(c1, c2);
                count++;
                }
                if (c2.isAlive()) {
//                    System.out.println("----------------------------");
                    System.out.println("ROUND " + count);
                    System.out.println("PLAYER 2 KICKS");
                    c2.kick(c1);
                    info(c1, c2);
//                System.out.println();
                    count++;
            }
//                }
                }
            else if(c1.getHp() == 0 | c2.getHp() == 0){
                break;
            }

        }
        if (c1.getHp() > 0 && c2.getHp() <= 0){
            String winner = String.valueOf(c1.getClass());
            System.out.println("----------------------------");
            System.out.println("The winner is " + winner);
        }
        else if(c2.getHp() > 0 && c1.getHp() <= 0) {
            String winner = String.valueOf(c2.getClass());
            System.out.println("----------------------------");
            System.out.println("The winner is " + winner);
        }
    }

    void info(Character c1, Character c2){
        System.out.println("Player1: " + c1.getClass());
        System.out.println("HP1: " + c1.getHp());
        System.out.println("Player2: " + c2.getClass());
        System.out.println("HP2: " + c2.getHp());

    }

    public static void main(String[] args) {
        Character one = CharacterFactory.createCharacter();
        Character two = CharacterFactory.createCharacter();
        new GameManager().fight(one, two);
    }
}
