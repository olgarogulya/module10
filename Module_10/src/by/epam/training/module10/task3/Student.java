package by.epam.training.module10.task3;

public class Student {

	private String name;
	private String groupnumber;
	private int[] marks;
	
	public Student (String name, String groupnumber, int[] marks) {
		this.name = name;
		this.groupnumber = groupnumber;
		this.marks = marks;
		}

	public String getName() {
		return name;
	}

	public String getGroupnumber() {
		return groupnumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public boolean isAStudent() {
		for(int mark : marks) {
			if((mark != 9) && (mark != 10)) {
				return false;
			}
		}
		return true;
	}
	
	
}
