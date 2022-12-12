package test_11_24th_object;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	//override to String
	@Override
	public String toString() {
		return company+","+os;
	}
}
