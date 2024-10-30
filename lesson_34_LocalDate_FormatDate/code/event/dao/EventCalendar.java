package event.dao;

import event.model.Event;

import java.time.LocalDate;

public interface EventCalendar
{
    boolean addEvent(Event event);
    boolean removeEvent(int eventId);
    boolean updateEvent(int eventId, String url);
    Event findEventInCalendar(int eventId);
    Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
