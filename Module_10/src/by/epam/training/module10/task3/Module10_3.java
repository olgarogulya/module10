package by.epam.training.module10.task3;

//Создайте класс с именем Student, содержащий поля:
//фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
//Создайте массив из десяти элементов такого типа. 
//Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Module10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st;
		st = new Student[9];
		
		Student st1 = new Student("Ivanov AA", "group 1", new int[] {9, 9, 9, 10, 9});
		Student st2 = new Student("Petrov II", "group 2", new int[] {9, 9, 9, 10, 9});
		Student st3 = new Student("Smirnova YM", "group 3", new int[] {7, 9, 9, 8, 8});
		Student st4 = new Student("Ivanova MV", "group 3", new int[] {8, 9, 8, 8, 9});
		Student st5 = new Student("Sidorova AE", "group 1", new int[] {5, 7, 6, 4, 4});
		Student st6 = new Student("Dmitriev NK", "group 2", new int[] {4, 4, 4, 3, 4});
		Student st7 = new Student("Vasilyeva KM", "group 2", new int[] {9, 9, 9, 10, 9});
		Student st8 = new Student("Konstantinov IA", "group 1", new int[] {7, 9, 7, 8, 7});
		Student st9 = new Student("Vadimov VV", "group 3", new int[] {9, 9, 9, 10, 9});
		Student st10 = new Student("Aleksandrov DI", "group 3", new int[] {5, 6, 6, 5, 5});
		
		for(int i = 0; i<9; i++) {
			if(st[i].isAStudent()) {
				System.out.println(st[i].getName() + ", group number " + st[i].getGroupnumber() + " is A Student");
			}
		}
		
	}

}
