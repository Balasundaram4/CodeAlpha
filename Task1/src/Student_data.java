public class Student_data {
	public String name;
	public int[] marks;
	int total=0;
	int average;
	public void studentName(String a) {
		System.out.println("----------------------------");
		System.out.println("Student Name: "+a);
	}
	public int[] get_marks(int[] ar) {
		
		marks=ar;
		return marks;
		
	}
	public void  total() {

		for(int i =0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		System.out.println("Total : "+total);
	}

	
	public void  average() {
		average=total/marks.length;
		System.out.println("Average : "+average);
	}
	
	
	public void higest_lowest(){
		for(int i=0;i<marks.length;i++)
		{
			
			for(int j=i+1;j<marks.length;j++)
			{
				if(marks[i]>marks[j])
				{
					int temp=marks[i];	
					marks[i]=marks[j];
				    marks[j]=temp;
				}
			}
		}
			System.out.println("Lowest Mark: "+marks[0]);
			System.out.println("Highest Mark: "+marks[marks.length-1]);
	}
	
	public void grade() {
		if (average>=81 && average<=100)
		{
			System.out.println("GARDE- O");
		}
		else if (average>=61 && average<=80)
		{
			System.out.println("GARDE- A");
		}
		else if (average>=45 && average<=60)
		{
			System.out.println("GARDE- B");
		}
		else {
			System.out.println("FAIL");
		}
	}
}
