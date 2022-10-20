
public class Order {

	private int children;
	private int adults;
	private int students;
	private int oaps;
	private int teens;
	private int total;
	
	public Order(int c, int a, int s, int o, int t) {
		children = c;
		adults = a;
		students = s;
		oaps = o;
		teens = t;
	}

	public int Calculate_Order() {
		total = children*9 + adults*13 + students*10 + teens*12 + oaps*11;
		return total;
		
	}

	public int getChildren() {
		return children;
	}

	public int getAdults() {
		return adults;
	}

	public int getStudents() {
		return students;
	}

	public int getOaps() {
		return oaps;
	}

	public int getTeens() {
		return teens;
	}

	public double getTotal() {
		return total;
	}
	
	
	
	
}








