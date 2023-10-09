package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import lombok.ToString;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

//    public Character() {
//    }


    public void kick(Character whoKicked){
        kickStrategy.kick(this, whoKicked);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp){
        this.hp = hp > 0 ? hp : 0;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp +
                ", power=" + power +
                '}';
    }
}
