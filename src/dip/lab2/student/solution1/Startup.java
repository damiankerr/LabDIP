/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author dkerr
 */
public class Startup {
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    };
    
    public static void main(String[] args) {
      
        Tip service = new FoodServiceTipCalculator(FoodServiceTipCalculator.ServiceQuality.POOR,123);
        System.out.println("The tip for your food bill is: " + service.getTip());
        
        Tip service2 = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.GOOD,4,2);
        System.out.println("The tip for your bellhop is: " + service2.getTip());
    }
}
