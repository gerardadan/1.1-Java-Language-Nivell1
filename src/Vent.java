public class Vent extends Instrumento {

    static
    {
        System.out.println("Carrega Static de la classe vent");
    }

    public Vent(String nom, int preu) {
        super(nom, preu);
        System.out.println("Instancia de la classe vent");
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }

    public static void staticTocar(){
        System.out.println("Està sonant un instrument de vent del mètode static");
    }

}
