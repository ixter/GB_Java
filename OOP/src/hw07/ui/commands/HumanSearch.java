package hw07.ui.commands;

import hw07.ui.Console;

public class HumanSearch extends Command 
{
    public HumanSearch(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Поиск человека по имени. ";
    }

    @Override
    public void execute() 
    {
        getConsole().humanSearch();
    }
}
