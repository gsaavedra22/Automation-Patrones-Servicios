package com.sophossolutions.models;

public class DataCheckout {

	String sauceCard;
	String subtotal;
	String tax;
	String Total;
	public DataCheckout(String sauceCard, String subtotal, String tax, String total) {
		super();
		this.sauceCard = sauceCard;
		this.subtotal = subtotal;
		this.tax = tax;
		this.Total = total;
	}
	public String getSauceCard() {
		return sauceCard;
	}
	public void setSauceCard(String sauceCard) {
		this.sauceCard = sauceCard;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	
	@Override
	public String toString() {
		return "DataCheckout [sauceCard=" + sauceCard + ", subtotal=" + subtotal + ", tax=" + tax
				+ ", Total=" + Total + "]";
	}
	
}
