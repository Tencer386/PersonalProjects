/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namepicker;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dumph
 */
public class NamePicker
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String[] buyingNames = { "Maree", "Stephanie", "Mum", "Cheryl", "Brent", "Alyssa", "Lorae", "Samantha", "Michelle", "Yyvonne" };
        String[] recievingNames = { "Maree", "Stephanie", "Mum", "Cheryl", "Brent", "Alyssa", "Lorae", "Samantha", "Michelle", "Yyvonne" };
        
        String buyer;
        String reciever;
        
        System.out.println("Match a buyer and reciever? Press enter to continue. ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        
        Random rand = new Random();
        int n;
        int m;
        
        for (int i = buyingNames.length; i > 0;)
        {
            n = rand.nextInt(buyingNames.length - 1);
            buyer = buyingNames[n];
            
            m = rand.nextInt(recievingNames.length - 1);
            reciever = recievingNames[m];
            
            if (buyer == reciever) 
            {
                System.out.println("Same name chosen, Choosing again. ");
                scanner.nextLine();
            }
            else 
            {
                System.out.println(buyer + " is buying for " + reciever + "\n Press Enter for next pair");
                scanner.nextLine();
            }
            
        }
        
    }
    
}
