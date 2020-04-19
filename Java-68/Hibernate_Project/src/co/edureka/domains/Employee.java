package co.edureka.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee", schema = "java68")
public class Employee 
{
 private Integer empno;
 private String name;
 private Float sal;
 
 public Employee() {}
 
 public Employee(Integer empno, String name, Float sal) {
	super();
	this.empno = empno;
	this.name = name;
	this.sal = sal;
}

@Id 
@Column(name = "empno", length = 5, unique =true, nullable = false)
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}

@Column(name = "name", length=25)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name = "sal", length=10, precision = 2)
public Float getSal() {
	return sal;
}
public void setSal(Float sal) {
	this.sal = sal;
}
 
}
