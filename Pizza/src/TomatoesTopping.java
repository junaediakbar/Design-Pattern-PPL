public class TomatoesTopping extends PizzaDecorator {

    public TomatoesTopping(Pizza p) {
        super(p);
        //TODO Auto-generated constructor stub
    }
    
    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" + tomato");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 100;
    }
    
}
