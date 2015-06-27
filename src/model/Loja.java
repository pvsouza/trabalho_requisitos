package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	private String endereco;
	private String nome;
	public List<Carro> carros = new ArrayList<>();
	public List<Motocicleta> motocicletas = new ArrayList<>();
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	public List<Motocicleta> getMotocicletas() {
		return motocicletas;
	}
	public void setMotocicletas(List<Motocicleta> motocicletas) {
		this.motocicletas = motocicletas;
	}

}
