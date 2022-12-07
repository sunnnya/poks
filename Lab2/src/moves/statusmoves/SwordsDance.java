package moves.statusmoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//Swords Dance raises the user's Attack by two stages.

public class SwordsDance extends StatusMove {
    public SwordsDance(){
    super(Type.NORMAL, 0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
    p.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe() {
        return "бахает пивка и становится сильней";
    }

}
