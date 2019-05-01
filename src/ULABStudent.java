
public class ULABStudent extends Student {
	
 String email;
 String moodleInformation;
 
 public ULABStudent(String iD, String name, String email, String moodleInformation){
	

	 super(iD, name);
	 
	 this.email = email;	 
	 this.moodleInformation = moodleInformation;
	  
	 
 }
 
 
 public void getInfo(){
	 System.out.println(super.ID + "--" +super.Name+ "-" +'\n'+ this.email+ "--" + this.moodleInformation);
 }
 
 
 

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMoodleInformation() {
	return moodleInformation;
}

public void setMoodleInformation(String moodleInformation) {
	this.moodleInformation = moodleInformation;
}
 
 
}
