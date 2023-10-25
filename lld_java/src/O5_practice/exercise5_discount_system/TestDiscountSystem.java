package O5_practice.exercise5_discount_system;

import java.time.LocalDate;
import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Customer1");
        System.out.println(customer1);
        customer1.setMember(true);
        customer1.setMemberType("gold");
        System.out.println(customer1);

        Visit visit = new Visit(customer1, new Date());
        System.out.println(visit);

        visit.setServiceExpense(10.11);
        visit.setProductExpense(23.45);
        System.out.println(visit);
    }
}
