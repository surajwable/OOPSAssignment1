
public class TestStudent {

	public static void main(String[] args) {

		Student s1 =new Student("suraj",98,97,96);
		System.out.println(s1);
		Student s2=new Student("akash",95,95,96);
		System.out.println(s2);

		System.out.println(s1 instanceof Student);
		System.out.println(s2 instanceof Student);
	}
}
