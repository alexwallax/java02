package classe02;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(); // vai buscar os valores do construtor padrão 
		Data d2 = new Data(31 ,12, 2022); // não precisa mais setar os valores la embaixo, coloca como parametros.
		
		//d1.dia = 13;
		//d1.mes = 12; 
		//d1.ano = 1985;
		
		//d2.dia = 27; 
		//d2.mes = 9;
		//d2.ano = 1999;
		

			
		//System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano + "\n"); 
		
		//System.out.printf("%d/%d/%d\n\n", d1.dia, d1.mes, d1.ano);
		
		//System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano); 
		
		String dataFormatada1 = d1.obterData();
		
		System.out.println(dataFormatada1);
		System.out.printf(d2.obterData());
		
		 
	}

}
