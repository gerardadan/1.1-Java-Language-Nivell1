public class StringInstrument extends Instrument {

    public StringInstrument(String nom, int preu)
    {
        super(nom, preu,"Instancia de la classe Corda");
    }

    @Override
    String tocar() {
        return "Està sonant un instrument de corda";
    }
}
