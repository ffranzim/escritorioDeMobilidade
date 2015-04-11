package br.gov.caixa.mb;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import lombok.Data;

@Data
@ManagedBean
@ViewScoped
public class NotificacaoAjaxStatusMB implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String login;
	private String nome;
	
	public void executar() {
		
		System.out.println("Passei aqui");
		
		System.out.println("Login: " + this.login);
		System.out.println("nome: " + this.nome);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastrado com sucesso!")); 
	}
	
	public void verficarDisponibilidadeLogin() {
		FacesMessage msg = new FacesMessage();
		System.out.println("Passei aqui");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Erro");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg); 
	}

}
