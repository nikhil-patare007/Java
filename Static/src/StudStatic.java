
public class StudStatic {
static String collegeName;
int rollNo;
String name;


static{
	System.out.println("loading College Name...");
	collegeName="JSPM";
}
public static void printCollegeData(){
	System.out.println("College name:"+collegeName);
}

public void doStudy(){
	StudStatic iAm=this;
	System.out.println("Doing Study....  my name is :"+iAm.name+"And Roll no is :"+rollNo+"College Name is :"+this.collegeName);
	printCollegeData();
}

public static void main(String[] args) {
	StudStatic s1=new StudStatic();
	StudStatic s2=new StudStatic();
	
	s1.name="nikhil";
	s1.rollNo=20;
	s2.name="vicky";
	s2.rollNo=11;
	
	
	s1.doStudy();
	s2.doStudy();
	
	
}
}