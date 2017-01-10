public class aloha  {
	public static void main(String[] args) {
	Alohaman am = new Alohaman();
	am.sayAloha();



	}
	
}
class Alohaman{
	///data
	private String msg;

	private String msg2;



	//method
	public Alohaman(){
		this.msg = "aloha";
		this.msg2 = "hello";
	}
public void sayAloha(){
	System.out.println(this.msg);
}
public void sayAloha(int n){
	for( int i = 0; i<n; i++){
		System.out.println( i+ this.msg);
	}
	


}

}