package moves.phycisalmoves;

import ru.ifmo.se.pokemon.*;

//Ice Shard deals damage

public class IceShard extends PhysicalMove {
    public IceShard(){
        super(Type.ICE, 40,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP,(int)damage);
    }
    @Override
    protected String describe(){
        return "замораживает собственные сопли и кидается сосульками из них";
    }
}
