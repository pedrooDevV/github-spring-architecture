package io.github.pedro.jogos.play.models;

public class LegueOfLegends extends Game {
    public LegueOfLegends(Console console) {
        super(console);
        setName("Legue of Legends");
        setGameManufacturer(GameManufacturer.RIOTGAMES);
        setPrice(null);
        setGameGenre(GameGenre.MOBA);
        setConsoleType(ConsoleType.PC);
    }
}
