import java.util.ArrayDeque;
import java.util.Queue;

public class ControladorReserva {

    private Queue<Reserva> reservas= new ArrayDeque<>();

    public void adicionar(Reserva reserva){
        reservas.offer(reserva);

    }

    public Reserva proximo(){
        Reserva x = reservas.peek();

        return x;
    }

    public void exibirReservas(){
        for(Reserva item : reservas){
            System.out.println(item.getResponsavel());
            System.out.println(item.getLugares());
            System.out.println();
        }
    }
}
