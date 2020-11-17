package entities;

public class Employee {

	public String name;
	public Integer hours;
	public Double valuePerHour;
	
	public Employee() {
		
		
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer hour) {
		this.hours = hour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public double payment() {
		return hours * valuePerHour;
	}
}
