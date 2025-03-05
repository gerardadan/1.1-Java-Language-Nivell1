public abstract class Instrument {
    protected String name;
    protected double price;
    protected String message;

    static {
        Print.print("Carrega Static de la classe Instrumento");
    }

    public Instrument(String name, int price, String message) {
        this.name = name;
        this.price = price;
        this.message = message;
        Print.print(message);
    }

    //public String
    abstract String tocar();
}


