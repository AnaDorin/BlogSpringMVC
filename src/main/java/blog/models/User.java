package blog.models;

import java.util.HashSet;
import java.util.Set;

public class User {

    private String email;
    private String username;
    private String passwordHash;
    private String fullName;
    private Set<Post> posts = new HashSet<>();

    public User(String email,  String username, String fullName){
        this.email = email;
        this.username = username;
        this.fullName = fullName;
    }

    public User(String username, String fullName){
        this.username = username;
        this.fullName = fullName;
    }

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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", fullName='" + fullName + '\'' +
                ", posts=" + posts +
                '}';
    }
}

