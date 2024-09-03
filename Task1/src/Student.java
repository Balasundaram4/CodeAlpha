import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String a= scanner.nextLine();
		System.out.print("Number of Subjects: ");
		int var = scanner.nextInt();
		System.out.print("Subjects Marks: ");
		int[] ar= new int[var];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=scanner.nextInt();
		}
		
		Student_data st= new Student_data();
		st.studentName(a);
		st.get_marks(ar);
		st.total();
		st.average();
		st.higest_lowest();
		st.grade();
		scanner.close();	

	}

}
