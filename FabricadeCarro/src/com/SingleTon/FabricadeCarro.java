package com.SingleTon;
public class FabricadeCarro {
	private static FabricadeCarro instancia;
	
	private FabricadeCarro(){
		
	}
	public static synchronized FabricadeCarro getInstancia(){
		if(instancia == null){
			instancia = new FabricadeCarro();
		}
		
		return instancia;
	} 
}
