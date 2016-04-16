/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

public class Aplikasi {
        private List<Penyedia> daftarPenyedia = new ArrayList<>();
        private List<Petugas> daftarPetugas = new ArrayList<>();
        private List<Gudang> daftarGudang = new ArrayList<>();
	private int i;
        Scanner input = new Scanner(System.in); 
	
	public void addPenyedia(Penyedia i){
		daftarPenyedia.add(i);
	}	
	public void addPetugas(Petugas i){
		daftarPetugas.add(i);
	}	       
        public void addGudang(Gudang i){
                daftarGudang.add(i);
        }
	public Penyedia getPenyedia(int i){
            Penyedia x = null;
            int size = daftarPenyedia.size();
            for (int j=0; j<size; j++)
            {
                if (i==daftarPenyedia.get(j).getId()){
                    x = daftarPenyedia.get(j);
                }            
            }
            return x;
	}
	public Petugas getPetugas(int i){
            Petugas x = null;
            int size = daftarPetugas.size();
            for (int j=0; j<size; j++)
            {
                if (i==daftarPetugas.get(j).getId()){
                    x = daftarPetugas.get(j);
                }            
            }
            return x;
	}
	public Gudang getGudang(int i){
            Gudang x = null;
            int size = daftarGudang.size();
            for (int j=0; j<size; j++)
            {
                if (i==daftarGudang.get(j).getId()){
                    x = daftarGudang.get(j);
                }            
            }
            return x;
	}         
	public void removePenyedia (int i){
            Penyedia x = null;
            int size = daftarPenyedia.size();
            for (int j=0; j<size; j++)
            {
                if (i==daftarPenyedia.get(j).getId()){
                    x = daftarPenyedia.get(j);
                }            
            }
            daftarPenyedia.remove(x);
	}
	public void removePetugas (int i){
            Petugas x = null;
            int size = daftarPetugas.size();
            for (int j=0; j<size; j++)
            {
                if (i==daftarPetugas.get(j).getId()){
                    x = daftarPetugas.get(j);
                }            
            }
            daftarPetugas.remove(x);
	}
	public void removeGudang (int i){
            Gudang x = null;
            int size = daftarGudang.size();
            for (int j=0; j<size; j++)
            {
                if (i==daftarGudang.get(j).getId()){
                    x = daftarGudang.get(j);
                }            
            }
            daftarGudang.remove(x);
	}
        public void showAllPenyedia(){
            int i = 0;
            for (Penyedia obj : daftarPenyedia)
            {           
                System.out.println("ID : "+obj.getId());
                System.out.println("Nama : "+obj.getNama());
                System.out.println("====================================");
                i++;
            }
        }
        public void showAllPetugas(){
            int i = 0;
            for (Petugas obj : daftarPetugas)
            {           
                System.out.println("ID : "+obj.getId());
                System.out.println("Nama : "+obj.getNama());
                System.out.println("====================================");
                i++;
            }
        }
        public void showAllGudang(){
            int i = 0;
            for (Gudang obj : daftarGudang)
            {           
                System.out.println("ID : "+obj.getId());
                System.out.println("Nama : "+obj.getNama());
                System.out.println("====================================");
                i++;
            }
        }
        public void showAllBarang(){
            int i = 0;
            for (Penyedia obj1 : daftarPenyedia){
                System.out.println("Barang dari Penyedia Indeks "+i);
                obj1.showAllBarang();
                i++;
            }
        }
	public void mainMenu(int pilihan){
		switch(pilihan){
			case 1 :
                            try
                            {
				System.out.println("-------------------");
                                System.out.println("Tambah Penyedia");
				System.out.print("Input ID : ");
                                int x1 = input.nextInt();
                                System.out.print("Input Nama : ");
                                String y1 = input.next();
                                addPenyedia(new Penyedia(x1,y1));
                                System.out.println("Berhasil");
                                break;
                            } catch (Exception e){
                                System.out.println("Salah Input Masss");
                            }
                            
                        case 2 :
                                System.out.println("-------------------");
                                System.out.println("Data Penyedia");
                                showAllPenyedia();
                                break;
                        case 3 :
                                System.out.println("-------------------");
                                System.out.println("Hapus Penyedia");
                                System.out.print("Input ID Penyedia : ");
                                int x2 = input.nextInt();
                                removePenyedia(x2);
                                System.out.println("Berhasil");
                                break;
                        case 4 :
                                System.out.println("-------------------");
                                System.out.println("Tambah Barang");
                                System.out.print("Input ID Penyedia : ");
                                int x3 = input.nextInt();
                                //getPenyedia(x3);
                                System.out.println("ID : "+getPenyedia(x3).getId());
                                System.out.println("Nama : "+getPenyedia(x3).getNama());
                                System.out.print("Masukan ID Barang : ");
                                int y3 = input.nextInt();
                                System.out.print("Masukan Nama Barang : ");
                                String z3 = input.next();
                                System.out.print("Masukan Jumlah Barang : ");
                                int u3 = input.nextInt();
                                getPenyedia(x3).createBarang(new Barang(y3,z3,u3));
                                System.out.println("Berhasil");
                                break;
                        case 5 :
                                System.out.println("-------------------");                            
                                showAllBarang();
                                break;        
                        case 6 :
                                System.out.println("-------------------");
				System.out.println("Tambah Petugas");
				System.out.print("Input ID : ");
                                int x6 = input.nextInt();
                                System.out.print("Input Nama : ");
                                String y6 = input.next();
				addPetugas(new Petugas(x6,y6));
                                System.out.println("Berhasil");
                                break;
                        case 7 :
                                System.out.println("-------------------");
                                System.out.println("Data Petugas");
                                showAllPetugas();
                                break;
                        case 8 :
                                System.out.println("-------------------");
                                System.out.println("Hapus Petugas");
                                System.out.print("Input ID Petugas : ");
                                int x5 = input.nextInt();
                                removePetugas(x5);
                                System.out.println("Berhasil");
                                break;
                        case 9 :
                                System.out.println("-------------------");
				System.out.println("Tambah Gudang");                              
				System.out.print("Input ID Gudang : ");
                                int y9 = input.nextInt();
                                System.out.print("Input Nama Gudang : ");
                                String z9 = input.next();
                                addGudang(new Gudang(y9,z9));
                                System.out.println("Berhasil");
                                break;                                
                        case 10 :
                                System.out.println("-------------------");
                                System.out.println("Data Gudang");
                                showAllGudang();
                                break;                                
                        case 11 :
                                System.out.println("-------------------");
                                System.out.println("Tambah Barang ke Gudang");
                                //System.out.print("Input ID Petugas : ");
                                //int q11 = input.nextInt();
                                //System.out.println("ID : "+getPetugas(q11).getId());
                                //System.out.println("Nama : "+getPetugas(q11).getNama());
                                System.out.print("Input ID Gudang : ");
                                int x11 = input.nextInt();
                                System.out.println("ID : "+getGudang(x11).getId());
                                System.out.println("Nama : "+getGudang(x11).getNama());
                                System.out.print("Input ID Penyedia : ");
                                int s11 = input.nextInt();
                                getPenyedia(s11).showAllBarang();
                                System.out.print("Input ID Barang : ");
                                int t11 = input.nextInt();                                
                                getGudang(x11).addBarang(new Barang(getPenyedia(s11).getBarang(t11).getId(),getPenyedia(s11).getBarang(t11).getNama(),getPenyedia(s11).getBarang(t11).getJml_barang()));
                                getPenyedia(s11).removeBarang(t11);
                                System.out.println("Berhasil dipindahkan ke gudang");                                
                                break;
                        case 12 :
                                System.out.println("-------------------");
                                System.out.print("Input ID Gudang : ");
                                int x10 = input.nextInt();                             
                                getGudang(x10).showAllBarangGudang();
                                break;
                        case 0:
                                System.out.println("-------------------");
                                System.out.println("Exited");
                                break;
                        default :
                            System.out.println("-------------------");
                                System.out.println("Pilihan tidak ada");
                                break;
                }
        }
}