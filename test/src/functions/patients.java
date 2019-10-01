package functions;

public class patients {

	public static void main(String[] args)
	{
		 hospital hospital1=new hospital();
		 hospital1.hospitalName="Noble";
		 hospital1.patienttype="bone injury";
		 hospital1.speciality="orthopedic";
		 hospital1.doctorName="Dr.sharma";
		 hospital1.numberofbed=100;
		 hospital1.numberofDoctors=10;
		 hospital1.treatement();
		 
		 hospital1.capacity();
		 
		 hospital hospital2=new hospital();
		 hospital2.hospitalName="Colombia Asia";
		 hospital2.patienttype="cancer";
		 hospital2.speciality="oncologist";
		 hospital2.doctorName="Dr.Batra";
		 hospital2.numberofbed=50;
		 hospital2.numberofDoctors=5;
		 hospital2.treatement();
		 
		 hospital2.capacity();
		 
		 hospital hospital3= new hospital("tooth ache","manohar","dentist",1000,100,"city hospital");
		 hospital3.treatement();
		 
		 hospital3.capacity();	 
		 
		 
		 
		 
		 
		 
	}

}
