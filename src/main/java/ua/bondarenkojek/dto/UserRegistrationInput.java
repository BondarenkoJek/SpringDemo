package ua.bondarenkojek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.bondarenkojek.model.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationInput {
    private String login;
    private String email;
    private String password;

    public static User toUser(UserRegistrationInput userRegistrationInput) {
        return User.builder()
                .login(userRegistrationInput.login)
                .email(userRegistrationInput.email)
                .password(userRegistrationInput.password)
                .build();
    }
}
