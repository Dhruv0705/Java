package Employee;

public class Employee{
    private String name;
    private String position;
    private String id;
    public int salary;

    public Employee(String n, String p, String i, int s){
        name = n;
        position = p;
        id = i;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getPosition() {
		return position;
	}
	
	public void setPosition(String newPosition) {
		position = newPosition;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public int getSalary(){
        return salary;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public String toString() {
		return "Name: " + this.name + "\nPosition: " +
	this.position + "\nID number: " + this.id + 
	"\nSalary: " + this.salary;
	}


}
