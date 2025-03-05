public  class PercussionInstrument extends Instrument {

    public PercussionInstrument(String nom, int preu)
    {
        super(nom,preu, "Instancia de la classe Percussió");
    }

    @Override
    String tocar() {
        return "Està sonant un instrument de percussió";
    }
}
