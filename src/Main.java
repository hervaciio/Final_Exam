public class Main {
	public static void main(String[] args) {
		Quiz quiz;

		Student stdnt = new Student("Karen", 60);

		System.out.println(stdnt.getStudentName()+" grade is "+stdnt.calculateGrade());
	}
}
