package blog.services;

import blog.forms.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceStubImpl implements UserService {
    @Override
    public boolean authenticate(String username, String password) {
        // Provide a sample password check: username == password
        return Objects.equals(username, password);
    }
}

