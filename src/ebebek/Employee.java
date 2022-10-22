package ebebek;

public class Employee {
	
	private String name;
	private double salary;
	private double workHours;
	private int hireYear;
	


	public String getFullName() {
		return name;
	}

	public void setFullName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	
	
	
	public Employee(String name,double salary,double workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	
	public double tax() {
		if(getSalary()>1000) {
			return getSalary()*0.03;
		}else {
			return 0;
		}
	}
	
	public double bonus() {
		double bonus=0;
		if(workHours>40) {
			bonus=(workHours-40)*30;
		}
		return bonus;
	}
	
	public double raiseSalary() {
		final int  currentYear=2021;
		double raiseSalary=0;
		int workingYear= currentYear-getHireYear();
		if(workingYear<10) {
			raiseSalary=getSalary()*0.05;
		}else if(workingYear>9 && workingYear<20) {
			raiseSalary=getSalary()*0.1;
		}else if(workingYear>19) {
			raiseSalary=getSalary()*0.15;
		}
		
		return raiseSalary;
	}
	
	@Override
	public String toString() {
		return "Ad�: " + name + "\n" +
                "Maa��: " + salary + "\n" +
                "�al��ma Saati: " + workHours + "\n" +
                "Ba�lang�� Y�l�: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maa� Art���: " + (raiseSalary())+ "\n" +
                "Vergi ve Bonuslar ile birlikte maa� : "+ (getSalary()+bonus()-tax())+ "\n" +
                "Toplam Maa�: "+(getSalary()+bonus()-tax()+raiseSalary());
	}

}
