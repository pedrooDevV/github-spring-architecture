package io.github.pedro.jogos.play.models;

public class Console {
    private String memory;
    private String core;
    private Key key;
    private Manufacturer manufacturer;
    private ConsoleType consoleType;

    public ConsoleType getConsoleType() {
        return consoleType;
    }

    public void setConsoleType(ConsoleType consoleType) {
        this.consoleType = consoleType;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
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

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Console{" +
                "memory='" + memory + '\'' +
                ", core='" + core + '\'' +
                ", key=" + key +
                ", manufacturer=" + manufacturer +
                ", consoleType=" + consoleType +
                '}';
    }
}
