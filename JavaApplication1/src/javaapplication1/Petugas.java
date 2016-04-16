/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

public class Petugas{
    private String nama;
    private int id;
    //private List<Gudang> gud = new ArrayList<>();
	
    public Petugas(int id, String nama){
	this.id=id;
	this.nama=nama;
    }	        
        
    public String getNama(){
	return nama;
    }	
    public void setNama(String nama){
	this.nama = nama;
    }
    public int getId(){
    	return id;
    }
    public void setId(int id){
    	this.id = id;
    }
    /*public void addGudang(Gudang i){
        gud.add(i);
    }
    public Gudang getGudang(int i){
        Gudang x = null;
            int size = gud.size();
            for (int j=0; j<size; j++)
            {
                if (i==gud.get(j).getId()){
                    x = gud.get(j);
                }            
            }
            return x;
    }*/
}