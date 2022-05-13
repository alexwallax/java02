package classe02;

public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	Data() { 
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // usando o this como método, só pode usar o des asim em um construtor
	} 
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterData() { 
		return String.format("%d/%d/%d\n\n", this.dia, mes, ano);
	}
	
	
}
