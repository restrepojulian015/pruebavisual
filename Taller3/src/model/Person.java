package model;

public class Person {

	// ATRIBUTTES ( CARACTERISTICAS)
	private String name;
	private int age;
	private double height;
	private int weight;
	private String allergies;
	private int call;
	private String mail;
	private String gender;
	private int id;
	private String eps;
	private String backgroundFamily;
	private String surgeries;
	
	// METHODS (Behavior)
	/**
	 * This method creates an instance 
	 * @param name, the label of the person
	 */
	public Person(String nm) {
		this.name = nm;
		this.age = 0;
	}
	
	
	/**
	 * This method write a message through the standart console
	 */
	public void greet() {
		System.out.println("Hello, my name is " + name);
	}

	
	
}
