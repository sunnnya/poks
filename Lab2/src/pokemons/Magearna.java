package pokemons;
import moves.phycisalmoves.Facade;
import moves.phycisalmoves.MetalClaw;
import moves.specialmoves.DreamEater;
import moves.specialmoves.PowerGem;
import moves.specialmoves.ShadowBall;
import moves.statusmoves.Charm;
import moves.statusmoves.SwordsDance;
import ru.ifmo.se.pokemon.*;

public class Magearna extends Pokemon {
    public Magearna(String name, int level){
        super(name,level);
        this.setType(Type.STEEL,Type.FAIRY);
        this.setStats(80,95,115,130,115,65);
        this.addMove(new MetalClaw());
        this.addMove(new Facade());
        this.addMove(new PowerGem());
        this.addMove(new SwordsDance());


    }
}
