package pokemons;
import moves.phycisalmoves.IceShard;
import moves.specialmoves.DreamEater;
import moves.specialmoves.IceBeam;
import moves.specialmoves.ShadowBall;
import moves.statusmoves.Charm;
import ru.ifmo.se.pokemon.*;

public class Kirlia extends Ralts{
    public Kirlia (String name, int level){
        super(name,level);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(38,35,35,65,55,50);
        this.addMove(new Charm());


    }
}
