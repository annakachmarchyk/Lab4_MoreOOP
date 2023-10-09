package kick;
import lotr.Character;
//import lotr.Elf;


public class ElfKick implements KickStrategy{
//    @Override
//    public void kick(Character whoKicked, Character whoIsKicked) {
//        System.out.println();
//    }
    @Override
    public void kick(Character whoKicked,Character whiIsKicked) {
//        Elf cur = new Elf();
        if (whiIsKicked.getHp() < whoKicked.getPower()){
            whiIsKicked.setHp(0);
        }
        else{
            whoKicked.setPower(whoKicked.getPower()-1);
        }
    }
}
