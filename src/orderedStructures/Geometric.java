package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		
		if(!initValue){
			throw new IllegalStateException("Invalid initial input");
		}
		current = current * commonFactor; 
		return current;
	}
	
	public String toString(){
		return ("Geom(" + (int)firstValue() + "," + (int) commonFactor + ")");
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
