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
        Login3 login = new Login3();
        
         System.out.println("Please enter your name :");
        login.FirstandLastName();
    
          System.out.println("Please create username :");
         login.registerUser();
         
           System.out.println("Please enter your login details.");
          System.out.println("Username :");
         
          login.returnLoginStatus();
       
        
}
  
}
