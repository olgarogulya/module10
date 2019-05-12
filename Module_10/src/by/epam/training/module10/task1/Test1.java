package by.epam.training.module10.task1;

public class Test1 {

	private int variable1;
	private int variable2;

	public Test1(int variable1, int variable2) {

		this.variable1 = variable1;
		this.variable2 = variable2;
	}

	public int getVariable1() {
		return variable1;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}

	public int sum() {
		int varsum;
		varsum = this.variable1 + this.variable2;
		return varsum;
	}

	public int maximum() {
		int max;
		if (this.variable1 > this.variable2) {
			max = this.variable1;
		} else {
			max = this.variable2;
		}
		return max;
	}
}