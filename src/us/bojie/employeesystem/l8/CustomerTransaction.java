package us.bojie.employeesystem.l8;

import java.util.Date;
import java.util.List;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> mProducts;
    private Customer mCustomer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        mProducts = products;
        mCustomer = customer;
    }

    // methods for reporting
    @Override
    public String getName() {
        return mCustomer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakDown() {
        StringBuilder sb = new StringBuilder();
        for (Product product : mProducts) {
            sb.append(product.getProductName());
        }
        return sb.toString();
    }

    //
    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared..");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charged the customer");
    }
}
