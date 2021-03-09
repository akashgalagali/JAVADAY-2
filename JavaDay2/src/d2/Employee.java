package d2;

public class Employee {
	
	private int id;
	private String name;
	private String projectName;
	
	
	public Employee() {
		super();
		id=123;
		name="Akash";
		projectName="webApp";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void display() {
		System.out.println("Employee Name"+name);
		System.out.println("Employee ID"+id);
		System.out.println("Project "+projectName);
	}

}
