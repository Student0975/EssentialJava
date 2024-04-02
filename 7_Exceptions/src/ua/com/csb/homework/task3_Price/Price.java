package ua.com.csb.homework.task3_Price;

public class Price {
  String goodName;
  String shopName;
  Double goodPrice;

  public Price(String goodName, String shopName, Double goodPrice) {
    this.goodName = goodName;
    this.shopName = shopName;
    this.goodPrice = goodPrice;
  }

  String getShopName() {
    return shopName;
  }

  @Override
  public String toString() {
    return "Price{" +
        "goodName='" + goodName + '\'' +
        ", shopName='" + shopName + '\'' +
        ", goodPrice=" + goodPrice +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    Price price = (Price) obj;
    return this.shopName.equalsIgnoreCase(price.shopName);
  }
}
