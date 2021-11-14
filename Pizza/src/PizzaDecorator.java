
public class PizzaDecorator implements Pizza {

    protected Pizza pizza;
    public int hargaTopping;

    public PizzaDecorator(Pizza p) {
        this.pizza = p;
    }

    @Override
    public void namaPizza() {
        this.pizza.namaPizza();
        
    }

    @Override
    public int hargaPizza() {
        // TODO Auto-generated method stub
        return this.pizza.hargaPizza();
    }

    
}
