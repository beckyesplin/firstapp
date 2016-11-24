/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstappproject;

/**
 *
 * @author 1404610
 */
public class Test {
    
    Day day;

    public Test(Day day){
         this.day = day;
       
    }
  
     public void tellItLikeItIs() {
        switch (day){
            case Monday:
                System.out.println("Mondays are bad.");
                break;
                    
            case Friday:
                System.out.println("Fridays are better.");
                break;
                         
            case Saturday: case Sunday:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
     } 
    
}  
    
    

