package pokemons;
import moves.phycisalmoves.IceShard;
import moves.specialmoves.DreamEater;
import moves.specialmoves.IceBeam;
import moves.specialmoves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {
    public Snorunt(String name, int level){
     super(name,level);
     this.setStats(50,50,50,50,50,50);
     this.setType(Type.ICE);
     this.addMove(new ShadowBall());
     this.addMove(new IceBeam());
     this.addMove(new IceShard());
    }
}
