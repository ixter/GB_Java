package hw07.ui;

import hw07.presenter.Presenter;

public interface View 
{
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
    String scan(); 
}
