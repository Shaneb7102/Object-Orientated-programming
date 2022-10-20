
class Student extends Person {
	private String course;
	private int attendance;
	private boolean repeat=false;
	public Student(String nm, String nat, int a,String c, boolean rep){
		super(nm,nat,a);
		course=c; attendance=0;
		repeat=rep;
	}
    public void markAttended() {
    	attendance++;
    }
    public int  readAttendance() {
    	return attendance;
    }
    public String readCourse() {
    	return course;
    }
    public boolean readRepeat() {
    	return repeat;
    }
    public void addToAttendance(int amt) {
    	attendance += amt;
    }
}
