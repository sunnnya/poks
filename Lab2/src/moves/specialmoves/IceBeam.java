package moves.specialmoves;

import ru.ifmo.se.pokemon.*;

//Ice Beam deals damage and has a 10% chance of freezing the target.

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE,90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
    Effect e = new Effect();
    e.chance(0.1);
    Effect.freeze(p);
    p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "чихает ледяной слюной";
    }
}
