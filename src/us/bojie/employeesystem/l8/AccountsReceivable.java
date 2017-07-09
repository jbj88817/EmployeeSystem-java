package us.bojie.employeesystem.l8;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class AccountsReceivable {
    private Accounting mAccounting;

    public AccountsReceivable(Accounting accounting) {
        mAccounting = accounting;
    }

    public void postPayment() {
        mAccounting.chargeCustomer();
    }

    public void sendInvoice() {
        mAccounting.prepareInvoice();
    }
}
