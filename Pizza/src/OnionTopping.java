
public class OnionTopping extends PizzaDecorator {
	
	public OnionTopping(Pizza p) {
		super(p);
		//TODO Auto-generated constructor stub
	}

    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" + Onion");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 100;
    }
}
