public abstract class Instrumento {
    protected String nom;
    protected double preu;

    static
    {
        System.out.println("Carrega Static de la classe Instrumento");
    }

    public Instrumento (String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
        System.out.println("Instancia de la classe Instrumento");
    }

    abstract void tocar();
}


