package kick;
import lotr.Character;
import lotr.King;

import java.util.Random;


public class KingKick implements KickStrategy{
    @Override
    public void kick(Character whoKicked, Character whiIsKicked) {
//        King cur = new King();
        whiIsKicked.setHp(whiIsKicked.getHp() - (new Random().nextInt(15 - 5 + 1) + 5));
    }
}