package hw05.service;

import hw05.model.User;
import hw05.view.Messages;

public class UserService {
    public User createUser(int id, String name) {
        return new User(id, name);
    }

    public void changeBalance(User user, int amount) {
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}
