package moves.statusmoves;

import ru.ifmo.se.pokemon.*;

//Charm lowers the target's Attack by two stages.

public class Charm extends StatusMove {
    public Charm(){
        super(Type.FAIRY,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe(){
        return "ругается неприятными словами";
    }
}
