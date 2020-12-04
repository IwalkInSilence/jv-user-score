package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String user : records) {
            String[] splittedEmails = user.split(":");
            if (splittedEmails[0].equals(email)) {
                return Integer.parseInt(splittedEmails[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
