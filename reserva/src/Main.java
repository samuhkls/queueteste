import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControladorReserva controladorReserva = new ControladorReserva();
        Reserva reserva = new Reserva();

        Scanner ler = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Escolha uma funcao de 0 a 4: ");
            System.out.println("1. adicionar reserva");
            System.out.println("2. chamar proximo ");
            System.out.println("3. listar reservas ");
            System.out.println("0. sair ");
            numero = ler.nextInt();


            switch(numero) {
                case 1:
                    ler.nextLine();
                    Reserva reserva1 = new Reserva();
                    System.out.println("digite o nome da responsavel: ");
                    reserva1.setResponsavel(ler.nextLine());
                    System.out.println("digite o numero do lugar: ");
                    reserva1.setLugares(ler.nextInt());
                    controladorReserva.adicionar(reserva1);
                    break;
                case 2:
                    reserva = controladorReserva.proximo();
                    String responsavel = reserva.getResponsavel();
                    int lugar = reserva.getLugares();
                    System.out.println(responsavel);
                    System.out.println(lugar);
                    break;
                case 3:
                    controladorReserva.exibirReservas();
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        } while (numero!=0);
    }
}

