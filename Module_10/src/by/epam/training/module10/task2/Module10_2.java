package by.epam.training.module10.task2;

public class Module10_2 {

	// Создайте класс Test2 двумя переменными. Добавьте конструктор с входными
	// параметрами. Добавьте конструктор, инициализирующий члены класса по
	// умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Test2 var1 = new Test2();
	Test2 var2 = new Test2();

	var1.setVariable1(3);
	var2.setVariable1(5);

	System.out.println("variable1 " + var1.getVariable1());
	System.out.println("variable2 " + var2.getVariable1());

	}

	}	

