package event.dao;

import event.model.Event;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class EventCalendarImpl implements EventCalendar
{
    private Event[] events;
    private int size;

    public EventCalendarImpl(int capacity)
    {

        this.events = new Event[capacity];
        this.size = 0;
    }

    @Override
    public boolean addEvent(Event event)
    {
        if (event == null || size == events.length || findEventInCalendar(event.getEventId()) != null)
        {
            return false;
        }

        events[size] = event;
        Arrays.sort(events, Comparator.nullsLast(  (e1, e2) -> Integer.compare(e1.getEventId(), e2.getEventId())));
        size++;
        return true;
    }

    @Override
    public boolean removeEvent(int eventId)
    {
        if (findEventInCalendar(eventId) != null)
        {
            for (int i = 0; i < size; i++)
            {
                if (events[i].getEventId() == eventId)
                {
                    System.arraycopy(events, i + 1, events, i, events.length - i - 1);
                    events[--size] = null;
                    return true;
                }
            }
        }
      return false;
    }

    @Override
    public boolean updateEvent(int eventId, String url)
    {
        Event event = findEventInCalendar(eventId);
        if (event == null)
        {
            return false;
        }
        event.setUrl(url);
        return true;
    }

    @Override
    public Event findEventInCalendar(int eventId)
    {
        for (int i = 0; i < size; i++)
        {
            if (events[i].getEventId() == eventId)
            {
                return events[i];
            }
        }
        return null;
    }

    @Override
    public Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo)
    {
        Event[] eventsFromToDate = new Event[events.length];
        int j = 0;

        for (int i = 0; i < events.length; i++)
        {
            if (events[i] != null &&
                        (events[i].getData().isEqual(dateFrom) || events[i].getData().isAfter(dateFrom)) &&
                        (events[i].getData().isEqual(dateTo) || events[i].getData().isBefore(dateTo)))
            {
                    eventsFromToDate[j] = events[i];
                    j++;
            }
        }

        return Arrays.copyOf(eventsFromToDate, j);
    }

    @Override
    public int size()
    {
        return size;
    }
}
