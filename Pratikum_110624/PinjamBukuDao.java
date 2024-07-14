/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_110624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Afdila Sandi
 */
public class PinjamBukuDao {
    private List<PinjamBuku> data = new ArrayList();
    
     public PinjamBukuDao(){
        data.add(new PinjamBuku("A123", "B001", "11-April-2024", "7-Juli-2024", 0, 0));
        data.add(new PinjamBuku("A124", "B002", "11-April-2024", "7-Juli-2024", 5, 35000));      
    }
     
     public void insert(PinjamBuku pinjambuku){
        data.add(pinjambuku);
    }
    
    public void update(int index, PinjamBuku pinjambuku){
        data.set(index, pinjambuku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public PinjamBuku getPinjam(int index){
        return data.get(index);
    }
    
    public List<PinjamBuku> getAll(){
        return data;
    }
    
}

