/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.githubtest;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class GithubTest {

    public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
       System.out.println("Please enter username :"); 
          ContainsandLength();
           System.out.println("Please enter password :"); 
          ContainsandLengthofPassword();

          
    }
       public static void ContainsandLength(){
        Scanner sc= new Scanner(System.in);
        String username = sc.next();
       
if(username.contains("_") || username.length()>6){
    System.out.println("Username successfully captured ");
}else{
     System.out.println("Username is not correctly formatted");
}   
} 
    public static void ContainsandLengthofPassword(){
        Scanner sc= new Scanner(System.in);
        String password = sc.next();
        
        if (password.length()>8 || password.matches(".*[A-Z].*")&&
            password.length()>8 && password.matches(".*[0-9].*")&&
            password.contains("@"  )||
         password.contains("#")|| password.contains("$")|| password.contains("!")
        || password.contains("%")|| password.contains("&")|| password.contains("*")|| password.contains("+")
        || password.contains("~")
        || password.contains("_")){
   System.out.println("Password Successfully Captured"); 
    }
    else {
    System.out.println("Password is not correctly formatted");
}
        }
 }
 


