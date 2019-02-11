package ua.bondarenkojek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.bondarenkojek.model.user.User;
import ua.bondarenkojek.model.user.UserRole;
import ua.bondarenkojek.model.user.UserState;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginInput {
    private String login;
    private String password;
    private UserRole role;
    private UserState state;

    public static User toUser(UserLoginInput userLoginInput) {
        return User.builder()
                .login(userLoginInput.login)
                .password(userLoginInput.password)
                .build();
    }
}
