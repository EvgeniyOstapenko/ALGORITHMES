import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.util.ArrayList;
import java.util.List;

public class FactoryTutorialView {
    public static void main(String[] args) {
        List<Chocolate> chocolates = new ArrayList<>();

        Factory factory = new CreatorFactory(1);
        Chocolate chocolate = factory.create();

        chocolates.add(new CreatorFactory(1).create());
        chocolates.add(new CreatorFactory(0).create());
        chocolates.add(new CreatorFactory(1).create());
        chocolates.get(1).printPrise();

//        Factory factory1 = new CreatorFactory(0);
//        Chocolate chocolate1 = factory1.create();
//
//        chocolates.add(chocolate1);
//        chocolates.get(1).printPrise();
    }
}

interface Chocolate {
    void printPrise();
}

class WhiteChocolate implements Chocolate {
    private final int prise = 15;

    @Override
    public void printPrise() {
        System.out.println(prise);
    }
}

class BlackChocolate implements Chocolate {
    private final int prise = 10;

    @Override
    public void printPrise() {
        System.out.println(prise);
    }
}

abstract class Factory {
    int flag;

    Factory (int flag) {
        this.flag = flag;
    }
    abstract Chocolate create();
}

class CreatorFactory extends Factory {
    CreatorFactory(int flag) {
        super(flag);
    }

    @Override
    Chocolate create() {
        if (flag == 0) {
            return new WhiteChocolate();
        }
        if (flag == 1) {
            return new BlackChocolate();
        }
        throw new IllegalArgumentException();
    }

}
