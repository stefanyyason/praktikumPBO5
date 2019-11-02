/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author ASUS
 */
import java.io.*;
public class lingkaran {
private double radius;
public lingkaran(double radius){
    this.radius=radius;
}
public void Luas(){
    double luas= 3.14*radius*radius;
    System.out.println("Luas Lingkaran: "+luas);
}
public void Keliling(){
    double keliling= 2.0*3.14*radius;
    System.out.println("Keliling Lingkaran: "+keliling);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        DataInputStream dis= new DataInputStream(System.in);
        System.out.print("input radius: ");
        String input= dis.readLine();
        double i= Double.parseDouble(input);
        lingkaran A=new lingkaran(i);
        A.Luas();
        A.Keliling();
    }
}
