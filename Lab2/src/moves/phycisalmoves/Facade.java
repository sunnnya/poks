package moves.phycisalmoves;

import ru.ifmo.se.pokemon.*;

//Facade deals damage, and hits with double power if the user is burned, poisoned or paralyzed.


public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70,100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        if (p.getCondition() == (Status.BURN) || p.getCondition() == (Status.PARALYZE) || p.getCondition() == (Status.POISON)){
             p.setMod(Stat.HP, (int) Math.round(damage*2));
        }
        }

    @Override
    protected String describe(){
        return "бабахает по голове";
    }
}




