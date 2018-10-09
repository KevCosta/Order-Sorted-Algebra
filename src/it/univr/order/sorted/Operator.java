package it.univr.order.sorted;

public class Operator<T> extends Simbol<String>{
	
	public Operator(){
		super();
	}
	
	public Operator(String operator){
		super(operator);
	}
	
	public String getClassOperator(){
		return  Operator.class.getSimpleName();
	}
	
	public String toString(){
		return "" + super.getObject() + " " + getClassOperator() ;
		
	}

}
