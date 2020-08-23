package com.example.demo;
import java.util.Date;

public class Stock {
    
    private int stockNumber;
    private String stockName;
    private int purchasingPrice;
    private Date purchasedDate;
    private int quantity;
    
    // Getter
  public int getStockNumber() {
    return stockNumber;
  }
  public String getStockName() {
    return stockName;
  }
  public int getPurchasingPrice() {
    return purchasingPrice;
  }
  public Date getPurchasingDate() {
    return purchasedDate;
  }
  public int getQuantity() {
    return quantity;
  }

  // Setter
  public void setStockName(String stockName) {
    this.stockName = stockName;
  }
  public void setPurchasingPrice(String purchasingPrice) {
    this.purchasingPrice = purchasingPrice;
  }
  public void setPurchasedDate(Date purchasedDate) {
    this.purchasedDate = purchasedDate;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
