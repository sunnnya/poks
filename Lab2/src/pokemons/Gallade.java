package pokemons;
import moves.phycisalmoves.IceShard;
import moves.specialmoves.DreamEater;
import moves.specialmoves.IceBeam;
import moves.specialmoves.ShadowBall;
import moves.statusmoves.Charm;
import moves.statusmoves.DoubleTeam;
import ru.ifmo.se.pokemon.*;

import java.nio.DoubleBuffer;

public class Gallade extends Kirlia{
    public Gallade(String name, int level){
        super(name,level);
        this.setType(Type.FIGHTING,Type.FAIRY);
        this.setStats(68,125,65,65,115,80);
        this.addMove(new DoubleTeam());

    }
}
