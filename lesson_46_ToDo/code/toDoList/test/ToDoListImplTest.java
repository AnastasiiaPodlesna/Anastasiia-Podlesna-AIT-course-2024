package toDoList.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import toDoList.dao.ToDoList;
import toDoList.dao.ToDoListImpl;
import toDoList.model.Task;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest
{
    ToDoList toDoList;
    LocalDate now = LocalDate.now();

    @BeforeEach // тестовый набор данных
    void setUp()
    {
        toDoList = new ToDoListImpl();
        toDoList.addTask(new Task("Do homework", now.minusDays(2)));
        toDoList.addTask(new Task("Buy products", now.minusDays(1)));
        toDoList.addTask(new Task("Walk with pet", now.minusDays(3)));

        //System.out.println(toDoList);
    }

    @Test
    void addTask()
    {
        assertFalse(toDoList.addTask(null)); // нельзя пустой
        assertFalse(toDoList.addTask(new Task("Do homework", now.minusDays(2)))); // нельзя дубликат
        Task task = new Task("Clean", now.minusDays(1)); // нельзя дублик)
        assertTrue(toDoList.addTask(task));
        assertEquals(4, toDoList.quantity());
    }

    @Test
    void removeTask()
    {
        toDoList.removeTask(1);
        assertEquals(2, toDoList.quantity());
        toDoList.viewTasks();
    }

    @Test
    void viewTasks()
    {
        toDoList.viewTasks();
    }

    @Test
    void getAllTasks()
    {
        toDoList.getAllTasks();
        toDoList.viewTasks();
    }

    @Test
    void quantity()
    {
       assertEquals(3, toDoList.quantity());
    }
}