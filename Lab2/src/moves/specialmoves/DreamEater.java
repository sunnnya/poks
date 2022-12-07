package moves.specialmoves;

import ru.ifmo.se.pokemon.*;

//Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained.

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC,100,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        if (p.getCondition() == Status.SLEEP){
            p.setMod(Stat.HP, (int)damage);

        }
    }
    @Override
    protected void applySelfDamage(Pokemon p, double damage){
        if (p.getCondition() == Status.SLEEP){
            p.setMod(Stat.HP,(int)(-damage * 0.5));
        }
    }
    @Override
    protected String describe(){
        return "будит нигадяя и дает по башке";
    }
}
