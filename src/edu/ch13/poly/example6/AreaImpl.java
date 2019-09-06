package edu.ch13.poly.example6;

public abstract class AreaImpl implements Area{

	private String result;
	
	@Override
	public void print() {
		System.out.println(Area.print+result);
	}

	@Override
	public abstract void make();	// -> 다음 자손 클래스에게 넘기기

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult() {
		return result;
	}
}
