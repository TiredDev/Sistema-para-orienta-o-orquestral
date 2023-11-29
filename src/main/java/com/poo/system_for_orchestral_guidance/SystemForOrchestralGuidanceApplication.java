package com.poo.system_for_orchestral_guidance;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemForOrchestralGuidanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemForOrchestralGuidanceApplication.class, args);
	}

	}

class Igreja{
	private String nome;
	private String local;
	private int numero_maximo;
	private double tamanho_igreja;

	public Igreja(String nome, String local, int numero_maximo, double tamanho_igreja) {

		this.nome = nome;
		this.local = local;
		this.numero_maximo = numero_maximo;
		this.tamanho_igreja = tamanho_igreja;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getNumero_maximo() {
		return numero_maximo;
	}

	public void setNumero_maximo(int numero_maximo) {
		this.numero_maximo = numero_maximo;
	}

	public double getTamanho_igreja() {
		return tamanho_igreja;
	}

	public void setTamanho_igreja(double tamanho_igreja) {
		this.tamanho_igreja = tamanho_igreja;
	}

	
}
 class Musico {
    private static int proximoId = 1;  // Variável estática para gerar IDs automáticos
    private int id;
    private String nome;
    private String nomeIgreja;
    private String instrumento;

    // Construtor
    public Musico(String nome, String nomeIgreja, String instrumento) {
        this.id = proximoId++;
        this.nome = nome;
        this.nomeIgreja = nomeIgreja;
        this.instrumento = instrumento;
    }

    // Métodos Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeIgreja() {
        return nomeIgreja;
    }

    public String getInstrumento() {
        return instrumento;
    }

    // Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeIgreja(String nomeIgreja) {
        this.nomeIgreja = nomeIgreja;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    // Método toString para exibir informações do músico
    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nIgreja: " + nomeIgreja + "\nInstrumento: " + instrumento;
    }
}