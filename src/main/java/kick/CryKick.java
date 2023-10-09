package kick;
import lotr.Character;


public class CryKick implements KickStrategy{



//    @Override
//    public void kick(Character whiIsKicked) {
//
//        CryKick cry = new CryKick();
//        cry.kick(this, whiIsKicked);
//    }

    @Override
    public void kick(Character whoKicked, Character whoIsKicked) {
        System.out.println("Hobbit cries");
    }
}
