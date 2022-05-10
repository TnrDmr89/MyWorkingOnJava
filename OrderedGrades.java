package file;

import java.util.Comparator;

public class OrderedGrades implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int name = o1.getName().compareTo(o2.getName());
		int surname = o1.getSurname().compareTo(o2.getSurname());
		int grade = o1.getGrade().compareTo(o2.getGrade());
		
		return (grade == 0) ? (name == 0 ? surname : name) : grade;
	}

}
