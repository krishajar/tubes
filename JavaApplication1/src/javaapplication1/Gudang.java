/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

public class Gudang {
    private String nama;
    private int id;
    public Gudang(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    private List<Barang> g = new ArrayList<>();
	
    public void addBarang(Barang i){
	g.add(i);   
    }
	
    public Barang getBarangGudang(int i)
    {
        Object[] array = g.toArray();
        return (Barang) array[i];
    } 
	
    public void showAllBarangGudang(){
	System.out.println("===Daftar Barang di Gudang===");
        for (Barang obj : g)
        {           
            System.out.println("ID : "+obj.getId());
            System.out.println("Name : "+obj.getNama());
            System.out.println("Jumlah : "+obj.getJml_barang());
            System.out.println("====================================");
        }
    }	
    public void removeBarang (int i){
        g.remove(i);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}