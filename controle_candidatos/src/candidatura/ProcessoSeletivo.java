package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
	
		String [] candidatos = {"Felipe", "Marcia","Julia", "Paulo", "Augusto"};
		for(String canditado: candidatos) {
			entrandoEmContato(canditado);
		}
	
	}
	
	
	static void entrandoEmContato(String canditado) {
		int tentativasRelizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando)
				tentativasRelizadas++;
			else 
				System.out.println("Contato Realizado com Sucesso");
		}
		
		while(continuarTentando && tentativasRelizadas<3);
		
	}
			// metodo auxiliar
		static boolean atender() {
			return new Random().nextInt(3)==1;			
		
		}
		
	static void imprimirSelecionados() {
		
		String [] candidatos = {"Felipe", "Marcia","Julia", "Paulo", "Augusto"};
		
		
		System.out.println("Imprimindo a lista de candidatos infornando o indice do elemento");
		
		for(int indice=0; indice< candidatos.length;indice++) {
			System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
		}
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
		
    static void selecaoCandidatos() {
    	
    	String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
    	
    	
    	int candidatosSelecionados = 0;
    	int candidatosAtual = 0;
    	double salariobase = 2000.0;
    	
    	while (candidatosSelecionados < 5) {
    		String candidato = candidatos[candidatosAtual];
    		double salarioPretendido = valorPretendido();
    		
    		System.out.println("O candidato " + candidato + " Solicitou esse valor de Salário " +  salarioPretendido);
    		
    		if (salariobase >= salarioPretendido && candidatosAtual < candidatos.length) {
    			System.out.println("O canditato " + candidato + " foi selecionado para a vaga");
    			candidatosSelecionados++;
    		}
    		candidatosAtual++;
    	}
     }
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato( double salarioPretendido ) {
		double salarioBase = 2000.0;
		 
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato!");
		} 
		else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra prosposta!");
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos!");
		}
}

}