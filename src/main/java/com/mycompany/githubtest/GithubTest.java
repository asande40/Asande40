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
        
        //Declaration of scanner and class
        Scanner sc= new Scanner(System.in);
        Login3 login = new Login3();
        
        //Prompt user for name
         System.out.println("Please enter your name below :");
        String name=sc.next();
        
        //Prompt user for lastname
         System.out.println("Please enter your lastname below :");
        String lastname=sc.next();
        
        //Prompt user to create username 
       System.out.println("Please create your username below :");
       String username=sc.next();
        login.CheckUserName(username);
        
        //Prompt user to create password
        System.out.println("Please create your  password below :");
        String password=sc.next();
        login.CheckPasswordComplexity(password);
        login.registerUser(username, password);
       
       System.out.println("Please Login below");
       System.out.println("Username :");
       String LoginUsername=sc.next();
       System.out.println("Password :");
       String LoginUserPassword=sc.next();
       
       login.returnLoginStatus(LoginUsername, LoginUserPassword, password, username);
}
  
}
