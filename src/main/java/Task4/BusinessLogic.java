package Task4;

/**
 * Бизнес-логика проекта по покупке билетов
 */
public class BusinessLogic {

    public static void main(String[] args) {

        //пришел новый клиент
        Customer customer = new Customer();
        // авторизация клиента
        customer.cashProvider.autorization(customer);
        //поиск билетов
        Ticket ticket = customer.searchTicket();
        //покупка билета
        customer.cashProvider.buy(ticket.getPrice());
        // проверка, куплен ли билет
        customer.buyTicket(ticket);
    }
}
