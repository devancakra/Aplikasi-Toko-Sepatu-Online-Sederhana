package sepatu_anugerah;
import java.util.Scanner;

public class pesanan extends maincontrol{
	
	 String tlp,kode_pesanan,nama_pemesan,alamat,tanggal_pembelian,kode_sepatu,warna,norek,nama_pengirim,ukuran;
	 int jumlah,harga,dp;
	 static int totalharga,kurang,ongkir;
	    

	    Scanner x = new Scanner(System.in);
	    //enkapsulasi
	    public int getHarga(int a){
	        this.harga = a;
	        return harga;
	    }
	    public boolean cariKd(String kib) {
	        if(kode_pesanan.equals(kib)) {
	            return true;
	        }
	        else return false;
	    }

	    public pesanan(){
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
	 
	        System.out.println("\n\n===================================================");
	        System.out.println("       	             MENU PESANAN                  ");
	        System.out.println("===================================================");
	       
	        System.out.print("Masukkan Kode Pesanan : ");
	        kode_pesanan =x.nextLine();

	        System.out.print("Masukkan Nama Pemesan : ");
	        nama_pemesan = x.nextLine();
	        
	        System.out.print("Masukkan Alamat Pemesan : ");
	        alamat = x.nextLine();
	        
	        System.out.print("Masukkan No Telepon : ");
	        tlp = x.nextLine();
	        
	        System.out.print("Tanggal Pemesanan : ");
	        tanggal_pembelian = x.nextLine();
	        
	        System.out.print("Masukkan Kode Sepatu : ");
	        kode_sepatu = x.next();
	        

        	ongkir = 50000;
        	
	        if(kode_sepatu.equals("1")){
	        	harga = 310000;
	            }
	            else if(kode_sepatu.equals("2")){
	            	harga= 280000;
	            }
	            else if(kode_sepatu.equals("3")){
	                harga = 245000;
	            }
	            else
	            	System.out.println("\nError!\n\n");

	        System.out.print("Masukkan Jumlah Sepatu Yang Di Pesan : ");
	        jumlah = x.nextInt();
	    
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
	        
	        System.out.print("Masukkan Warna Sepatu Yang Di Pesan : ");
	        warna = x.next();
	        
	        System.out.print("Masukkan Ukuran Sepatu Yang Di Pesan : ");
	        ukuran = x.next();
	    	}
		}
	    
	    class transaksi extends pesanan{
	    	public transaksi(){
	    	super();
	        System.out.println("\n===================================================");
	        System.out.println("                    MENU PEMBAYARAN                  ");	
	        System.out.println("===================================================\n");
	        System.out.print("Masukkan No Rekening :  ");
	        norek = x.next();
	        
	        System.out.println("\n\n<<No Rekening Benar>>");
	        System.out.println("<<Pembayaran sukses>>\n");
	        
	        System.out.println("Produk yang anda pesan akan sampai dalam waktu kurang"
	        		+ "lebih 7 hari setelah pembayaran.");
	    	System.out.println("Terima kasih atas kepercayaan anda terhadap produk kami.");
	        System.out.println("Jika barang tak sampai dalam waktu yang telah "
	        		+ "ditentukan silahkan hubungi kami lewat menu informasi.");
	        System.out.println("========================================================================================================");
	        System.out.println("========================================================================================================");
	    	}
	    
	          public void tampil(){
	            System.out.println("=================================================================");
	            System.out.println("                     PEMESANAN SEPATU TOKO ANUGERAH              ");
	            System.out.println("=================================================================");
	            //engkapsulasi
	            System.out.println("Kode Pesanan : "+this.kode_pesanan);
	            System.out.println("Nama Pemesan : "+this.nama_pemesan);
	            System.out.println("Alamat Pemesan : "+this.alamat);
	            System.out.println("No.Telp Pemesan : "+this.tlp);
	            System.out.println("Kode Sepatu Yang Di Pesan "+this.kode_sepatu);
	            System.out.println("Warna : "+this.warna);
	            System.out.println("Ukuran : "+this.ukuran);
	            System.out.println("Harga : "+this.harga);
	            System.out.println("Jumlah Sepatu : "+this.jumlah);
	            System.out.println("Tanggal Pemesanan : "+tanggal_pembelian);
	            System.out.println("Ongkir : "+ongkir);
	            totalharga = ((jumlah*this.harga)+ongkir);
	            System.out.println("Total Harga Pesanan : "+totalharga);
	            System.out.println("No Rekening Pengirim :  "+this.norek);
	            System.out.println("Jumlah Uang Yang Di Bayarkan : By System");
	          
	            System.out.println("\n<<-----LUNAS----->>");
	          
	            System.out.println("=================================================================");
	            System.out.println("                  TERIMAKASIH ATAS PESANAN ANDA                  ");
	            System.out.println("=================================================================");
	          	}
	          }
	    

