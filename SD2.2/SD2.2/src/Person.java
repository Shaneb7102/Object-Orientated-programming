
class Person {
	protected String name;
	protected String nationality;
	private int age;
	public Person(String nm, String nat, int a){
		name=nm;
		nationality=nat;
		age=a;
	}
	public String readName(){
		return  name;
	}
	public String readNationality() {
		return nationality;
	}
    public void stepAge() {
    	age++;
    }
    public int readAge() {
    	return  age;
    }
}

