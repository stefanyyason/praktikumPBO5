/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author ASUS
 */
public class inheritancetest {
    public static void main(String [] args){
        A ortu = new A();
        B anak = new B();
            System.out.println("superclass");
    ortu.setX(10);
    ortu.setY(20); 
    ortu.getNilai();
    System.out.println("sub class");
    anak.setX(5);
    anak.setY(4);
    anak.getNilai();
    anak.setZ(50);
    anak.getJumlah();
}    
}