package blog.controllers;

import blog.models.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersController {

    @Autowired
    private User user;

    /**
     * Get a list of all posts in the database, it should be able to paginate and sort
     * http://localhost:8090/posts?page=0&size=3&sort=id
     *
     * @param model
     * @return
     */
//    @RequestMapping("/users")
//    public String index(Model model, @PageableDefault(sort = {"userName"}, value = 5) Pageable pageable){
//        // Get the content of the table, TODO. find a way to paginate
//        Page<User> users = this.userRepository.findAll();
//
//        // Define variables to be passed to view
//        model.addAttribute("users", users);
//        // Return the view model itself
//        return "users/index";
//    }
}
