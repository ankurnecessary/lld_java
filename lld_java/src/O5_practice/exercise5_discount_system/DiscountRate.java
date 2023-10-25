package O5_practice.exercise5_discount_system;

public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;
    private double serviceDiscountSilver = 0.1;
    private double productDiscountPremium = 0.1;
    private double productDiscountGold = 0.1;
    private double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type) {
        if(type.equals("gold")) return serviceDiscountGold;
        if(type.equals("premium")) return serviceDiscountPremium;
        return serviceDiscountSilver;
    }

    public double getProductDiscountRate(String type) {
        if(type.equals("gold")) return productDiscountGold;
        if(type.equals("premium")) return productDiscountPremium;
        return productDiscountSilver;
    }
}
