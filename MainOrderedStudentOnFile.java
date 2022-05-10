package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainOrderedStudentOnFile {

	public static void main(String[] args) throws FileNotFoundException  {
	   List<Student> studentList = new LinkedList<>();
	   File file = new File("Grades.txt");
       Scanner file1 = new Scanner(file);
       while(file1.hasNext()) {
    	   String name = file1.next();
    	   String surname = file1.next();
    	   int grade = file1.nextInt();
    	   Student student = new Student(name,surname,grade);
    	   studentList.add(student);
    	   
       }
       file1.close();
       
       Collections.sort(studentList, new OrderedGrades());
       PrintWriter fileWriter = new PrintWriter("OrderedGrades.txt");
       for(int i = 0; i < studentList.size();i++) {
    	   fileWriter.println(studentList.get(i));
    	   
       }
       fileWriter.close();
       
       
	}
}
