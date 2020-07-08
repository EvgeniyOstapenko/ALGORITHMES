public class Exaple {
    public static void main(String[] args) throws Exception {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;

        Mythread1 mythread1 = new Mythread1();
        Mythread2 mythread2 = new Mythread2();
        mythread1.resourceA = resourceA;
        mythread2.resourceB = resourceB;

        mythread1.start();
        mythread2.start();
    }
}

class Mythread1 extends Thread {
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}

class Mythread2 extends Thread {
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}

class ResourceA {
    ResourceB resourceB;

    public synchronized int getI() {
        return resourceB.returnI();
    }

    public synchronized int returnI(){
        return 1;
    }
}


class ResourceB {
    ResourceA resourceA;

    public synchronized int getI() {
        return resourceA.returnI();
    }

    public synchronized int returnI(){
        return 2;
    }


}