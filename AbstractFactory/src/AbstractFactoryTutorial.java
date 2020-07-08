public class AbstractFactoryTutorial {
    public static void main(String[] args) {
        AbstractFactory factory = new CreamyFactory();
        factory.getCake().printName();
        factory.getMilkCocktail().printName();
    }
}

interface AbstractFactory {
    Cake getCake();
    MilkCocktail getMilkCocktail();
}

class ChocolateFactory implements AbstractFactory {

    @Override
    public Cake getCake() {
        return new ChocolateCake();
    }

    @Override
    public MilkCocktail getMilkCocktail() {
        return new ChocolateMilkCocktail();
    }
}

class CreamyFactory implements AbstractFactory {

    @Override
    public Cake getCake() {
        return new CreamyCake();
    }

    @Override
    public MilkCocktail getMilkCocktail() {
        return new CreamyMilkCocktail();
    }
}

interface Cake {
    void printName();
    void printPrise();
}

class ChocolateCake implements Cake {

    @Override
    public void printName() {
        System.out.println("Chocolate cake");
    }

    @Override
    public void printPrise() {
        System.out.println("50");
    }

}

class CreamyCake implements Cake {

    @Override
    public void printName() {
        System.out.println("Creamy cake");
    }

    @Override
    public void printPrise() {
        System.out.println("35");
    }
}

interface MilkCocktail {
    void printName();
    void printPrise();
}

class ChocolateMilkCocktail implements MilkCocktail {

    @Override
    public void printName() {
        System.out.println("Milk cocktail chocolate");
    }

    @Override
    public void printPrise() {
        System.out.println("87");
    }
}

class CreamyMilkCocktail implements MilkCocktail {

    @Override
    public void printName() {
        System.out.println("Milk cocktail creamy");
    }

    @Override
    public void printPrise() {
        System.out.println("60");
    }
}