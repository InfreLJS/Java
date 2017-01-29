package emp;

public class Emp {
	String empno;
	int gi;
	double se;
	double su;
	double bong;
	String grad;

	public Emp() {

	}

	public Emp(String empno, int gi) {
		this.empno = empno;
		this.gi = gi;
		this.su = gi * 0.2;
		this.se = gi * 0.15;
		this.bong = this.gi + this.su - this.se;
		if (this.bong > 500000) {
			this.grad = "관리자";
		} else {
			this.grad = "영업";
		}
	}

	public String getEmpno() {
		return this.empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public int getGi() {
		return this.gi;
	}

	public void setGi(int gi) {
		this.gi = gi;
	}

	public double getSe() {
		return this.se;
	}

	public double getSu() {
		return this.su;
	}

	public double getBong() {
		return this.bong;
	}

	public String getGrad() {
		return this.grad;
	}

	public String toString() {
		return (empno + " |  " + gi + " |  " + su + " |  " + se + " |  " + bong + " |  " + grad);
	}
}
