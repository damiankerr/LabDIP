/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author dkerr
 */
public class BaggageServiceTipCalculator implements TipCalculator{

    private static final double MIN_BILL_AMT = 0.00;
    private static final double MIN_RATE_AMT = 0.00;
    private static final double MIN_BASE_TIP_AMT = 0.00;
    private static final double MIN_TIP_AMT = 0.00;
    private static final int MIN_BAG_COUNT_AMT = 0;
    private static final int ONE_HUNDRED_PERCENT = 1;
    private static final String BASE_TIP_ERR_MSG = "Error: Base tip must be greater than, or equal to zero!";
    private static final String BAG_COUNT_ERR_MSG = "Error:  Bag count must be greater than, or equal to zero!";
    private static final String RATE_ERR_MSG = "Error: your rate must be greater than zero!";
    private double goodRate;
    private double fairRate;
    private double poorRate;
    private double baseTipPerBag;
    private int bagCount;

    private TipCalculator.ServiceQuality serviceQuality;
    

    public BaggageServiceTipCalculator(ServiceQuality sq, int numOfBags, double baseTipPerBag) {
        this.goodRate = 0.20;
        this.fairRate = 0.15;
        this.poorRate = 0.10;
        this.baseTipPerBag = 0;
        
        setServiceQuality(sq);
        setBagCount(numOfBags);
        setBaseTipPerBag(baseTipPerBag);
    }

    @Override
    public double getTip() {
        double tip = MIN_TIP_AMT;

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (ONE_HUNDRED_PERCENT + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (ONE_HUNDRED_PERCENT + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (ONE_HUNDRED_PERCENT + poorRate);
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

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < MIN_BASE_TIP_AMT) {
            throw new IllegalArgumentException(BASE_TIP_ERR_MSG);
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        if(bagCount < MIN_BAG_COUNT_AMT) {
            throw new IllegalArgumentException(BAG_COUNT_ERR_MSG);
        }
        this.bagCount = bagCount;
    }

    
    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void setServiceQuality(ServiceQuality sq) {
        this.serviceQuality = sq;
    }
}
