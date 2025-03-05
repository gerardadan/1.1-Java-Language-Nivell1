public class WindInstrument extends Instrument {

    static {
        Print.print("Carrega Static de la classe vent");
    }

    public WindInstrument(String name, int price) {
        super(name,price, "Instancia de la classe Vent");
    }

    @Override
    String tocar() {
        return "Està sonant un instrument de vent";
    }

    public static String staticTocar(){
        return "Està sonant un instrument de vent del mètode static";
    }

}
