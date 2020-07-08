
interface Product {
    int getPrise();
}

class Milk implements Product {
    private final int prise;


    Milk(final int prise) {
        this.prise = prise;

    }


    @Override
    public int getPrise() {
        return this.prise;

    }

}
    abstract class Decorator implements Product {
        final Product product;


        protected Decorator(Product product) {
            this.product = product;
        }
    }

    class MilkDiscount extends Decorator{


        protected MilkDiscount(Product product) {
            super(product);

        }

        @Override
        public int getPrise() {
            return this.product.getPrise() - 15;

        }

    }

class Shop {
    public static void main(String[] args) {
        Product milk = new Milk(50); // may ise any product!
        Product milkDiscount = new MilkDiscount (new MilkDiscount(milk));
        System.out.println(milkDiscount.getPrise());

    }
}







