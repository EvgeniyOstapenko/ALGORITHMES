public class StrategyTutorial {
    public static void main(String[] args) {
        DoorA door = new DoorA();

        Strategy open = new OpenA();
        door.setStrategy(open);
        door.move();

        Strategy close = new CloseA();
        door.setStrategy(close);
        door.move();

    }
}

class DoorA{
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void move() {
        strategy.openClose();
    }
}

interface Strategy {
    void openClose();
}

class OpenA implements Strategy {
    @Override
    public void openClose() {
        System.out.println("Door is opened");
    }
}

class CloseA implements Strategy {
    @Override
    public void openClose() {
        System.out.println("Door is closed");
    }
}



