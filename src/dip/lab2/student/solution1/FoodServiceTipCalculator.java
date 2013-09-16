/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author dkerr
 */
public class FoodServiceTipCalculator implements Tip {
    
    private static final double MIN_RATE_AMT = 0.00;
    private static final double MIN_BILL_AMT = 0.00;
    private static final double MIN_TIP_AMT = 0.00;
    private static final String RATE_ERR_MSG = "Error: your rate must be greater than zero!";
    private static final String BILL_ERR_MSG = "Error: your bill amount must be greater than zero!";
    private double goodRate;
    private double fairRate;
    private double poorRate;
    private double bill;
    
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;
    
    public FoodServiceTipCalculator(ServiceQuality sq, double billAmt) {
        this.goodRate = 0.20;
        this.fairRate = 0.15;
        this.poorRate = 0.10;
        setServiceQuality(sq);
        setBill(billAmt);
    }
    
    @Override
    public double getTip() {
        double tip = MIN_TIP_AMT;
        
        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }
        
        return tip;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        if(goodRate <= MIN_RATE_AMT) {
            throw new IllegalArgumentException(RATE_ERR_MSG);
        }
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        if(fairRate <= MIN_RATE_AMT) {
            throw new IllegalArgumentException(RATE_ERR_MSG);
        }
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        if(poorRate <= MIN_RATE_AMT) {
            throw new IllegalArgumentException(RATE_ERR_MSG);
        }
        this.poorRate = poorRate;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        if(bill < MIN_BILL_AMT) {
            throw new IllegalArgumentException(BILL_ERR_MSG);
        }
        this.bill = bill;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final void setServiceQuality(ServiceQuality sq) {
        this.serviceQuality = sq;
    }
    
    
}
