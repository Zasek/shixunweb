package entity;

public class GoodsInCart extends Goods{
	private int number;
	private float sumPrice;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(float sumPrice) {
		this.sumPrice = sumPrice;
	}
}
