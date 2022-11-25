import java.util.Date;

public class Student {
	private String sid;
	private String name;
	private int m1,m2,m3;
	static int pass_marks;
	static int count;

	static {
		pass_marks=60;
		count=0;
	}

	public String generateCode(String nm) {
		return ++count+nm.substring(1, 3)+new Date();
	}

	public Student() {
		this.sid=generateCode("ABCD");
		this.name=null;
		this.m1=0;
		this.m2=0;
		this.m3=0;
	}

	public Student(String nm,int m1,int m2,int m3) {
		this.sid=generateCode(nm);
		this.name=nm;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	public String toString() {
		return "ID: "+this.sid+"NAME"+this.name+"M1 "+m1+"M2 "+m2+"M3 "+m3;
	}
}
