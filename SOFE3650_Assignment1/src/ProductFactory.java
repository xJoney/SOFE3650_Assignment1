public class ProductFactory{

    public GroceryProductFactory getProduct(String prod){
        if(prod == null){
            return null;
        }
        if(prod.equalsIgnoreCase("Apples")){
            return new Apples();
        }
        else if(prod.equalsIgnoreCase("Bananas")){
            return new Bananas();
        }
        return null;

    }


}
