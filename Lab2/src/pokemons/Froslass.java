package pokemons;
import moves.phycisalmoves.IceShard;
import moves.specialmoves.DreamEater;
import moves.specialmoves.IceBeam;
import moves.specialmoves.ShadowBall;
import ru.ifmo.se.pokemon.*;

public class Froslass extends Snorunt{

    public Froslass(String name, int level){
        super(name,level);
        this.setType(Type.ICE,Type.GHOST);
        this.setStats(70,80,70,80,70,110);
        this.addMove(new DreamEater());
    }
}
