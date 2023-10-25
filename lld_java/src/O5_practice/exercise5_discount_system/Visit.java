package O5_practice.exercise5_discount_system;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double expense) {
        serviceExpense = expense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double expense) {
        productExpense = expense;
    }

    public double getTotalExpense() {
        if(customer.isMember()) {
            DiscountRate discountRate = new DiscountRate();
            double serviceDiscountRate = discountRate.getServiceDiscountRate(customer.getMemberType());
            double productDiscountRate = discountRate.getProductDiscountRate(customer.getMemberType());
            return (serviceExpense - (serviceExpense * serviceDiscountRate)) + (productExpense - (productExpense * productDiscountRate));
        }
        return serviceExpense + productExpense;
    }

    public String toString() {
        return "Visit: customer: " + customer.getName() + ", date: " + date + ", serviceExpense: " + serviceExpense
                + ", productExpense: " + productExpense + ", totalExpense: " + getTotalExpense();
    }
}
