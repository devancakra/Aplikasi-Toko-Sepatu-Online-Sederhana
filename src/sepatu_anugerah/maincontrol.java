package sepatu_anugerah;
import java.util.Scanner;

public class maincontrol {
	
	static int data,a;
	private static Scanner x;
	private static pesanan[] pes;
	
	//enkapsulasi
	public static pesanan[] getPes() {
		return pes;
	}

	public static void setPes(pesanan[] pes) {
		maincontrol.pes = pes;
	}
	    
	//method main
	public static void main(String[] args) {
	
	       login satu = new login();
	       satu.LoginToko();
	        
	            
	            x = new Scanner(System.in);
	            int choice;
	            
	            setPes(new pesanan[256]);
	            transaksi[] tr = new transaksi[256];
	            
	        do{
	        System.out.println("\n\nMENU UTAMA :");
			System.out.println("1. LIST BARANG"); //MENAMPILKAN JENIS BARANG
			System.out.println("2. BUAT PESANAN"); //MENAMPILKAN MENU PESANAN
	        System.out.println("3. MENAMPILKAN DAFTAR PESANAN");//MENAMPILKAN DATA PESANAN
			System.out.println("4. SEARCH DAFTAR PESANAN"); //MENAMPILKAN DATA PESANAN DENGAN MENCARI KODE PESANAN
	        System.out.println("5. DELETE PESANAN"); //MENGHAPUS DATA PESANAN
	        System.out.println("6. CONTACT PERSON"); //INFORMASI CONTACT PERSON
	        System.out.println("7. LOGOUT AKUN"); //LOGOUT ADMIN
	        System.out.println("8. EXIT PROGRAM"); //KELUAR PROGRAM
	                
	        System.out.print("\nMasukkan Pilihan Anda = ");
	        choice=x.nextInt();
	        
	        	switch(choice){
	        		case 1:
	        			//inheritance
	        			listbarang dua = new listbarang();
	        			dua.Barang();
	        			
	        			//polimorphism
	        		 	class premium_verzy extends listbarang{
	        		 	public String brg() {
	        		 		return(" Varian Warna : Silver, Black\n "
	        		 				+ "Tersedia ukuran : 35,36,37,38,39,40\n");
	        		 		}
	        		 	}
	        		 	class premium_pinksoo extends listbarang{	
	        		 	public String brg() {
	        		 		return(" Varian Warna : Strawberrymelon, Flowerlove\n "
	        		 				+ "Tersedia ukuran : 36,37,38,39,40\n");
	        		 		}
	        		 	}
	        		 	class korean_rubin extends listbarang{
	        		 	public String brg() {
	        		 		return(" Varian Warna : Yellow, White\n "
	        		 				+ "Tersedia Ukuran : 37,38,39,40,41,42,43\n");
	        		 		}
	        		 	}
	        			//membuat variabel baru polimorphism
	        		    listbarang objbrg = new listbarang();
	        		    premium_verzy objbrg1 = new premium_verzy();
	        		    premium_pinksoo objbrg2 = new premium_pinksoo();
	        		    korean_rubin objbrg3 = new korean_rubin();
	        		      
	        		    //membuat array
	        		    listbarang[] brg = new listbarang[7];
	        		    brg[0]=objbrg;
	        		    brg[1]=objbrg1;
	        		    brg[2]=objbrg2;
	        		    brg[3]=objbrg3;
	        		       
	        		    //cetak keterangan produk
	        		    System.out.println("\n\nKeterangan = "+objbrg.brg());
	        		    System.out.println("\n<PREMIUM VERZY> = \n"+objbrg1.brg());
	        		    System.out.println("\n<PREMIUM PINKSOO> = \n"+objbrg2.brg());
	        		    System.out.println("\n<KOREAN RUBIN>= \n"+objbrg3.brg());
	        		    System.out.println("\n========================================================================================================");
	        	        System.out.println("========================================================================================================");
	        		       
	        			break;
	        		 	
	        		case 2 :
	        			//inheritance+array of object
	        			tr[data] = new transaksi();
	        			data++;
	        			break;
	        		
	        		case 3 :
	        			//array of object
	        			for(int i=0;i < data;i++){
	        				tr[i].tampil();
	                    } 
	                    break;
	                    
	                case 4 :
	                	System.out.print("Masukkan Kode Pesanan : ");
	                    String kode_pesanan = x.next();
	                    boolean hasil;
	                    
	                    int c;
	        			//array of object
	                    for(c=0; c<=data; c++) {
	                        hasil = tr[c].cariKd(kode_pesanan);
	                        if(hasil)
	                            break;
	                    } 
	                    if(c==data)
	                        System.out.print("Kesimpulan : <<Data tidak ditemukan>>\n");
	                    else
	                        tr[c].tampil();
	                    	System.out.println("Kesimpulan : <<Data ditemukan>>");
	                    break;
	                    
	                case 5 :
	                	System.out.println("\n<Delete Data Pesanan>");
	                    int b = 0;
	                    System.out.print("Masukkan Kode Pesanan : ");
	                    kode_pesanan = x.next();
	                    for (int d=0; d < data; d++) {
	                    	a = 0;
	                        tr[d].cariKd(kode_pesanan);
	                        if(a!=0 && d!=data){
	                            for (int m = d; m < data; m++) {
	                                tr[m] = tr[m+1];
	                        }
	                        data--;
	                        b++;
	                    }
	                    else {
	                        data--;
	                        b++;
	                    	}  
	                    }                      
	                    if(b==0 ) {
	                        System.out.println("\n<<Data tidak ditemukan>>");
	                    }
	                    {   
	                    	a++;
	                    }
	                    break;
	                     
	                case 6 :
	                	//enkapsulasi+inheritance
	                	System.out.println("=================================================================");
	    	            System.out.println("                     INFORMASI CONTACT PERSON                    ");
	    	            System.out.println("=================================================================");
	                	contactperson obj = new contactperson();
	                    obj.setNama("Toko Sepatu Anugerah");
	                    obj.setAlamat("Jl.Bukit Golf No.2 Citraland Surabaya");
	                    obj.setEmail("anugerahshoes@gmail.com");
	                    obj.setNotelp("0858-5222-9000");
	                    obj.setWebsite("www.angshop.shoes.co.id");
	                    
	                    System.out.println("Nama Online Shop = "+obj.getNama());
	                    System.out.println("Alamat = "+obj.getAlamat());
	                    System.out.println("E-mail = "+obj.getEmail());
	                    System.out.println("No.Telp = "+obj.getNotelp());
	                    System.out.println("Website = "+obj.getWebsite());
	                    System.out.println("\n========================================================================================================");
	        	        System.out.println("========================================================================================================");
	                	break;   
	                	
	                case 7 :
	                	System.out.println("Telah Logout...\n\n");
	                	satu.LoginToko();
	                	System.out.println("\nNote : Tekan (F11) jika menu login tidak berfungsi!");
	                	System.out.println("\n========================================================================================================");
	        	        System.out.println("========================================================================================================");
	                    break;
	                
	                case 8 :
	                	System.out.println("Program telah berhenti...\n\n");
	                	System.out.println("\n========================================================================================================");
	        	        System.out.println("========================================================================================================");
	                	break;
	                	
	                default:
	                	System.out.println("Error!");
	        			}
	        		}
	        		while(choice!=8);
	    			}
}
