package package1;

public class EmployeeInfoEncapusalation {
	private int id;
	private String name;
	private double salary;
	public void setData(int id,String name,double salary) {
		if(id<=0) {
			System.out.println("invalid");
			System.exit(0);
		}else {
			this.id = id;
			this.name= name;
			this.salary = salary;
		}
		
	}
	public void getData() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

}
