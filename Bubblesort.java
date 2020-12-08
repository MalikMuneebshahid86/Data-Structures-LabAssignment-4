/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Malik Muneeb Shahid
 */
public class Bubblesort {
static public void bubblesort(int a[]){
    int l=a.length;
    for (int i = 0; i<=l-2; i++) {
        for (int j = 0; j <=l-2; j++) {
          if (a[j]>a[j+1]) {
              int tem=a[j];
              a[j]=a[j+1];
           a[j+1]=tem;
                    print(a);
          System.out.println("");
          System.out.println("---------------------------------------------");}
          print(a);
          System.out.println("");
          System.out.println("---------------------------------------------");
        }
     
    }
    System.out.println("fial sorted array is: ");
    print(a);
    
}
static public void print(int a[])
{
int l=a.length;
    for (int i = 0; i <l; i++) {
        System.out.print(a[i]+"  ");
       
       }

    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={3,4,7,6,1,2,5};
        bubblesort(a);
       
    }
    
}
