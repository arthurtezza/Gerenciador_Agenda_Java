import java.util.Scanner;


public class Agenda {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Contato[] contatos = new Contato[100];

        int opcao;

        String nome, endereco, telefone;
        int diaNascimento, mesNascimento, anoNascimento, favorito;
        
        //Inicializa as intâncias com "" e 0
        for(int i = 0; i < contatos.length; i++){
            
            contatos[i] = new Contato("", "", "", 0, 0, 0);
        }
       

       do{
            System.out.printf("\n\nMenu\n\n");
            System.out.printf("1-Listar contatos\n2-Listar favoritos\n3-Cadastrar contato\n4-Excluir contato\n5-Listar por idade\n6-Sair\n");
            System.out.printf("Digite uma opção:");
            opcao = in.nextInt();

            //Lista os contatos
            if(opcao == 1){
                
                
                for(int i = 0; i < contatos.length; i++){
            
                    if(contatos[i].getNome() != ""){

                        System.out.printf("\nNome:%s\nTelefone:%s\nEndereço:%s\nData de nascimento:%d/%d/%d\nO contato é favorito?%s",
                        contatos[i].getNome(),contatos[i].getTelefone(),contatos[i].getEndereco(),contatos[i].getDiaNascimento(),
                        contatos[i].getMesNascimento(),contatos[i].getAnoNascimento(),contatos[i].getFavorito()? "Sim":"Não");

                    }
                }
                   
            }

            //Lista os contatos favoritos
            else if(opcao == 2){

                for(int i = 0; i < contatos.length; i++){

                    if(contatos[i].getFavorito() && contatos[i].getNome() != ""){
                        System.out.printf("\nNome:%s\nTelefone:%s\nEndereço:%s\nData de nascimento:%d/%d/%d\n",
                        contatos[i].getNome(),contatos[i].getTelefone(),contatos[i].getEndereco(),
                        contatos[i].getDiaNascimento(),contatos[i].getMesNascimento(),contatos[i].getAnoNascimento());
                    }

                }
            }

            //Cadastra os contatos
            else if(opcao == 3){

                if(Contato.getTotalContatos() < contatos.length){

                    int continuar = 1;
                    
                    
                    for(int i = 0; continuar == 1 && continuar != 2 && Contato.getTotalContatos() < contatos.length; i++ ){
                        
                        Contato.setTotalContatos(i); 
                        
                        if(Contato.getTotalContatos() < contatos.length){
                            System.out.printf("Nome:");
                            nome = in.next();
                            System.out.printf("Telefone:");
                            telefone = in.next();
                            System.out.printf("Endereço(Rua, Bairro, Número residência):");
                            endereco = in.next();
                            System.out.printf("Dia nascimento:");
                            diaNascimento = in.nextInt();
                            System.out.printf("Mês nascimento:");
                            mesNascimento = in.nextInt();
                            System.out.printf("Ano nascimento:");
                            anoNascimento = in.nextInt();
                            System.out.printf("Deseja que esse contato seja favorito?\n1-Sim\n2-Não\nDigite uma opção:");
                            favorito = in.nextInt();

                            if(favorito == 1){
                                contatos[i] = new Contato(nome, endereco, telefone, diaNascimento, mesNascimento, anoNascimento, true);
                            }
                            else{
                                contatos[i] = new Contato(nome, endereco, telefone, diaNascimento, mesNascimento, anoNascimento);
                            }

                            System.out.printf("Deseja continuar cadastrando contatos\n1-sim\n2-não\nDigite uma opção:");
                            continuar = in.nextInt();
                        }
                        else{
                            System.out.printf("\nNão é possível cadastrar mais contatos");
                        }   
                    }    
                }
                else{
                    System.out.printf("\nNão é possível adicionar mais contatos!\n");
                }
            }

            //Exclui os contatos
            else if(opcao == 4){
                int excluir;

                System.out.printf("Digite a posição de um contato que deseja excluir:");
                excluir = in.nextInt();

                contatos[excluir].setNome("");
                contatos[excluir].setEndereco("");
                contatos[excluir].setTelefone("");
                contatos[excluir].setDiaNascimento(0);
                contatos[excluir].setMesNascimento(0);
                contatos[excluir].setAnoNascimento(0);
                contatos[excluir].setFavorito(false);

                System.out.printf("Contato Excluído!\n");

            }

            //Lista os contatos por idade
            else if(opcao == 5){
                int idadeInicial, idadeFinal;

                System.out.printf("\nDigite uma idade incial:");
                idadeInicial = in.nextInt();
                System.out.printf("Digite uma idade final");
                idadeFinal = in.nextInt();

                int[] idade = new int[contatos.length];

                for(int i = 0; i < contatos.length; i++){
                    idade[i] = 2022 - contatos[i].getAnoNascimento();
                }

                for(int i = 0; i < contatos.length; i++){

                    if(  idade[i] >= idadeInicial && idade[i] <= idadeFinal){
                        System.out.printf("\nNome:%s\nTelefone:%s\nEndereço:%s\nData de nascimento:%d/%d/%d\nO contato é favorito?%s\nIdade:%d",
                        contatos[i].getNome(),contatos[i].getTelefone(),contatos[i].getEndereco(),contatos[i].getDiaNascimento(),
                        contatos[i].getMesNascimento(),contatos[i].getAnoNascimento(),contatos[i].getFavorito()? "Sim":"Não",idade[i]);
                    }
                }
            }

            //Sai do programa
            else if(opcao == 6){
                System.out.printf("\nOperação finalizada!");
            }
            else{
                System.out.printf("\nOpção incorreta!Tente novamente.\n");
            }
            
        } while (opcao != 6);
       in.close();
    }

}
