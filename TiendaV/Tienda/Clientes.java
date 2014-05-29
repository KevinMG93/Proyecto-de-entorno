package Tienda;

public class Clientes {
	
	
	private String Nombre;
	private String Apellidos;
	private int Edad;
	private int DNI;
	private String CorreoElectronico;
	
	
	public cliente () {
		
	//Para una posible clase por defecto
		
		Nombre="";
		Apellidos="";
		Edad=;
		DNI=;
		CorreoElectronico="";	
		
	}
	
	public cliente (String Nom,String Ape,int Ed,int DN,String CE) {
		
	// Inicializamos
		
		Nombre=Nom;
		Apellidos=Ape;
		Edad=Ed;
		DNI=DN;
		CorreoElectronico=CE;
		
	}
	
	//Metodos
	
	public void setNombre (String Nom){
	Nombre=Nom;
	}
	
	public String getNombre (){
		return Nombre;
	}
	
	public void setApellidos (String Ape){
		Apellidos=Ape;
	}
	
	public String getApellidos (){
		return Apellidos;
	}
	
	public void setEdad (int Ed){
		Edad=Ed;
	}
	
	public int getEdad (){
		return Edad;
	}
	
	public void setDNI (int DN){
		DNI=DN;
	}
	
	public int getDNI (){
		return DNI;
	}
	
	public void setCorreoElectronico (String CE){
		CorrerElectronico=CE;
	}
	
	public String getCorreoElectronico (){
		return CorreoElectronico;
	}
	
	
	public String toString(){
		
		// Concatenamos para que aparezca el nombre mas el DNI en nuestra ventana
		
		return Nombre+""+DNI;
	}

}
		
	
}
