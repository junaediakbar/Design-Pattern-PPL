
public class CheeseTopping extends PizzaDecorator{

    private int hargaKeju = 200;

    public CheeseTopping(Pizza p) {
        super(p);
        //TODO Auto-generated constructor stub
    }

    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" + Cheese");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + hargaKeju;
    }
  
    
}
