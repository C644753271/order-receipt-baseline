package org.katas.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String customerAddress;
    List<LineItem> lineItems;

    double totalSalesTax = 0d;
    double totalAmount = 0d;

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double getTotalSalesTax() {
        return  totalSalesTax;
    }

    public double getTotalAmount() {
        return  totalAmount;
    }

    /**
     * 打印订单信息
     */
    public StringBuilder printOrderInfo() {
        StringBuilder output = new StringBuilder();
        output.append(customerName);
        output.append(customerAddress);
        for (LineItem lineItem : lineItems) {
            totalSalesTax += lineItem.getSalesTax();
            totalAmount += lineItem.getTotalAmount();
            output.append(lineItem.printLineItemStr(lineItem));
        }
        return output;
    }
}
