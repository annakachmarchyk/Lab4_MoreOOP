package lotr;
import kick.CryKick;
import kick.KickStrategy;
import kick.NobleKick;

import java.util.Random;

public class Knight extends Character {

    public Knight() {

        super((new Random().nextInt(12 - 2 + 1) + 2), (new Random().nextInt(12 - 2 + 1) + 2), new NobleKick());
    }
}
