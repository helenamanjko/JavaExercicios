package ExtendsJava;

//EXERCICIO 1 ---------CLASSE ANIMAL-------------------
public class Animal {
	
	private String nome;
	private String pelagem;
	private String habitat;
	private int idade;
	private String som;
	private String atividade;
	
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
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
}
/*//-------------------CLASSE CACHORRO-------------------------------

package ExtendsJava;

public class Cachorro extends Animal{
	
	private String cauda;
	private String faro;
	private String ra�a;
	private String porte;
	
	public String getCauda() {
		return cauda;
	}
	public void setCauda(String cauda) {
		this.cauda = cauda;
	}
	public String getFaro() {
		return faro;
	}
	public void setFaro(String faro) {
		this.faro = faro;
	}
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

}

//----------------------------CLASSE CAVALO-----------------------------

package ExtendsJava;

public class Cavalo extends Animal{
	
	private int rabo;
	private String crina;
	private int trote;
	
	public int getRabo() {
		return rabo;
	}
	public void setRabo(int rabo) {
		this.rabo = rabo;
	}
	public String getCrina() {
		return crina;
	}
	public void setCrina(String crina) {
		this.crina = crina;
	}
	public int getTrote() {
		return trote;
	}
	public void setTrote(int trote) {
		this.trote = trote;
	}
	
}

//--------------------------------CLASSE PREGUI�A----------------------

package ExtendsJava;

public class Pregui�a extends Animal {

	private int tempoSono;
	private double tamanhoUnhas;
	
	public int getTempoSono() {
		return tempoSono;
	}
	public void setTempoSono(int tempoSono) {
		this.tempoSono = tempoSono;
	}
	public double getTamanhoUnhas() {
		return tamanhoUnhas;
	}
	public void setTamanhoUnhas(double tamanhoUnhas) {
		this.tamanhoUnhas = tamanhoUnhas;
	}
	
}

//--------------------------CLASSE REINO ANIMAL-----------------------------------

package ExtendsJava;


public class ReinoAnimal {

	public static void main(String[] args) {
		
		Cachorro filhote1 = new Cachorro();
		Cavalo potro1 = new Cavalo();	
		Pregui�a filhoteP1 = new Pregui�a();
		
		filhote1.setNome("Mooly");
		filhote1.setPelagem("curta");
		filhote1.setCauda("curta");
		filhote1.setRa�a("Vira-Lata");
		
		potro1.setNome("Lili");
		potro1.setHabitat("campo");
		potro1.setRabo(45);
		potro1.setCrina("crina caida");
		
		filhoteP1.setNome("Lilo");
		filhoteP1.setIdade(4);
		filhoteP1.setTempoSono(16);
		filhoteP1.setTamanhoUnhas(58);
		
		System.out.println("\n===== Filhote Cachorro ======");
		System.out.println("O nome do filhote � " + filhote1.getNome());
		System.out.println("A pelagem do filhote � " + filhote1.getPelagem());
		System.out.println("A cauda do filhote � " + filhote1.getCauda());
		System.out.println("A ra�a do filhote � " + filhote1.getRa�a());
		
		System.out.println("\n===== Potro ======");
		System.out.println("O nome do potro � " + potro1.getNome());
		System.out.println("O habitat do potro � " + potro1.getHabitat());
		System.out.println("O tamanho do rabo do potro � " + potro1.getRabo()+" cm.");
		System.out.println("O tipo de crina do potro � " + potro1.getCrina());
		
		System.out.println("\n===== Filhote Pregui�a ======");
		System.out.println("O nome da pregui�a � " + filhoteP1.getNome());
		System.out.println("A idade da pregui�a � " + filhoteP1.getIdade() +" anos.");
		System.out.println("O tempo de sono da pregui�a � " + filhoteP1.getTempoSono()+" horas.");
		System.out.println("O tamanho das suas unhas � " + filhoteP1.getTamanhoUnhas() + " cm.");

	}

}


//EXERCICIO 2-------------------------------------

package ExtendsJava;

public class SomAnimais {

	public static void main(String[] args) {
						
				Cachorro cadastro1 = new Cachorro();
				Cavalo potro = new Cavalo();	
				Pregui�a filhoteUm = new Pregui�a();
				
				cadastro1.setNome("Sebastian");
				cadastro1.setPelagem("longa");
				cadastro1.setCauda("grande");
				cadastro1.setRa�a("Border Collie");
				cadastro1.setSom("Au-Au");
				cadastro1.setAtividade("Correr");
				
				potro.setNome("Baby");
				potro.setHabitat("campo");
				potro.setRabo(60);
				potro.setCrina("crina aparada");
				potro.setSom("hinn-in-in");
				potro.setAtividade("Correr");
				
				filhoteUm.setNome("Lazy");
				filhoteUm.setIdade(2);
				filhoteUm.setTempoSono(18);
				filhoteUm.setTamanhoUnhas(35);
				filhoteUm.setSom("zz-zzzz-zzzz");
				filhoteUm.setAtividade("Subir em �rvores");
				
				System.out.println("\n===== Filhote Cachorro ======");
				System.out.println("O nome do filhote � " + cadastro1.getNome());
				System.out.println("A pelagem do filhote � " +  cadastro1.getPelagem());
				System.out.println("A cauda do filhote � " + cadastro1.getCauda());
				System.out.println("A ra�a do filhote � " + cadastro1.getRa�a());
				System.out.println("O som do filhote � " + cadastro1.getSom());
				System.out.println("A atividade do filhote � " + cadastro1.getAtividade());
				
				
				System.out.println("\n===== Potro ======");
				System.out.println("O nome do potro � " + potro.getNome());
				System.out.println("O habitat do potro � " + potro.getHabitat());
				System.out.println("O tamanho do rabo do potro � " + potro.getRabo()+" cm.");
				System.out.println("O tipo de crina do potro � " + potro.getCrina());
				System.out.println("O som do filhote � " + potro.getSom());
				System.out.println("A atividade do filhote � " + potro.getAtividade());
				
				System.out.println("\n===== Filhote Pregui�a ======");
				System.out.println("O nome da pregui�a � " + filhoteUm.getNome());
				System.out.println("A idade da pregui�a � " + filhoteUm.getIdade() +" anos.");
				System.out.println("O tempo de sono da pregui�a � " + filhoteUm.getTempoSono()+" horas.");
				System.out.println("O tamanho das suas unhas � " + filhoteUm.getTamanhoUnhas() + " cm.");
				System.out.println("O som do filhote � " + filhoteUm.getSom());
				System.out.println("A atividade do filhote � " + filhoteUm.getAtividade());

		}

}*/
