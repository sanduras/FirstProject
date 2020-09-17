package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] piese={"Rege","Dama","Cal","Nebun","Turn","Pion"};
	    for(String i:piese){
            System.out.println(i);
	    }
        System.out.println("------------------------");
	    int a=10;
	    double b=10.3D;
	    a=(int)b;
        System.out.println(a);
        System.out.println("------------------------");
        try {
            int[] numere={1,3,5,7,9};
            for(int i:numere){
                if(i%2==0){
                     System.out.println(i);
                 }
            }
        }
        catch (Exception e){
            System.out.println("Nu avem numere pare in array");
        }
        finally {
            System.out.println("Verificarea s-a sfirsit cu succes");
        }
        System.out.println("------------------------");
        int c=10;
        int d=20;
        int sum=sumnr(c,d);
        System.out.println("Suma este " +sum);
    }
    public static int sumnr(int a , int b){
        return a+b;
    }


}
