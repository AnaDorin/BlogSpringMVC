package blog.forms;

import blog.models.User;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class RegistrationForm {

    private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
    private static final String EMAIL_MESSAGE = "{email.message}";

    @NotBlank(message = RegistrationForm.NOT_BLANK_MESSAGE)
    @Email(message = RegistrationForm.EMAIL_MESSAGE)
    private String email;

    @NotBlank(message = RegistrationForm.NOT_BLANK_MESSAGE)
    private String password;

    @NotBlank(message = RegistrationForm.NOT_BLANK_MESSAGE)
    private String username;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User createAccount() {
        return new User(getEmail(), getUsername(), getPassword());
    }
}
