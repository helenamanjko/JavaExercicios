package Codificando;
 
 ///------------------ CLASSE CLiente ---- Exercicio 1 ---------------------------
  
public class Clientes {
	
	String nome;
	String ocupação;
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
		
		cadastro1.nome = "Bárbara";
		cadastro1.ocupação = "AnalistaTI";
		cadastro1.idade = 27;
		
		System.out.println(cadastro1.nome);
		System.out.println(cadastro1.ocupação);
		System.out.println(cadastro1.idade);
		
		cadastro1.comprar(4);
		
		cadastro1.darAvaliacao(8);
		
	}

}

 ///------------------ CLASSE Avião ---- Exercicio 2 ---------------------------

package Codificando;

public class Avião {
	
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

	//-------------------Objeto Avião -- Exercicio 2 -----------
	  
	 
	package Codificando;

public class AviãoAtribuindo {

	public static void main(String[] args) {
		
		Avião novoModelo = new Avião();
		
		novoModelo.setMarca("Embraer");
		novoModelo.setAeroporto("Congonhas");
		novoModelo.setPassageiros(600);
		
		
		System.out.println("O modelo do avião é da "+ novoModelo.getMarca());
		System.out.println("O aeroporto de destino é o de " +novoModelo.getAeroporto());
		System.out.println("Com " + novoModelo.getPassageiros() + " passageiros!");
	
	}

}

 ///------------------ CLASSE ProdutosEletronicos ---- Exercicio 3 ---------------------------
  
  package Codificando;

public class ProdutosEletronicos {
	
	private String produto;
	private  String marca;
	private int anoFabricação;
	
	
	
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

	public int getAnoFabricação() {
		return anoFabricação;
	}

	public void setAnoFabricação(int anoFabricação) {
		this.anoFabricação = anoFabricação;
	}

	void ligar(String estado) {
		System.out.println("O/A " + produto + " se encontra "+ estado);
	}
	
	void consumo(double gasto) {
		System.out.println("O seu consumo é de "+ gasto + " kWh por mês.");
	}

}


	//-------------------Objeto ProdutosEletronicos -- Exercicio 3 -----------
	  
	package Codificando;

public class ProdEletronicosAtribuição {

	public static void main(String[] args) {
		
		ProdutosEletronicos produto1 = new ProdutosEletronicos();
		
		produto1.setProduto("Tevelisão");
		produto1.setMarca("Samsung");
		produto1.setAnoFabricação(2001);
		
		System.out.println("O nome do produto é " + produto1.getProduto());
		System.out.println("A marca do produto é " + produto1.getMarca());
		System.out.println("O ano de fabricação do produto é " + produto1.getAnoFabricação());
		
		produto1.ligar("ligado");
		
		produto1.consumo(4.30);
	
	}

}

  ///------------------ CLASSE Funcionários ---- Exercicio 4 ---------------------------

package Codificando;

public class Funcionários {
	
	private String nome;
	private double salário;
	private String cargo;
	
		
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalário() {
		return salário;
	}



	public void setSalário(double salário) {
		this.salário = salário;
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
	
	
	//-------------------Objeto Funcionários -- Exercicio 4 -----------
	  
	 package Codificando;

public class FuncionariosAtribuindo {
	
	public static void main(String[] args) {
		
		Funcionários cadastro1 = new Funcionários();
		
		cadastro1.setNome("Luana");
		cadastro1.setSalário(2.300);
		cadastro1.setCargo("Vendedora");
		
		System.out.println("A/O " + cadastro1.getNome() + " tem o cargo de " + cadastro1.getCargo() + 
				" com o salário de " +cadastro1.getSalário());
		
	cadastro1.vendas(5);
		
	}


}

  ///------------------ CLASSE Patinete ---- Exercicio 5 ---------------------------
    
   package Codificando;

public class Patinetes {
	
	private String modelo;
	private int AnoFabricação;
	private String cor;
	
	
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAnoFabricação() {
		return AnoFabricação;
	}



	public void setAnoFabricação(int anoFabricação) {
		AnoFabricação = anoFabricação;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	void distancia(int km) {
		System.out.println("A maior distância percorrida com ele foi de " +km + " km.");
	}

}

 	//-------------------Objeto Patinetes -- Exercicio 5 -----------
 	  
 	 package Codificando;

public class PatinetesAtribuindo {
	
	public static void main(String[] args) {
		
		Patinetes modelo1 = new Patinetes();
		
		modelo1.setModelo("Modelo Elétrico");
		modelo1.setAnoFabricação(2009);
		modelo1.setCor("vermelho");
		
		System.out.println("O patinete de " + modelo1.getModelo() + " tem o ano de fabricação de " + modelo1.getAnoFabricação() +
				" e sua cor é "+ modelo1.getCor());
		modelo1.distancia(45);
		
	}

} 
 
  ///------------------ CLASSE ContaBancária ---- Exercicio 6 ---------------------------
    
   package Codificando;

public class ContaBancária {
	
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
		System.out.println("O valor atual da conta é de " + saldoAux);
	}
	void subtrair(int negativo) {
		saldoAux = saldoAux - negativo;
		System.out.println("O valor atual da conta é de " + saldoAux);
	}

} 
   
   	//-------------------Objeto ContaBancária -- Exercicio 6 -----------
    
    package Codificando;

public class ContaBancariaAtribuindo {

	public static void main(String[] args) {

		ContaBancária cadastro1 = new ContaBancária();
		
		cadastro1.setNumero("000.001-89");
		cadastro1.setNome("Rogério Santos");
		cadastro1.setBanco("Banco do Brasil");
		cadastro1.setSaldo(100);
		
		System.out.println("A conta do " + cadastro1.getNome() + ", com o número " + cadastro1.getNumero() + " no " +
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
	private String doença;
	private String dataInternação;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDoença() {
		return doença;
	}
	public void setDoença(String doença) {
		this.doença = doença;
	}
	public String getDataInternação() {
		return dataInternação;
	}
	public void setDataInternação(String dataInternação) {
		this.dataInternação = dataInternação;
	}
	
}

   	//-------------------Objeto Paciente -- Exercicio 7 -----------
   	 package Codificando;

public class PacientesAtribuindo {

	public static void main(String[] args) {
		
		Pacientes cadastro = new Pacientes();
		
		cadastro.setNome("Luís Oliveira");
		cadastro.setDoença("gripe");
		cadastro.setDataInternação("10.06.2018");
		
		Pacientes cadastro2 = new Pacientes();
		
		cadastro2.setNome("Aline Marques");
		cadastro2.setDoença("disfunção renal");
		cadastro2.setDataInternação("11.01.2021");
		
		System.out.println("O paciente " + cadastro.getNome() + " com o quadro de " + cadastro.getDoença() + " deu entrada"
				+ " na internação dia " +cadastro.getDataInternação());
		
		System.out.println("O paciente " + cadastro2.getNome() + " com o quadro de " + cadastro2.getDoença() + " deu entrada"
				+ " na internação dia " +cadastro2.getDataInternação());
	
	}

}

    
}

*/
