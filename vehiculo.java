public class Vehiculo {
	private String color;
	private int puertas;
	private int asientos;

	public Vehiculo (String color, int puertas, int asientos) {
		//Cada alumno deberá crear este constructor

		this.color=color;
		this.puertas=puertas;
		this.asientos=asientos;


	
		
		
	}
	
	public Vehiculo () {
		
	}
	 
	public setPuertas(int puertas){
		this.puertas=puertas;
		
		
	}
	
	public String getColor(){
		return this.color;
	}
	public int getPuertas(){
		return this.puertas;
	}
	public int getAsientos(){
		return this.asientos;
	}


	
	public void String setColor(String color){
		this.color=color;	

	}

	public void setAsientos(int asientos) {
        this.asientos = asientos;

}

