package entities;

public class Product {
	private String product;
	private Double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String product, Double price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Double totalPrice() {
		return price * quantity;
	}
}
