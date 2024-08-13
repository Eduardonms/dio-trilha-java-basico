package com.java.diome.Exception;

//Define uma classe de exceção personalizada
public class ParametrosInvalidosException extends Exception {

 /**
	 * 
	 */
	private static final long serialVersionUID = 6936892354537202512L;

// Construtor padrão
 public ParametrosInvalidosException() {
     super();
 }

 // Construtor que aceita uma mensagem de erro
 public ParametrosInvalidosException(String mensagem) {
     super("Ocorreu um erro, parametroUm é MAIOR que o parametroDois.");
 }

 // Construtor que aceita uma mensagem de erro e uma causa
 public ParametrosInvalidosException(String mensagem, Throwable causa) {
     super(mensagem, causa);
 }

 // Construtor que aceita uma causa
 public ParametrosInvalidosException(Throwable causa) {
     super(causa);
 }
}
