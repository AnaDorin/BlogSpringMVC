//package blog.controllers;
//
//import blog.models.User;
//import blog.repositories.PostRepository;
//import blog.services.CustomUserDetailsService;
//import blog.services.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller
//public class DashboardController {
//
//    @Autowired
//    private CustomUserDetailsService customUserDetailsService;
//
//    @Autowired
//    private PostService postService;
//
//    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
//    public ModelAndView dashboard() {
//        ModelAndView modelAndView = new ModelAndView("dashboard");
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        User user = customUserDetailsService.findUserByEmail(auth.getName());
//        modelAndView.addObject("currentUser", user);
//        modelAndView.addObject("fullName", "Welcome " + user.getFullname());
//        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
//        modelAndView.addObject("posts", postService.findByAuthor(user));
//        return modelAndView;
//    }
//}
