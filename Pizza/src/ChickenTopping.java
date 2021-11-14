
public class ChickenTopping extends PizzaDecorator {

    public ChickenTopping(Pizza p) {
        super(p);
        //TODO Auto-generated constructor stub
    }
    
    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" + Chicken");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 300;
    }
    
}
