package it.univr.order.sorted;



public class Simbol <T> {
	private T object;
	
	public Simbol() {
	}
	
	public Simbol(T object){
		this.object = object;
	}
	
	

	public void setObject(T object){
		this.object = object;
	}
	
	public T getObject(){
		return this.object;
	}
	
	public String toString(){
		return "" + object + " " + object.getClass().getSimpleName();
		
	}

}
