public class Test {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        GroceryProductFactory prod1 = productFactory.getProduct("Apples");
        prod1.create();

        GroceryProductFactory prod2 = productFactory.getProduct("Bananas");
        prod2.create();

    }
}