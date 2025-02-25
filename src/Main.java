//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Vent.staticTocar();
        Vent vent = new Vent("flauta", 25);
        vent.tocar();

        Percussio percussio = new Percussio("timbal", 40);
        percussio.tocar();

        Corda corda = new Corda("guitarra", 80);
        corda.tocar();
    }
}