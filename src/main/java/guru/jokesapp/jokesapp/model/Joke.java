package guru.jokesapp.jokesapp.model;

import org.springframework.stereotype.Component;

@Component
public class Joke {

    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
