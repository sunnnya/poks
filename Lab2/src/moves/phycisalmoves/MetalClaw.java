package moves.phycisalmoves;

import ru.ifmo.se.pokemon.*;

//Metal Claw deals damage and has a 10% chance of raising the user's Attack by one stage.

public class MetalClaw extends PhysicalMove {
    public MetalClaw() {
        super(Type.STEEL,50,95);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int)(damage));
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.ATTACK,+1 );
        }
    }
    @Override
    protected String describe(){
        return "достает свои когти и устраивает резню";
    }
}
