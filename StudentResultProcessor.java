
public class StudentResultProcessor {

	static  String  schoolname = "Kendriya Vidyalaya" ;
	String student_name;
	
	int roll_no;
	int grade;
	
	int eng;
	int kan;
	int maths;
	int science;
	int social_science;
	int total_marks;
	float percentage;
	boolean final_result;
	
	public boolean GetFinalResult(int eng,
			int kan,
			int maths,
			int science,
			int social_science) 
	{
		
		if (eng < 35 || kan < 35 || maths <35 || science < 35 || social_science < 35)
		{
		   return false ;
		}
		else {
			return true;
		}
	}
	
	
	public StudentResultProcessor(String student_name,int roll_no,int grade,
	int eng,
	int kan,
	int maths,
	int science,
	int social_science,
	int total_marks,
	float percentage //,
	//boolean final_result
	)
	
	{
		this.student_name = student_name;
		this.roll_no = roll_no;
		this.grade = grade ;
		this.eng = eng ;
		this.kan = kan;
		this.maths = maths;
		this.science = science ;
		this.social_science = social_science;
		this.total_marks =  eng+kan+maths+science+social_science ;
		this.percentage = ((eng+kan+maths+science+social_science)*100)/500;
		this.final_result =  GetFinalResult(eng,kan,maths,science,social_science);
		
	}
   
	 
	
	public static String getSchoolname() {
		return schoolname;
	}


	public String getStudent_name() {
		return student_name;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public int getGrade() {
		return grade;
	}


	public int getEng() {
		return eng;
	}


	public int getKan() {
		return kan;
	}


	public int getMaths() {
		return maths;
	}


	public int getScience() {
		return science;
	}


	public int getSocial_science() {
		return social_science;
	}


	public int getTotal_marks() {
		return total_marks;
	}


	public float getPercentage() {
		return percentage;
	}


	public boolean isFinal_result() {
		return final_result;
	}


	public static void main(String[] args) {

		StudentResultProcessor  St1 = new StudentResultProcessor("Aarav",101,8,85,90,95,99,90,0,0);
		StudentResultProcessor  St2 = new StudentResultProcessor("Pranadh",102,8,90,90,100,99,90,0,0);
		StudentResultProcessor  St3 = new StudentResultProcessor("Sid",103,8,60,50,30,35,40,0,0);
		
		

		System.out.println("**************"+ schoolname +"***************");
		
			System.out.println("Student RollNumber : "+ St1.roll_no);
			System.out.println("Student Grade : "+ St1.grade);
			
			System.out.println(" English        : "+ St1.eng);
			System.out.println(" Kannada        : "+ St1.kan);
			System.out.println(" Maths          : "+ St1.maths);
			System.out.println(" Science        : "+ St1.science);
			System.out.println(" Social_Science : "+ St1.social_science);
			System.out.println(" Total Marks    : "+ St1.total_marks);
			System.out.println(" Percentage     : "+ St1.percentage+" %");
			if (St1.final_result)
			{
			System.out.println(" ***********CONGRATULATIONS, YOU HAVE PASSED ********* ");
			}
			else 
			{
				System.out.println(" ***********NO WORRIES, FAIL********* ");
			}
			
			System.out.println("Student Name : "+ St2.student_name);
			System.out.println("Student RollNumber : "+ St2.roll_no);
			System.out.println("Student Grade : "+ St2.grade);
			
			System.out.println(" English        : "+ St2.eng);
			System.out.println(" Kannada        : "+ St2.kan);
			System.out.println(" Maths          : "+ St2.maths);
			System.out.println(" Science        : "+ St2.science);
			System.out.println(" Social_Science : "+ St2.social_science);
			System.out.println(" Total Marks    : "+ St2.total_marks);
			System.out.println(" Percentage     : "+ St2.percentage+" %");
			if (St2.final_result)
			{
			System.out.println(" ***********CONGRATULATIONS, YOU HAVE PASSED ********* ");
			}
			else 
			{
				System.out.println(" ***********NO WORRIES, FAIL********* ");
			}
			
			System.out.println("Student Name : "+ St3.student_name);
			System.out.println("Student RollNumber : "+ St3.roll_no);
			System.out.println("Student Grade : "+ St3.grade);
			
			System.out.println(" English        : "+ St3.eng);
			System.out.println(" Kannada        : "+ St3.kan);
			System.out.println(" Maths          : "+ St3.maths);
			System.out.println(" Science        : "+ St3.science);
			System.out.println(" Social_Science : "+ St3.social_science);
			System.out.println(" Total Marks    : "+ St3.total_marks);
			System.out.println(" Percentage     : "+ St3.percentage+" %");
			if (St3.final_result)
			{
			System.out.println(" ***********CONGRATULATIONS, YOU HAVE PASSED ********* ");
			}
			else 
			{
				System.out.println(" ***********NO WORRIES, FAIL********* ");
			}
		
	}

}
