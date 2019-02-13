package blog.controllers;

import blog.models.Post;
import blog.models.User;
import blog.services.CustomUserDetailsService;
import blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PostsController {

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Autowired
    private PostService postService;

    @GetMapping(value = "/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView();
        Post post = new Post();
        modelAndView.addObject("post", post);
        modelAndView.setViewName("create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid Post post, BindingResult bindingResult) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("post", postService.createPost(post, auth.getName()));
        return modelAndView;
    }
}
