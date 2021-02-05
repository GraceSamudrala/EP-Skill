package com.klu.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;
public class StudentMain {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	 StudentInsertion si = new StudentInsertion();
    	 StudentBean sb= new StudentBean();
    	Scanner sc= new Scanner(System.in);
    	int ch;
    	int id;
    	String email;
    	ch = sc.nextInt();
    	 sb.setRegno(101);
    	 sb.setName("grace");
    	 sb.setEmail("grace@gmail.com");
    	 StudentBean sb1=new StudentBean();
    	 sb1.setRegno(102);
    	 sb1.setName("teena");
    	 sb1.setEmail("teena@gmail.com");
    	 StudentBean sb2=new StudentBean();
    	 sb2.setRegno(103);
    	 sb2.setName("vineetha");
    	 sb2.setEmail("vineetha@gmail.com");
    	 switch(ch) {
    	 case 1:
    		
        	 int i=si.StudentInsert(sb);
        	 if(i>0)
        	 {
        		 System.out.println("Insertion is successful");
        	 }
        	 else
        	 {
        		 System.out.println("fail");
        	 }
    	 
    	
    	 
    	 case 2:
    		 
    	 
    		 System.out.println("enter the regno to be deleted:");
    		 id=sc.nextInt();
    		 si.StudentDelete(sb,id);
    	 
         
         
    	 case 3:
    		
 
    		 System.out.println("The table is :");
    		 si.StudentDisplay(sb);
    	  
    	 
    	 case 4:
    		 
    		 
    		 System.out.println("Enter regno");
    		 id=sc.nextInt();
    		 System.out.println("enter updated email");
    		 email=sc.next();
    		 si.StudentUpdate(sb,id,email);
     }
     }
}


 
    	