/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.githubtest;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Login3 {
    public String FirstandLastName(){
         Scanner sc= new Scanner(System.in);
     String userFirstname=sc.next();
     System.out.println("Please enter last name");
       String userLastName=sc.next();
       
     return userFirstname+" "+userLastName;   
    }  
public boolean CheckUserName(){
     Scanner sc= new Scanner(System.in);
      String username=sc.next();
          boolean isright = false;
  
if(username.contains("_")) {
  
    isright = true;
} 
else {
    return isright;
}
return isright;
     }
     public boolean CheckPasswordComplexity(){
          Scanner sc= new Scanner(System.in);
          String Password =sc.next();
         boolean checked = false;
       
         if (Password.length()>8 && Password.matches(".*[A-Z].*")
            && Password.matches(".*[0-9].*") &&  Password.contains("@"  )||
         Password.contains("#")|| Password.contains("$")|| Password.contains("!")
        || Password.contains("%")|| Password.contains("&")|| Password.contains("*")|| Password.contains("+")
        || Password.contains("~")
        || Password.contains("_")){
             checked = true;
         }
     return checked; 
     
     }
     public void registerUser(){
         
         
         
         if(CheckUserName()){
         System.out.println("Username successfully captured");
         System.out.println("Please enter password :");
         
         if(CheckPasswordComplexity()){
         System.out.println("Password succesfully captured");
         
        
        }
         else {
              System.out.println("Password is not correctly formatted,please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
               System.out.println("Please try again");
         }
        }
         else {
              System.out.println("“Username is not correctly formatted,please ensure that your username contains an underscore and is nomore than 5characters in length");
         }
         
          
                
     }
     public boolean loginUser(){
       boolean checked = false;
      String Username;
       String Passowrd;
        
         if(CheckUserName()&&CheckPasswordComplexity()){
         System.out.println("“Welcome" +  FirstandLastName() + "it is great tosee you again");
        }
         else{
             System.out.println("Username orpassword incorrect,please try again”");
         }
       
      
         return checked;
          }

    
         
        
     
      public void returnLoginStatus(){
        if (loginUser()){
            System.out.println("A Successful Login");
            }
        else{
             System.out.println("A Failed Login");
        } 
      }
    
}
