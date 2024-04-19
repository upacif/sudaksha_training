package suda;

public class StudentMarks {

public static void main(String[] args) {
	int rno;
	double average;
	rno=1;
	int sub1=40;
	int sub2=45;
	int sub3=60;
	int total=sub1+sub2+sub3;
	average=total/3;
	if (sub1>=40&&sub2>=40&&sub3>=40) 
	System.out.println("Pass");
	else 
		System.out.println("Fail");
}
}
