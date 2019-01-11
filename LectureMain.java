import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student
{
	private String stuName;
	private String stuNo;
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	public Student(String name, String no)
	{
		this.stuName = name;
		this.stuNo = no;
	}
}

class Lecture
{
	private String lecName;
	private String Tr;
	List<Object> student = new ArrayList<Object>();
	private String eva; // 강의만족도
	
	public String getEva() {
		return eva;
	}

	public String getLecName() {
		return lecName;
	}

	public void setLecName(String lecName) {
		this.lecName = lecName;
	}

	public String getTr() {
		return Tr;
	}

	public void setTr(String tr) {
		Tr = tr;
	}

	public List<Object> getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student.add(student);
	}

	public void start()
	{
		System.out.println("[" + getLecName() + "]" +"강의를 시작합니다.");
		System.out.println("담당교수: " + getTr());
		System.out.println("출석학생:");
		for (int i=0; i<student.size(); i++)
		{
			System.out.format("%s%n", student.get(i));
		}
	}
	
	public void end()
	{
		System.out.println("강의를 마칩니다.");
	}
	
	public void eval()
	{
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.println("강의만족도를 입력하세요.");
		message = scan.nextLine();
		eva = message;
	}
}



public class LectureMain {
	public static void main(String[] args)
	{
		Student s1 = new Student("황어준","201681020");
		Lecture l1 = new Lecture();
		l1.setLecName("자바");
		l1.setTr("장성훈");
		l1.setStudent(s1);
		
		l1.start();
		l1.end();
		l1.eval();
		System.out.println("강의만족도: " + l1.getEva());
		
		
	}
}
