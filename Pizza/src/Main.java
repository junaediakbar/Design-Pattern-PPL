
public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new CheeseTopping(new CaliforniaPizza());
        pizza1.namaPizza();
        System.out.println("\nPrice : " + pizza1.hargaPizza());
        System.out.println("---------");

        Pizza pizza2 = new CheeseTopping(new BeefTopping(new OnionTopping(new TomatoesTopping(new OriginalPizza()))));
        pizza2.namaPizza();
        System.out.println("\nPrice : " + pizza2.hargaPizza());
        System.out.println("---------");

        Pizza pizza3 = new ChickenTopping(new OnionTopping(new ItalianPizza()));
        pizza3.namaPizza();
        System.out.println("\nPrice: " + pizza3.hargaPizza());
        System.out.println("---------");
        
    }
    
}
