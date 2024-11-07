package homework.supermarket_LinkedList.dao;

public enum Menu
{
    STORE(1, "store"), EXPDATE(2, "expired goods"), CATGOODS(3, "products by category"), BRAND(4, "products by brand"), BCODE(5, "products by barcode"), EXIT(6, "EXIT");

    private int num;
    private String menu;

    Menu(int num,
            String menu)
    {
        this.num = num;
        this.menu = menu;
    }

    public int getNum()
    {
        return num;
    }

    public String getMenu()
    {
        return menu;
    }

    @Override
    public String toString()
    {
        return String.format(num + " => " + menu + " ");
    }
}
