/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author ASUS
 */
public class Persegi extends Bentuk{
protected int P,L;

public void setSuperP(int P){
super.P = P;
}
public void setSuperL (int L){
super.L = L;
}
public void setP (int P){
this.P = P;
}
public void setL (int L){
this.L = L;
}
public void getLuas(){
    System.out.println("Luas super: "+(super.L*super.P));
    System.out.println("Luas: "+(this.L*this.P));
    }
}