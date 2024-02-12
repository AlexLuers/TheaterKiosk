/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package theaterkiosk;

/**
 *
 * @author Administrator
 */
public class TheaterKiosk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        //declaring the variable
        int age;
        //asking for thier age
        System.out.println("What is your age?");
        age = in.nextInt();
        //outputs
        if ((age) >= 21)
        {
            System.out.println("You get a wristband!");
        }
            
    }
    
}
