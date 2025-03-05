//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        System.out.println(WindInstrument.staticTocar());
        WindInstrument windInstrument = new WindInstrument("flauta", 25);
        System.out.println(windInstrument.tocar());

        PercussionInstrument percussio = new PercussionInstrument("timbal", 40);
        System.out.println(percussio.tocar());

        StringInstrument corda = new StringInstrument("guitarra", 80);
        System.out.println(corda.tocar());

    }
}