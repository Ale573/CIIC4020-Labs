package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		
		if(!initValue){
			throw new IllegalStateException("Invalid initial input");
		}
		current = current + commonDifference; 
		return current;
	}
	
	public String toString(){
		return ("Arith(" + (int)firstValue() + "," + (int) commonDifference + ")");
	}
	
	@Override
	public double getTerm(int n) {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
		double value = this.firstValue(); 
		for (int i=1; i<n; i++) 
			value = nextValue(); 
		return value; 
	}

}
