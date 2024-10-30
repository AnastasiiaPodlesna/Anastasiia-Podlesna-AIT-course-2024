package event.test;

import event.dao.EventCalendar;
import event.dao.EventCalendarImpl;
import event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EventCalendarImplTest
{
    Event[] events;
    EventCalendar eventCalendar;
    LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp()
    {
        eventCalendar = new EventCalendarImpl(7);
        events = new Event[7];
        events[0] = new Event(100, "T0", "Url0", now.minusDays(10));
        events[1] = new Event(101, "T1", "Url1", now.minusDays(9));
        events[2] = new Event(102, "T2", "Url2", now.minusDays(8));
        events[3] = new Event(103, "T3", "Url3", now.minusDays(7));
        events[4] = new Event(104, "T4", "Url4", now.minusDays(8));
        events[5] = new Event(105, "T5", "Url5", now.minusDays(10));

        for (int i = 0; i < events.length; i++)
        {
            eventCalendar.addEvent(events[i]);
        }

    }

    @Test
    void addEvent()
    {
        assertFalse(eventCalendar.addEvent(null));
        assertFalse(eventCalendar.addEvent(events[1]));
        assertTrue(eventCalendar.addEvent(new Event(106, "T6", "Url6", now.minusDays(3))));

    }

    @Test
    void removeEvent()
    {
        assertTrue(eventCalendar.removeEvent(103));
        assertFalse(eventCalendar.removeEvent(109));
    }

    @Test
    void updateEvent()
    {
        assertFalse(eventCalendar.updateEvent(109, "url9"));
        assertTrue(eventCalendar.updateEvent(104, "url8"));
    }

    @Test
    void findEventInCalendar()
    {
        assertEquals(events[5], eventCalendar.findEventInCalendar(105));
        assertNull(eventCalendar.findEventInCalendar(111));
    }

    @Test
    void getEventBetweenDate()
    {
        assertArrayEquals(new Event[]{events[0],events[1],events[5]}, eventCalendar.getEventBetweenDate(now.minusDays(10),now.minusDays(9)));

    }

    @Test
    void size()
    {
        assertEquals(6, eventCalendar.size());
    }
}