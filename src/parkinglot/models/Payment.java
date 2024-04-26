package parkinglot.models;

import java.util.Date;

public class Payment {
    int Amount;

    PaymentModes paymentMode;

    String refId;

    Bill bill;

    PaymentStatus paymentStatus;

    Date paidAt;

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public PaymentModes getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentModes paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }
}
