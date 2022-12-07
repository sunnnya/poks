import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        // magearna - https://pokemondb.net/pokedex/magearna
        // Snorunt - https://pokemondb.net/pokedex/snorunt
        // Froslass - https://pokemondb.net/pokedex/froslass
        // Ralts - https://pokemondb.net/pokedex/ralts
        // Kirlia - https://pokemondb.net/pokedex/kirlia
        // Gallade - https://pokemondb.net/pokedex/gallade
        Battle b = new Battle();
        b.addAlly(new Magearna("Мегаарни",  26));
        b.addAlly(new Froslass("Простата", 14));
        b.addAlly(new Ralts("Ральф", 20));

        b.addFoe(new Snorunt("Шныря", 27));
        b.addFoe(new Kirlia("Кирюхин", 19));
        b.addFoe(new Gallade("Галяда", 32));
        b.go();
    }
}