
public class DiscountedOrder extends Order {
	
	private String DiscountCode;
	private double total;
	
	public DiscountedOrder(int c, int a, int s, int o, int t, String dc) {
		super(c,a,s,o,t);
		DiscountCode = dc;
		
		
	}
	
	
	public double calculateTotalIncludingDiscount() {
		
		if (DiscountCode.equals("IMC")) {
			
			total = super.getChildren()*9 + super.getAdults()*13 + super.getStudents()*10 + super.getTeens()*12 + super.getOaps()*11;
			total *= 0.9;
			return total;
		
			
			
		} else {
			total = super.getChildren()*9 + super.getAdults()*13 + super.getStudents()*10 + super.getTeens()*12 + super.getOaps()*11;
			return total;
		}
	}

	public String getDiscountCode() {
		return DiscountCode;
	}

	public double getTotal() {
		return total;
	}
	
	
	
	
	
	

}






