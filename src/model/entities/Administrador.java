package model.entities;

import java.util.List;

public class Administrador {

    private String email;
    private String senha;
    private Escritorio escritorio;
    
    public Administrador(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
	}

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void geraRelatorioDeAdvogados(String nome, List<Duvida> advogados) {

    }

    public void geraRelatorioDeDuvidas(String nome, List<Processo> duvidas){

    }

    public void geraRelatorioDeProcessos(String nome, List<Processo> processos){

    }
}