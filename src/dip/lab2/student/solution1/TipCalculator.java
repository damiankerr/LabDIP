/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;





/**
 *
 * @author dkerr
 */
public interface TipCalculator {
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    };
    
    public abstract double getTip();
    
    public abstract ServiceQuality getServiceQuality();
    
    public abstract void setServiceQuality(ServiceQuality sq);
       
}
