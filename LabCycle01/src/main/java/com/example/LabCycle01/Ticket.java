package com.example.LabCycle01;

public class Ticket {
	int ticno,price,seatno;
	String ticktype;
	public int getTicno() {
		return ticno;
	}
	public void setTicno(int ticno) {
		this.ticno = ticno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public String getTicktype() {
		return ticktype;
	}
	public void setTicktype(String ticktype) {
		this.ticktype = ticktype;
	}
	@Override
	public String toString() {
		return "Ticket [ticno=" + ticno + ", price=" + price + ", seatno=" + seatno + ", ticktype=" + ticktype + "]";
	}
}
