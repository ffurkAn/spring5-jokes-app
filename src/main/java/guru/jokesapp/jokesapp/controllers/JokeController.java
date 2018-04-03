package guru.jokesapp.jokesapp.controllers;


import guru.jokesapp.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model){

        model.addAttribute("chucknorris", jokeService.getRandomJoke());

        return "chucknorris";
    }
}
