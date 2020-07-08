public class AdupterTutorial {
}

class Client {
    public static void main(String[] args) {
//        PrintInterface print = new PrintSecond();
//        print.consolePrint();
        PrintInterface printInterface = new PrinterComp(new Printer());
        printInterface.consolePrint();
    }
}

class PrinterComp implements PrintInterface {

    private final Printer printer;
    PrinterComp(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void consolePrint() {
        printer.print();

    }
}

class PrintSecond extends Printer implements PrintInterface {

    @Override
    public void consolePrint() {
        this.print();
    }
}

interface PrintInterface {
    void consolePrint();

}

class Printer {
    void print() {
        System.out.println("Hello.");
    }
}
