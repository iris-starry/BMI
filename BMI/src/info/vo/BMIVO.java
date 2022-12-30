package info.vo;

public class BMIVO {
	private double weight;
	private double height;
	private double bmi;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi() {
		this.bmi = weight / Math.pow(height/100, 2);
	}
	
	
}