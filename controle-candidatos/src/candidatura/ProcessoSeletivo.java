package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       //analisarCandidato(1900.0);
       //analisarCandidato(2200.0);
       //analisarCandidato(2000.0);
       //selecaoCandidatos();
       imprimirSelecionados();
    }

    static void imprimirSelecionados(){   
        String [] candidatos = {"FELIPE","MARICA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidatode numero " + (indice+1) + " é o " + candidatos[indice]);
        }     

        System.out.println("Imprimindo de fomra abreviada");
        
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi" + candidato);
        }
    }

    static void  selecaoCandidatos(){
    String [] candidatos = {"FELIPE","MARICA", "JULIA", "PAULO", "AUGUSTO",
        "MONICA", "FABRICIO","MIRELA","DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase= 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " Solicitou este valor salarial " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
         } else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
