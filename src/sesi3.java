/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import java.util.ArrayList;
import java.util.List;
public class sesi3 {
   private List<Integer> ArrayList = new ArrayList<>();
   private List<Integer> Genap = new ArrayList<>();
   private List<Integer> Ganjil = new ArrayList<>();
   public sesi3(int[] num){
   for(int n : num)
       ArrayList.add(n);
   }
   public void cek(){
       for(int n : ArrayList){
           if(n % 2 == 0){
               Genap.add(n);
               //System.out.println(n + " Genap");
           }else
               Ganjil.add(n);
               //System.out.println(n+ " Ganjil");
       }
}
   public void Print(){
       System.out.print("Ganjil = ");
       for(int n : Ganjil){
           
           System.out.print(" " + n);
       }
       System.out.println();
       System.out.print("Genap = ");
       for(int n : Genap){
           System.out.print(" " + n);
       }
   }
}
