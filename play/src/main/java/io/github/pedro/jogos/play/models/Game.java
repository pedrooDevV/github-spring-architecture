package io.github.pedro.jogos.play.models;

public class Game {
    private Key key;
    private String name;
    private GameGenre gameGenre;
    private String relaseDate;
    private Double price;
    private Manufacturer manufacturer;
    private ConsoleType consoleType;
    private Console console;
    private GameManufacturer gameManufacturer;

    public Game (Console console){
        this.console = console;
    }

    public GameManufacturer getGameManufacturer() {
        return gameManufacturer;
    }

    public void setGameManufacturer(GameManufacturer gameManufacturer) {
        this.gameManufacturer = gameManufacturer;
    }

    public ConsoleType getConsoleType() {
        return consoleType;
    }

    public void setConsoleType(ConsoleType consoleType) {
        this.consoleType = consoleType;
    }

    public Console getConsole() {
        return console;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameGenre getGameGenre() {
        return gameGenre;
    }
    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public GameGenre getGameGenre(GameGenre fps) {
        return gameGenre;
    }

    public void setGameGenre(GameGenre gameGenre) {
        this.gameGenre = gameGenre;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Manufacturer getManufacturer(Manufacturer ubisoft) {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public GameStatus initialize(Key key) {
        if(key.getManufacturer() != this.manufacturer){
            return new GameStatus("This is an incorrect manufacturer");
        }
        return new GameStatus("It is initialized by the console: " + console);
    }
}
