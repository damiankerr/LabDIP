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
        
        TipService ts = new TipService();
      
        Tip service = new FoodServiceTipCalculator(FoodServiceTipCalculator.ServiceQuality.POOR,123);
        System.out.println("The tip for your food bill is: " + ts.getTipForService(service));
        
        Tip service2 = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.GOOD,4,2);
        System.out.println("The tip for your bellhop is: " + ts.getTipForService(service2));
    }
}
