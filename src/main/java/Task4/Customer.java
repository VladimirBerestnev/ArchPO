package Task4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *  Класс клиента
 */

public class Customer {

    public int id;
    public ArrayList <Ticket> tickets = new ArrayList<>();
    public CashProvider cashProvider;

    //проверка покупки билета
    public boolean buyTicket(Ticket ticket){
        return true;
    }

    //поиск билетов
    public Ticket searchTicket(){

        //получение списка билетов
        TicketProvider ticketProvider = new TicketProvider();
        ticketProvider.ticketBase();

        //выбор билета клиентом
        System.out.println("Добро пожаловать в сервис продажи билетов.");
        System.out.println("Выберите 1, если нужен билет на сегодня, или 2, если на завтра");
        Scanner scanner = new Scanner(System.in);
        int sc1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Выберите маршрут");
        int sc2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Выберите место");
        int sc3 = Integer.parseInt(scanner.nextLine());

        Ticket myTicket = ticketProvider.getTickets(sc1,sc2,sc3);
        return myTicket;
    }

}
