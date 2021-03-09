package d2;

public class Project {

	private int projectID;
	private String Pname;
	private String tech;
	
	
	public Project() {
		super();
		projectID=125;
		Pname="Android App";
		tech="Flutter";
	}
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	

	
}
