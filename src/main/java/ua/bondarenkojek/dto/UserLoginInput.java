package ua.bondarenkojek.dto;

import lombok.Data;
import ua.bondarenkojek.model.User;

@Data
public class UserLoginInput {
    private String login;
    private String password;

    public static User toUser(UserLoginInput userLoginInput) {
        return User.builder()
                .login(userLoginInput.login)
                .password(userLoginInput.password)
                .build();
    }
}
