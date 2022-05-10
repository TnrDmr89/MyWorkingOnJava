package file;

public class Student {
   String name;
   String surname;
   int grade;
public Student(String name, String surname, int grade) {
	this.name = name;
	this.surname = surname;
	this.grade = grade;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public Integer getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return  name + " " + surname + " " + grade;
}



   
	

}
