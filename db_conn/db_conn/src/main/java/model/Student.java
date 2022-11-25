package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long reg_no;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DEPARTMENT")
	private String department;
	
	@Column(name = "MARKS")
	private int marks;
	public long getId() {
		return reg_no;
	}
	public void setId(long reg_no) {
		this.reg_no = reg_no;
	}
	public String getName() {
		return name;
	}
	public void setFirstName(String name) {
		this.name = name;
	}
	public String getDept() {
		return department;
	}
	public void setLastName(String department) {
		this.department = department;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
}
