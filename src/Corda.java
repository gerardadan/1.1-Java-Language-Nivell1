public class Corda extends Instrumento {

    public Corda(String nom, int preu)
    {
        super(nom, preu);
        System.out.println("Instancia de la classe Corda");
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
