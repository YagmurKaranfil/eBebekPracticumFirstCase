package ebebek;


public class Main {

	public static void main(String[] args) {
		
		Employee employee1= new Employee("Kemal Ta�", 2000, 45, 1985);
		Employee employee2= new Employee("Ay�e �im�ek", 900, 40, 2006);
		Employee employee3= new Employee("Ya�mur Karanfil", 1500, 50, 2016);
		
		Employee[] employees ={employee1,employee2,employee3};
		for(Employee employee:employees) {
			System.out.println(employee.toString()+"\n");
			
		}

	}

}
