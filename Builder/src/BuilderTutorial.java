public class BuilderTutorial {
}

class Computer {
    private int ram;
    private HDD hdd;
    private String processor;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {

        return "Computer{" + "ram " + ram + ", hdd=" + hdd.getDam() + ", processor=" + processor + '}';
    }
}

interface HDD {
    String getDam();
}

class SATATree implements HDD {

    @Override
    public String getDam() {
        return "SATA_3";
    }
}

class SATATwo implements HDD {

    @Override
    public String getDam() {
        return "SATA_2";
    }
}

abstract class ComputerBuilder {
    Computer computer;

    void createComputer() {
        computer = new Computer();
    }
    Computer getComputer() {
        return computer;
    }

    abstract void buildHDD();
    abstract void buildProcessor();
    abstract void buildRam();
}

class StrongComputerBuilder extends ComputerBuilder {

    @Override
    void buildHDD() {
        computer.setHdd(new SATATree());
    }

    @Override
    void buildProcessor() {
        computer.setProcessor("i7 3.1");
    }

    @Override
    void buildRam() {
       computer.setRam(16_000);
    }
}

class WeakComputerBuilder extends ComputerBuilder {

    @Override
    void buildHDD() {
        computer.setHdd(new SATATwo());
    }

    @Override
    void buildProcessor() {
        computer.setProcessor("i3 1.8");
    }

    @Override
    void buildRam() {
        computer.setRam(2_000);
    }
}

class Headman {
    private ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer buildComputer() {
        builder.createComputer(); // the common method!
        builder.buildProcessor();
        builder.buildRam();
        builder.buildHDD();       // the common method!

        return builder.getComputer();
    }
}

class Client1 {
    public static void main(String[] args) {
        Headman headman = new Headman();

        headman.setBuilder(new StrongComputerBuilder());

        Computer computer = headman.buildComputer();

        System.out.println(computer.toString());
    }
}