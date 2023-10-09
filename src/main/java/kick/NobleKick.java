package kick;
import lotr.Character;

import java.util.Random;

public class NobleKick implements KickStrategy{

    @Override
    public void kick(Character whoKicked, Character whiIsKicked) {
        whiIsKicked.setHp(whiIsKicked.getHp() - (new Random().nextInt(15 - 5 + 1) + 5));
//        System.out.println("Knight!");
    }
}
