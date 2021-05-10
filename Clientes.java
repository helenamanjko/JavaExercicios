package Codificando;
 
 ///------------------ CLASSE CLiente ---- Exercicio 1 ---------------------------
  
public class Clientes {
	
	String nome;
	String ocupa��o;
	int idade;
	
	void comprar(int numero) {
		System.out.println("Comprou " + numero +" produtos.");
	}
	
	void darAvaliacao(int escala) {
		System.out.println("Avaliou a loja em nota " + escala +"!");
	}
	
}

	//-------------------Objeto Cliente -- Exercicio 1 -----------
	 
	
/* package Codificando;

public class ClientesAtribuindo {

	public static void main(String[] args) {
		
		Clientes cadastro1 = new Clientes();
		
		cadastro1.nome = "B�rbara";
		cadastro1.ocupa��o = "AnalistaTI";
		cadastro1.idade = 27;
		
		System.out.println(cadastro1.nome);
		System.out.println(cadastro1.ocupa��o);
		System.out.println(cadastro1.idade);
		
		cadastro1.comprar(4);
		
		cadastro1.darAvaliacao(8);
		
	}

}

 ///------------------ CLASSE Avi�o ---- Exercicio 2 ---------------------------

package Codificando;

public class Avi�o {
	
	private String marca;
	private String aeroporto;
	private int passageiros;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAeroporto() {
		return aeroporto;
	}
	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

}

	//-------------------Objeto Avi�o -- Exercicio 2 -----------
	  
	 
	package Codificando;

public class Avi�oAtribuindo {

	public static void main(String[] args) {
		
		Avi�o novoModelo = new Avi�o();
		
		novoModelo.setMarca("Embraer");
		novoModelo.setAeroporto("Congonhas");
		novoModelo.setPassageiros(600);
		
		
		System.out.println("O modelo do avi�o � da "+ novoModelo.getMarca());
		System.out.println("O aeroporto de destino � o de " +novoModelo.getAeroporto());
		System.out.println("Com " + novoModelo.getPassageiros() + " passageiros!");
	
	}

}

 ///------------------ CLASSE ProdutosEletronicos ---- Exercicio 3 ---------------------------
  
  package Codificando;

public class ProdutosEletronicos {
	
	private String produto;
	private  String marca;
	private int anoFabrica��o;
	
	
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabrica��o() {
		return anoFabrica��o;
	}

	public void setAnoFabrica��o(int anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}

	void ligar(String estado) {
		System.out.println("O/A " + produto + " se encontra "+ estado);
	}
	
	void consumo(double gasto) {
		System.out.println("O seu consumo � de "+ gasto + " kWh por m�s.");
	}

}


	//-------------------Objeto ProdutosEletronicos -- Exercicio 3 -----------
	  
	package Codificando;

public class ProdEletronicosAtribui��o {

	public static void main(String[] args) {
		
		ProdutosEletronicos produto1 = new ProdutosEletronicos();
		
		produto1.setProduto("Tevelis�o");
		produto1.setMarca("Samsung");
		produto1.setAnoFabrica��o(2001);
		
		System.out.println("O nome do produto � " + produto1.getProduto());
		System.out.println("A marca do produto � " + produto1.getMarca());
		System.out.println("O ano de fabrica��o do produto � " + produto1.getAnoFabrica��o());
		
		produto1.ligar("ligado");
		
		produto1.consumo(4.30);
	
	}

}

  ///------------------ CLASSE Funcion�rios ---- Exercicio 4 ---------------------------

package Codificando;

public class Funcion�rios {
	
	private String nome;
	private double sal�rio;
	private String cargo;
	
		
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSal�rio() {
		return sal�rio;
	}



	public void setSal�rio(double sal�rio) {
		this.sal�rio = sal�rio;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	void vendas(int numero) {
		System.out.println("O/A " + nome + " vendeu " + numero + " produtos hoje!");
	}
	
	
	//-------------------Objeto Funcion�rios -- Exercicio 4 -----------
	  
	 package Codificando;

public class FuncionariosAtribuindo {
	
	public static void main(String[] args) {
		
		Funcion�rios cadastro1 = new Funcion�rios();
		
		cadastro1.setNome("Luana");
		cadastro1.setSal�rio(2.300);
		cadastro1.setCargo("Vendedora");
		
		System.out.println("A/O " + cadastro1.getNome() + " tem o cargo de " + cadastro1.getCargo() + 
				" com o sal�rio de " +cadastro1.getSal�rio());
		
	cadastro1.vendas(5);
		
	}


}

  ///------------------ CLASSE Patinete ---- Exercicio 5 ---------------------------
    
   package Codificando;

public class Patinetes {
	
	private String modelo;
	private int AnoFabrica��o;
	private String cor;
	
	
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAnoFabrica��o() {
		return AnoFabrica��o;
	}



	public void setAnoFabrica��o(int anoFabrica��o) {
		AnoFabrica��o = anoFabrica��o;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	void distancia(int km) {
		System.out.println("A maior dist�ncia percorrida com ele foi de " +km + " km.");
	}

}

 	//-------------------Objeto Patinetes -- Exercicio 5 -----------
 	  
 	 package Codificando;

public class PatinetesAtribuindo {
	
	public static void main(String[] args) {
		
		Patinetes modelo1 = new Patinetes();
		
		modelo1.setModelo("Modelo El�trico");
		modelo1.setAnoFabrica��o(2009);
		modelo1.setCor("vermelho");
		
		System.out.println("O patinete de " + modelo1.getModelo() + " tem o ano de fabrica��o de " + modelo1.getAnoFabrica��o() +
				" e sua cor � "+ modelo1.getCor());
		modelo1.distancia(45);
		
	}

} 
 
  ///------------------ CLASSE ContaBanc�ria ---- Exercicio 6 ---------------------------
    
   package Codificando;

public class ContaBanc�ria {
	
	private String numero;
	private String nome;
	private String banco;
	private double saldo;
	private double saldoAux;
	
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String d) {
		this.numero = d;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldoAux() {
		return saldoAux;
	}
	public void setSaldoAux(double saldoAux) {
		this.saldoAux = saldoAux;
	}
	void somar(int positivo) {
		saldoAux = saldo +positivo;
		System.out.println("O valor atual da conta � de " + saldoAux);
	}
	void subtrair(int negativo) {
		saldoAux = saldoAux - negativo;
		System.out.println("O valor atual da conta � de " + saldoAux);
	}

} 
   
   	//-------------------Objeto ContaBanc�ria -- Exercicio 6 -----------
    
    package Codificando;

public class ContaBancariaAtribuindo {

	public static void main(String[] args) {

		ContaBanc�ria cadastro1 = new ContaBanc�ria();
		
		cadastro1.setNumero("000.001-89");
		cadastro1.setNome("Rog�rio Santos");
		cadastro1.setBanco("Banco do Brasil");
		cadastro1.setSaldo(100);
		
		System.out.println("A conta do " + cadastro1.getNome() + ", com o n�mero " + cadastro1.getNumero() + " no " +
		cadastro1.getBanco() + " tem o saldo atual de " + cadastro1.getSaldo());
		
		System.out.println("--Transferencia--");
		cadastro1.somar(50);
		
		System.out.println("--Pagamento--");
		cadastro1.subtrair(25);

	}

}

  ///------------------ CLASSE Paciente ---- Exercicio 7 ---------------------------
    
    package Codificando;

public class Pacientes {
	
	private String nome;
	private String doen�a;
	private String dataInterna��o;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDoen�a() {
		return doen�a;
	}
	public void setDoen�a(String doen�a) {
		this.doen�a = doen�a;
	}
	public String getDataInterna��o() {
		return dataInterna��o;
	}
	public void setDataInterna��o(String dataInterna��o) {
		this.dataInterna��o = dataInterna��o;
	}
	
}

   	//-------------------Objeto Paciente -- Exercicio 7 -----------
   	 package Codificando;

public class PacientesAtribuindo {

	public static void main(String[] args) {
		
		Pacientes cadastro = new Pacientes();
		
		cadastro.setNome("Lu�s Oliveira");
		cadastro.setDoen�a("gripe");
		cadastro.setDataInterna��o("10.06.2018");
		
		Pacientes cadastro2 = new Pacientes();
		
		cadastro2.setNome("Aline Marques");
		cadastro2.setDoen�a("disfun��o renal");
		cadastro2.setDataInterna��o("11.01.2021");
		
		System.out.println("O paciente " + cadastro.getNome() + " com o quadro de " + cadastro.getDoen�a() + " deu entrada"
				+ " na interna��o dia " +cadastro.getDataInterna��o());
		
		System.out.println("O paciente " + cadastro2.getNome() + " com o quadro de " + cadastro2.getDoen�a() + " deu entrada"
				+ " na interna��o dia " +cadastro2.getDataInterna��o());
	
	}

}

    
}

*/
