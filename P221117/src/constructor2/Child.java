package constructor2;

public class Child extends Parent {
	public int childNo;

	Child(String name, String ssn, int childNo) {
		super(name, ssn);
		this.childNo = childNo;
	}

}
