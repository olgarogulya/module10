package by.epam.training.module10.task1;

public class Module10_1 {

	// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
	// методы изменения этих переменных. Добавьте метод, который находит сумму
	// значений этих переменных, и метод, который находит наибольшее значение из
	// этих двух переменных

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 var1 = new Test1(1, 2);
		// Test1 var2 = new Test1(5, 6);

		// var1.setVariable1(1);
		// var2.setVariable1(4);

		System.out.println("variable1 " + var1.getVariable1());
		System.out.println("variable2 " + var1.getVariable2());

		var1.sum();
		System.out.println("summa " + var1.sum());

		var1.maximum();
		System.out.println("maximum " + var1.maximum());
	}

}