package cogenttest;

public class EmployeeBean {
	private long employeeId;
	private String employeeFname;
	private String employeeLname;
	private String employeeEmail;
	private int employeeAge;
	private boolean employeeIsMarried;
	private String employeeCity;
	private String employeeCountry;
	
	public EmployeeBean() {
		super();
	}
	public EmployeeBean(long employeeId, String employeeFname, String employeeLname, String employeeEmail,
			int employeeAge, boolean employeeIsMarried, String employeeCity, String employeeCountry) {
		super();
		this.employeeId = employeeId;
		this.employeeFname = employeeFname;
		this.employeeLname = employeeLname;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
		this.employeeIsMarried = employeeIsMarried;
		this.employeeCity = employeeCity;
		this.employeeCountry = employeeCountry;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFname() {
		return employeeFname;
	}
	public void setEmployeeFname(String employeeFname) {
		this.employeeFname = employeeFname;
	}
	public String getEmployeeLname() {
		return employeeLname;
	}
	public void setEmployeeLname(String employeeLname) {
		this.employeeLname = employeeLname;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public boolean isEmployeeIsMarried() {
		return employeeIsMarried;
	}
	public void setEmployeeIsMarried(boolean employeeIsMarried) {
		this.employeeIsMarried = employeeIsMarried;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	public String getEmployeeCountry() {
		return employeeCountry;
	}
	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}
	
	@Override
	public String toString() {
		String toReturn = "";
		
		toReturn += "Name: " + this.employeeLname + ", " + this.employeeFname;
		toReturn +="Email: " + this.employeeEmail;
		toReturn +="ID: " + this.employeeId;
		toReturn +="Age: " + this.employeeAge;
		toReturn +="Marital Status (T/F): " + this.employeeIsMarried;
		toReturn +="Location: " + this.employeeCity + ", " + this.employeeCountry;
		
		return toReturn;
	}
}
