package InfaceJava;

public class EntregaExercício {
	
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

	private String raça;
	private String porte;
	
	
	
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
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
 
    //CLASSE PREGUIÇAS ---------------   
      
     package InfaceJava;

public class Preguiças extends Animais implements ReiAnimal {
	
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
		System.out.println("Subir em árvores");
		
	}

}

    //CLASSE TODOSANIMAIS ---MAIN------------  
     package InfaceJava;

public class TodosAnimais {

	public static void main(String[] args) {
		
		Cavalos potro = new Cavalos();
		potro.setNome("Joana");
		System.out.print("O nome do portro é "+ potro.getNome()+ " e sua atividade é ");  potro.Atividade();
		
		Cachorros filhote = new Cachorros();
		filhote.setNome("Danubia");
		System.out.print("O nome do filhote é "+ filhote.getNome()+ " e seu som é ");  filhote.EmitirSom();
		 
		Preguiças filhote1 = new Preguiças();
		filhote1.setNome("Jimmy");
		filhote1.setTempoSono(18);
		System.out.print("O nome do filhote preguiça é "+ filhote1.getNome()+ ", ele dorme " +filhote1.getTempoSono() +
				" horas e seu som é ");  filhote1.EmitirSom();

	}

}*/
  

}
