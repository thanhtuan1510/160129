public class aloha  {
	public static void main(String[] args) {
	Alohaman am = new Alohaman();
	am.sayAlohaman();
	}
	class Alohaman{

	//data
	private String msg;



	//method

	///aloham method
	public Alohaman(){
		//constructor
		this.msg = "ALOHA!";

	}

	///sayaloha method
	public void sayAlohaman(){
		System.out.println(this.msg);	
	}
}
}



	


