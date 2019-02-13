package blog.services;

import blog.models.Post;
import blog.models.User;
import blog.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @ModelAttribute("posts")
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @ModelAttribute("create")
    public Post createPost(Post post, String userEmail){
        User user = customUserDetailsService.findUserByEmail(userEmail);

        post.setAuthor(user);
        user.addPost(post);

        return postRepository.save(post);
    }



    public Optional<Post> findById(Post post){
        return postRepository.findById(post.getId());
    }

    public Set<Post> findByAuthor(User author) {
        return postRepository.findByAuthor(author);
    }

//
//
//    public List<Post> findLatest5() {
//        return this.posts.stream()
//                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
//                .limit(5)
//                .collect(Collectors.toList());
//    }
//
//
//
//
//    public Post create(Post post) {
//        post.setId(this.posts.stream().mapToLong(
//                p -> p.getId()).max().getAsLong() + 1);
//        this.posts.add(post);
//        return post;
//    }
//
//
//    public Post edit(Post post) {
//        for (int i = 0; i < this.posts.size(); i++) {
//            if (Objects.equals(this.posts.get(i).getId(), post.getId())) {
//                this.posts.set(i, post);
//                return post;
//            }
//        }
//        throw new RuntimeException("Post not found: " + post.getId());
//    }
//
//
//    public void deleteById(Long id) {
//        for (int i = 0; i < this.posts.size(); i++) {
//            if (Objects.equals(this.posts.get(i).getId(), id)) {
//                this.posts.remove(i);
//                return;
//            }
//        }
//        throw new RuntimeException("Post not found: " + id);
//    }
}
