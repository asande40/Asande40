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

    private String firstname, lastname, Username, Password;
    
  
    
    
public boolean CheckUserName(String username){
    //returns true if username contains following requirements
    return (username.contains("_") && username.length()<=5);   
     }



     public boolean CheckPasswordComplexity(String Password){
         //Declaration of boolean
         boolean checked = false;
       
         //This condition returns true if following conditions are met 
         if (Password.length()>8 && Password.matches(".*[A-Z].*")
            && Password.matches(".*[0-9].*") &&  Password.contains("@"  )||
         Password.contains("#")|| Password.contains("$")|| Password.contains("!")
        || Password.contains("%")|| Password.contains("&")|| Password.contains("*")|| Password.contains("+")
        || Password.contains("~")
        || Password.contains("_")){
             checked = true;
             
         }
         
         //Returns boolean  true or false
     return checked; 
     
     }
     public String registerUser(String username,String Password){
         
      String message="";
         
         //C 
         if(CheckUserName(username)){
           System.out.println("                       ");
         System.out.println("Username captured");
         
         
         if(CheckPasswordComplexity(Password)){
       System.out.println("Password captured");
        System.out.println("User is registered successfully");
        System.out.println("                       ");
       
        }
        }
         else {
         System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length");
         System.out.println("OR");
         System.out.println("The password contains at least 8 characters, a capital letter, a number and a special character.");
         
         } return username+" "+Password;
     } 
     
     
     
     public boolean loginUser(String createUsername,String createPassword, String password ,String name){
       
     return createPassword.equals(password) && createUsername.equals(name);
     }
         
        
     
      public String returnLoginStatus(String UserInputUser,String UserInputPass, String password ,String name){
          
          String success=" ";
          
          //Decision for message return
        if (!UserInputUser.matches(name)
           && UserInputPass.matches(password)){
            success="A Failed Login";
             System.out.println(success);
             System.out.println("Please try ");
        }
        else{ success="A Successful Login";
            System.out.println(success);
            System.out.println("Welcome"+" "+name+" "+"it is great to see you again");
           
           }
        return success;
      }
}
