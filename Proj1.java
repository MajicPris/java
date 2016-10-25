import java.util.Scanner;


public class workk {
	
	private String login;
	private String password;
	private String str;
	private String type;
	private workk instance;
	
	public workk(){
		if(instance == null){
			//instance = new workk();
			password = new String("");			
			login = new String("");			
			str = new String("");			
			type = new String("");
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	



/**
 * @param args
 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	workk object = new workk();
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter login:");
	object.setLogin(scan.nextLine());
	System.out.println("Enter password:");
	object.setPassword(scan.nextLine());
	System.out.println("Enter str:");
	object.setStr(scan.nextLine());
	System.out.println("Enter type:");
	object.setType(scan.nextLine());
	
	System.out.print("\n"+object.getType()+ " "+object.getStr()+ " "+object.getLogin()+" "+object.getPassword());
	for(int i =0; i<5; i++){
		workk obj = new workk();
		System.out.print("\n"+object.getType()+ " "+object.getStr()+ " "+object.getLogin()+" "+object.getPassword());
	}
}

}
