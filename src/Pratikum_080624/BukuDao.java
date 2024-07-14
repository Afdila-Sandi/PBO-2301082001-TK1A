/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  Pratikum_080624;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Afdila Sandi
 */
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku("B001","Kancil Yang Cerdik","Yudhistira","Pustaka Agung",2012));
        data.add(new Buku("B002","Sangkuriang","Lilis","Bhuana Populer",2020));
    }
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
       
}
