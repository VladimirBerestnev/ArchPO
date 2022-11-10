package Task4;

import java.util.ArrayList;

/**
 * провайдер билетов
 */
public class TicketProvider {
    ArrayList<Ticket>tickets;
    ArrayList<Ticket>tickets_today;
    ArrayList<Ticket>tickets_tomorrow;

    //формирование списка билетов
    public void ticketBase(){
        tickets_today = new ArrayList<>();
        tickets_tomorrow = new ArrayList<>();

        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 56; j++) {

                tickets_today.add(new Ticket(i,j,200, true));
                tickets_tomorrow.add(new Ticket(i,j,200, true));
            }
        }
    }

    //получение билета по данным пользователя
   public Ticket getTickets(int sc, int rootNumber, int place){

        if (sc == 1){

            for (Ticket ticket : tickets_today) {
                if (ticket.getRootNumber() == rootNumber & ticket.getPlace() == place & ticket.getIsValid()){
                    return ticket;
                }
            }
            
        }
       if (sc == 2){

           for (Ticket ticket : tickets_tomorrow) {
               if (ticket.getRootNumber() == rootNumber & ticket.getPlace() == place & ticket.getIsValid()){
                   return ticket;
               }
           }

       }

       return null;
   }

   //обновление статуса билета
    public boolean updateTicketStatus (Ticket ticket) {
       return false;
    }

}
