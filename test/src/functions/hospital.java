package functions;

public class hospital {

	public String patienttype;
	public String doctorName;
	public String speciality;
	public int numberofbed;
	public int numberofDoctors;
	public String hospitalName;

	public void treatement() {
		System.out.println("patients with bone injury will be sent to " + speciality + " doctor " + doctorName);
	}

	public void capacity() {
		System.out.println(hospitalName + " has " + numberofbed + " beds and " + numberofDoctors + " doctors");
	}
	//Default constructor
	public hospital()

	{
		
	}
   public hospital(String patienttype,String doctorName,String speciality,int numberofbed,int numberofDoctors,String hospitalName)
   {
	this.patienttype=patienttype;
	this.doctorName=doctorName;
	this.speciality=speciality;
	this.numberofbed=numberofbed;
	this.numberofDoctors=numberofDoctors;
	this.hospitalName=hospitalName;
   }
   

}



