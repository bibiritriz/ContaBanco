    package banco;
    
    import java.util.Scanner;

    public class ContaTerminal {
        public static void main(String[] args) {
            int numero = 0;
            String agencia = "";
            String nome = "";
            double saldo = 0.0;
            
            try(Scanner ler = new Scanner(System.in)){
                System.out.println("Por favor, digite o numero da Agencia: ");
                numero = ler.nextInt();

                System.out.println("Por favor, digite a Agencia: ");
                agencia = ler.next();

                ler.nextLine();

                System.out.println("Por favor, digite o seu nome: ");
                nome = ler.nextLine();

                System.out.println("Por favor, digite o saldo: ");
                saldo = ler.nextDouble();
            }catch(Exception erro){
                System.out.println("Ocorreu um erro na entrada de dados. Tente novamente!");
                return;
            }

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque!");
        }
    }
