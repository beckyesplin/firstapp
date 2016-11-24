
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
public class FirstAppProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Test firstDay = new Test(Day.Monday);
        firstDay.tellItLikeItIs();
        Test thirdDay = new Test(Day.Wednesday);
        thirdDay.tellItLikeItIs();
        Test fifthDay = new Test(Day.Friday);
        fifthDay.tellItLikeItIs();
        Test sixthDay = new Test(Day.Saturday);
        sixthDay.tellItLikeItIs();
        Test seventhDay = new Test(Day.Sunday);
        seventhDay.tellItLikeItIs();
   
    }
    
}
