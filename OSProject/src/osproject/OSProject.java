/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

/**
 *
 * @author Ali Abdulhady
 */
import java.util.Scanner;
public class OSProject {

    /**
     * @param pname
     * @return 
     */
     
//    public static String[] pname (String pname[]){
//        return pname;
//    }
//    public static int [] arrival(int atime[]){
//        return atime;
//    }
//    public static int[] waiting(int wtime[]){
//        return wtime;
//    }
//    public static int [] compilation(int ctime[]){
//        return ctime;
//    }
//    public static float avgwtime(float awt){
//        return awt;
//    }
//    public static float avgctime(float act){
//        return act;
//    }
  
    public static void main(String[] args) {
        // TODO code application logic here
         // name of the process 
        RRC rr=new RRC();
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter your TimeSlice");
        int q=scan.nextInt();
        System.out.println("Enter the Number of Process");
        int numofprocess=scan.nextInt();
        scan.nextLine();
        if(numofprocess>=0){
            String name[] =new String[numofprocess];
            int arrivaltime[] = new int[numofprocess];
            int bursttime[] = new int[numofprocess];
            System.out.println("Enter Process Name");
            for(int i=0;i<name.length;i++){ 
                name[i]=scan.nextLine();
            }
            for(int i=0;i<numofprocess;i++){
                System.out.println("Enter the arrival time of process "+name[i]);
                arrivaltime[i]=scan.nextInt();
            }
            for(int i=0;i<numofprocess;i++)
                {
                    System.out.println("Enter the burst time of process "+name[i]);
                    bursttime[i]=scan.nextInt();
                }
        rr.roundRobin(name, arrivaltime, bursttime, q);
        
        }   
    }
    
}
