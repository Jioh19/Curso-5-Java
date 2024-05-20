package model;

public class Product {
	private String productCode;
	private String productName;
	private String productLine;
	private String productDescription;
	private double buyPrice;
	private double msrp;
	
	public Product(String productCode, String productName, String productLine, String productDescription,
			double buyPrice, double msrp) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.productDescription = productDescription;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMsrp() {
		return msrp;
	}

	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productLine=" + productLine
				+ ", productDescription=" + productDescription + ", buyPrice=" + buyPrice + ", msrp=" + msrp + "]";
	}
	
	
}
