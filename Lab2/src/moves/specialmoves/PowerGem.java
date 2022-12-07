package moves.specialmoves;

import ru.ifmo.se.pokemon.*;

public class PowerGem extends SpecialMove {
    public PowerGem () {
        super(Type.ROCK,80,100);
    }
    @Override
    protected String describe(){
        return "заряжается внеземной энергией и бьет по лицу";
    }
}
