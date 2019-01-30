package blog.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @Size(min=2, max=30, message = "Username size should be in the range [2...30]")
    private String username;

    @NotNull
    @Size(min=5, max=50, message = "Password size should be at least 5 characters!")
    private String password;

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
}
