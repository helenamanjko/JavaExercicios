package InfaceJava;

public class EntregaExerc�cio {
	
	//EXERCICIO 1 E 2 ----------------------------------------------------------------
	
	//INTERFACE REIANIMAL-------------------
	/* package InfaceJava;

public interface ReiAnimal {
	public void EmitirSom();
	public void Atividade();

}

  //SUPER CLASSE ANIMAIS------------
     package InfaceJava;

public class Animais {
	
	private String nome;
	private String pelagem;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

    //CLASSE CACHORROS ---------------
     package InfaceJava;

public class Cachorros extends Animais implements ReiAnimal{

	private String ra�a;
	private String porte;
	
	
	
	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	@Override
	public void EmitirSom() {
		System.out.println("Au-Au");
		
	}

	@Override
	public void Atividade() {
		System.out.println("Correr");
		
	}

}

    //CLASSE CAVALOS ---------------
     package InfaceJava;

public class Cavalos extends Animais implements ReiAnimal {
	
	private String crina;
	

	public String getCrina() {
		return crina;
	}

	public void setCrina(String crina) {
		this.crina = crina;
	}

	@Override
	public void EmitirSom() {
		System.out.println("hinn-in-in");
		
	}

	@Override
	public void Atividade() {
		System.out.println("Correr");
		
	}

}
 
    //CLASSE PREGUI�AS ---------------   
      
     package InfaceJava;

public class Pregui�as extends Animais implements ReiAnimal {
	
	private int tempoSono;
	
		

	public int getTempoSono() {
		return tempoSono;
	}

	public void setTempoSono(int tempoSono) {
		this.tempoSono = tempoSono;
	}

	@Override
	public void EmitirSom() {
		System.out.println("zz-zzz-zzz");
		
	}

	@Override
	public void Atividade() {
		System.out.println("Subir em �rvores");
		
	}

}

    //CLASSE TODOSANIMAIS ---MAIN------------  
     package InfaceJava;

public class TodosAnimais {

	public static void main(String[] args) {
		
		Cavalos potro = new Cavalos();
		potro.setNome("Joana");
		System.out.print("O nome do portro � "+ potro.getNome()+ " e sua atividade � ");  potro.Atividade();
		
		Cachorros filhote = new Cachorros();
		filhote.setNome("Danubia");
		System.out.print("O nome do filhote � "+ filhote.getNome()+ " e seu som � ");  filhote.EmitirSom();
		 
		Pregui�as filhote1 = new Pregui�as();
		filhote1.setNome("Jimmy");
		filhote1.setTempoSono(18);
		System.out.print("O nome do filhote pregui�a � "+ filhote1.getNome()+ ", ele dorme " +filhote1.getTempoSono() +
				" horas e seu som � ");  filhote1.EmitirSom();

	}

}*/
  

}
