import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Petshop petshop = new Petshop();

        int opcao;

        do {
            // Menu de opções
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nivel de água");
            System.out.println("5 - Verificar nivel de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            // Verificação da opção
            switch (opcao) {

                case 1:
                    if ( !petshop.isMaquinaOcupada() ) {
                        System.out.println( "Insira pet para banho!" );
                    } else if ( petshop.getNivelAgua() == 0 ) {
                        System.out.println( "Insira agua para poder dar banho" );
                    } else if ( petshop.getNivelXampu() == 0 ) {
                        System.out.println( "Insira xampu para poder dar banho" );
                    } else {
                        System.out.println( petshop.darBanho() );
                    }
                    break;
                case 2:
                    if ( petshop.getNivelAgua() == 30 ) {
                        System.out.println( "Maquina ja esta cheia de agua, nao eh possivel inserir mais" );
                    } else {
                        System.out.println( "Maquina abastecida, o nível da água agora é: " + petshop.abastecerComAgua() + " litros!" );
                    }
                    break;
                case 3:
                    if ( petshop.getNivelXampu() == 10 ) {
                        System.out.println( "Maquina ja esta cheia de xampu, nao eh possivel inserir mais" );
                    } else {
                        System.out.println( "Maquina abastecida, o nível de xampu agora é: " + petshop.abastecerComXampu() + " litros!" );
                    }
                    break;
                case 4:
                    if ( petshop.isMaquinaOcupada() ) {
                        System.out.println( "Nao é possivel verificar nivel de agua, maquina esta ocupada" );
                    } else {
                        System.out.println( "O nível da água é: " + petshop.verificarNivelAgua() + " litros!" );
                    }
                    break;
                case 5:
                    if ( petshop.isMaquinaOcupada() ) {
                        System.out.println( "Nao é possivel verificar nivel de agua, maquina esta ocupada" );
                    } else {
                        System.out.println( "O nível de xampu é: " + petshop.verificarNivelXampu() + " litros!" );
                    }
                    break;
                case 6:
                    if ( petshop.isMaquinaOcupada() ) {
                        System.out.println( "Tem pet no banho!" );
                    } else {
                        System.out.println( "Nao tem pet no banho!" );
                    }
                    break;
                case 7:
                    if ( petshop.isMaquinaOcupada() ) {
                        System.out.println( "Nao é possivel colocar pet na maquina, maquina já esta ocupada" );
                    } else {
                        System.out.println( petshop.colocarPetNaMaquina() );
                    }
                    break;
                case 8:
                    if ( petshop.isMaquinaOcupada() ) {
                        System.out.println( petshop.retirarPetDaMaquina() );
                    } else {
                        System.out.println( "Nao ha nenhum pet na maquina para ser retirado!" );
                    }
                    break;
                case 9:
                    if ( petshop.isMaquinaOcupada() ) {
                        System.out.println( "Nao é possivel limpar maquina, maquina esta ocupada" );
                    } else if ( (petshop.getNivelAgua() == 0 && petshop.getNivelXampu() == 0) ) {
                        System.out.println( "A maquina ja esta limpa" );
                    } else {
                        System.out.println( petshop.limparMaquina() );
                    }
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();

    }
}
