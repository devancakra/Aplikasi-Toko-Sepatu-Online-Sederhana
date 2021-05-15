package sepatu_anugerah;
import java.util.Scanner;

public class login extends maincontrol{
	Scanner x = new Scanner(System.in);
	   public void LoginToko(){
		System.out.println("========================================================================================================");
		System.out.println("========================================================================================================");
	    System.out.println("===================================================");
	    System.out.println("              SELAMAT DATANG DI TOKO KAMI          ");
	    System.out.println("                  TOKO SEPATU ANUGERAH             ");
	    System.out.println("   MELAYANI SEPENUH HATI, BUKAN JANJI TAPI BUKTI   ");
		System.out.println("===================================================");
	       
		System.out.println("\nSilahkan login untuk melanjutkan");
	    System.out.print("Username : ");
	    	String user = x.nextLine();
	    System.out.print("Password : ");
	    	String pass = x.nextLine();
	    	
			if ((user.equals(user)) && (pass.equals(pass))){
	            System.out.println("\n<<Login Sukses!>>");
	            System.out.println("===================================================");
	        }
	        else {
	            System.out.println("\n<<Username atau Password Salah!>>");
	            System.out.println("===================================================");
	            LoginToko();
	        }    
	   }
}
