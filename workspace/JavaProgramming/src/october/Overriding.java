package october;
class Oct12_Person {
	String phone;

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public String getPhone(double d) {
		return phone + " " + d;
	}
}

class Oct12_Professor extends Oct12_Person {
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}

	public String getPhone(double d) {
		return "Professor : " + super.getPhone();
	}
}

public class Overriding {

	public static void main(String[] args) {
		Oct12_Professor a = new Oct12_Professor();
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());

		Oct12_Person p = a;
		System.out.println(p.getPhone());
	}

}
