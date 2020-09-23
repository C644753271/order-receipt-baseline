package org.katas.refactoring;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double price, int quantity) {
        super();
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    double totalAmount() {
        return price * quantity;
    }

    /**
     * 税费计算
     * @return
     */
    public double getSalesTax() {
        return  this.totalAmount() * .10;
    }

    /**
     * 总价格
     * @return
     */
    public double getTotalAmount() {
        return totalAmount() + getSalesTax();
    }

    /**
     * 答应lineItem
     * @param lineItem
     */
    public StringBuilder printLineItemStr(LineItem lineItem) {
        StringBuilder output = new StringBuilder();
        output.append(lineItem.getDescription() + '\t' + lineItem.getPrice() +
                '\t' + lineItem.getQuantity() + '\t' + lineItem.totalAmount() + '\n');
        return output;
    }
}