package toDoList;

public enum ToDoList {
    TD1(1, "Add action"),
    TD2(2, "View all tasks"),
    TD3(3, "Delete a task (by number)"),
    TD4(4, "Exit the menu");

    private int item_number;
    private String action;

    ToDoList(int item_number, String action)
    {
        this.item_number = item_number;
        this.action = action;
    }

    public int getItem_number()
    {
        return item_number;
    }

    public String getAction()
    {
        return action;
    }

    public static void printMenu() // печать списка
     {
         System.out.println("\n\u001B[31m-------------" + "MENU " +"------------\u001B[0m");
         for (ToDoList option : ToDoList.values())
         {
            System.out.println(option.getItem_number() + " => " + option.getAction());
         }
         System.out.println("------------------------------------------------------");
     }

    public static ToDoList findByNumber(int number)
    {
        for (ToDoList option : ToDoList.values())
        {
            if (option.getItem_number() == number)
            {
                return option;
            }
        }
        return null; // если не нашли
    }
}