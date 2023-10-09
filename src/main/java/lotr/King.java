package lotr;
import kick.CryKick;
import kick.KickStrategy;
import kick.KingKick;

import java.util.Random;

public class King extends Character {

    public King() {

        super((new Random().nextInt(15 - 5 + 1) + 5), (new Random().nextInt(15 - 5 + 1) + 5), new KingKick());
    }
}
