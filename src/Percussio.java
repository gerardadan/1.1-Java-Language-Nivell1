public  class Percussio extends Instrumento {

    public Percussio(String nom, int preu)
    {
        super(nom,preu);
        System.out.println("Instancia de la classe Percussio");
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
