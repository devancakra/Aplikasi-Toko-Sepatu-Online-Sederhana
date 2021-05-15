package sepatu_anugerah;

public class listbarang extends maincontrol{
	 public void Barang(){
		 	//array of object
			String[][] produk = {{},{"\nTipe : S001 (PREMIUM VERZY)" ,"\nHarga : Rp. 310.000"},{"\nTipe : S002 (PREMIUM PINKSOO)","\nHarga : Rp. 280.000"},{"\nTipe : S003 (KOREAN RUBIN)","\nHarga : Rp. 245.000"}};
			System.out.println("===================================================");
	        System.out.println("                     LIST BARANG                   ");
	        System.out.println("===================================================");
	        
	        for(int i = 1; i<produk.length; i++){
	        	System.out.println("===================================================");
	        	System.out.println("Kode sepatu "+i+" = \n"+" "+produk[i][0]+" "+produk[i][1]);
	        	System.out.println("===================================================");
	        }
	 }
	 public String brg(){
	    	return("\n<<Setiap produk memiliki varian warna dan ukuran>>");
	    	}
}
