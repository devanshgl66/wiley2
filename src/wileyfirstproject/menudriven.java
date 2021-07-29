package wileyfirstproject;

import java.util.*;

class Emp {
	String name, designation;
	int age;
	float salary;

	Scanner sc = new Scanner(System.in);

	private boolean NameAllowed(String name) {
		int sp = 0;
		for (int i = 0; i < name.length(); i++)
			if (name.charAt(i) == ' ')
				sp++;
		return sp <= 2;
	}

	private boolean DesignationAllowed(String des) {
		if (des.equalsIgnoreCase("Programer") || des.equalsIgnoreCase("Manager") || des.equalsIgnoreCase("Tester"))
			return true;
		return false;
	}

	String getNameFromUser() {
		boolean nameAllow = false;
		String name = null;
		while (nameAllow == false) {
			System.out.println("Enter your name:");
			name = sc.nextLine();
			nameAllow = NameAllowed(name);
			if (!nameAllow) {
				System.out.println("Name not allowed");
			}
		}
		return name;
	}

	int getAgeFromUser() {
		int age = 0;
		while (true) {
			System.out.println("Enter your age:");
			age = sc.nextInt();
			sc.nextLine();
			if (age >= 18 && age <= 60)
				break;
			else
				System.out.println("Enter age between 18 and 60.");
		}
		return age;
	}

	String getDesignationFromUser() {

		boolean allowDesignation = false;
		String des = null;
		while (allowDesignation == false) {
			System.out.println("Enter your designation:");
			des = sc.next();
			allowDesignation = DesignationAllowed(des);
			if (!allowDesignation) {
				System.out.println("Designation not allowed");
			}
		}
		return des;
	}

	float setSalary() {
		float salary = 0;
		if (designation.equalsIgnoreCase("Programer"))
			salary = 30000;
		else if (designation.equalsIgnoreCase("Manager"))
			salary = 35000;
		else if (designation.equalsIgnoreCase("Tester"))
			salary = 25000;
		else
			salary = 0;
		return salary;
	}

	void create() {
		name = getNameFromUser();
		age = getAgeFromUser();
		designation = getDesignationFromUser();
		salary = setSalary();
	}

	void disp() {
		System.out.println("Name:" + name);
		System.out.println("Designation: " + designation);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

class Empv2 extends Emp {
	String EmpId;
	static int EmpCount = 0;

	Empv2() {
		EmpCount++;
		setEmpId();
	}

	void setEmpId() {
		if (EmpId != null)
			System.out.println("Cannot assign new Empolyee Id");
		else
			EmpId = "wil" + EmpCount;
	}

	void disp() {
		System.out.println("Employee ID: " + EmpId);
		super.disp();
	}

	void create() {
		super.create();
	}

	void raiseSalary() {
		float per = 31;
		while (per<0 || per > 30) {
			System.out.println("Enter increment percentage of salary(max 30%): ");
			per = sc.nextFloat();
			if (per > 30) {
				System.out.println("Max percentage allowed is 30%.Enter again.");
			} 
			else if(per<0)
				System.out.println("Enter positive percentage.");
			else
				break;
		}
		salary = ((100 + per) / 100) * salary;
	}
}

public class menudriven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		ArrayList<Empv2> arr=new ArrayList<Empv2>();
//		ArrayList arr=new ArrayList();
		char ch;
		int n;
		int maxChoice = 1;
		while (choice != 5) {
			
			n = 10;
			ch = 'Y';
			System.out.println("1)Create");
			System.out.println("2)Display");
			System.out.println("3)Raise salary");
			System.out.println("4)Delete Account");
			System.out.println("5)Exit");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice > maxChoice && choice != 5) {
				System.out.println("Enter choice till " + maxChoice + " .Try again");
				continue;
			} else if (choice == maxChoice)
				maxChoice++;
			switch (choice) {
			case 1:
				while ((ch == 'Y' || ch == 'y') && n > 0) {
					arr.add(new Empv2());
					arr.get(arr.size()-1).create();
					n--;
					if (n > 0) {
						System.out.println("Continue: Y/N");
						ch = sc.nextLine().charAt(0);
					}
				}
				break;
			case 2:
				for (int i = 0; i < arr.size(); i++)
					arr.get(i).disp();
				break;
			case 3:
				int i = arr.size();
				while(i>=arr.size()) {
					System.out.println("Enter EmpId: ");
					String id = sc.nextLine();
					
					
					for (i = 0; i < arr.size(); i++)
						if (arr.get(i).EmpId.equalsIgnoreCase(id))
							break;
					if(i==arr.size())
						System.out.println("Employee not found.Enter correct Employee ID");
					else
						break;
				}
				arr.get(i).raiseSalary();
				break;
			case 4:
				i = arr.size();
				while(i>=arr.size()) {
					System.out.println("Enter EmpId: ");
					String id = sc.nextLine();
					
					
					for (i = 0; i < arr.size(); i++)
						if (arr.get(i).EmpId.equalsIgnoreCase(id))
							break;
					if(i==arr.size())
						System.out.println("Employee not found.Enter correct Employee ID");
					else
						break;
				}
				arr.remove(i);
				break;
			case 5:
				System.out.println("Thank you for using our service.");
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}
