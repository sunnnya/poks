package pokemons;

import moves.phycisalmoves.Facade;
import moves.specialmoves.DreamEater;
import moves.specialmoves.PowerGem;
import moves.specialmoves.ShadowBall;
import moves.statusmoves.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level){
        super(name,level);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(28,25,25,45,35,40);
        this.addMove(new ShadowBall());
        this.addMove(new DreamEater());
    }

}
