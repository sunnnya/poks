package moves.specialmoves;

import ru.ifmo.se.pokemon.*;

//Shadow Ball deals damage and has a 20% chance of lowering the target's Special Defense by one stage.

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP,(int)damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe(){
        return "наводит суету и бьет своим болшим шаром";
    }

}
