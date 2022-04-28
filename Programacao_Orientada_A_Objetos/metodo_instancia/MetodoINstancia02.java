package Programacao_Orientada_A_Objetos.metodo_instancia;

import javax.swing.*;

public class MetodoINstancia02 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Alexandre";
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "349000000";
        cliente.email = "alexandre.afonso@algawork.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "348999999";

//		 System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); // Esse é o método estático.

        JOptionPane.showMessageDialog(null, "Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        JOptionPane.showMessageDialog(null, "Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());

//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//
//		return nomeCompleto;
//	}

    }
}

