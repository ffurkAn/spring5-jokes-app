package guru.jokesapp.jokesapp.services.impl;

import guru.jokesapp.jokesapp.model.Joke;
import guru.jokesapp.jokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public Joke getRandomJoke() {

        Joke j = new Joke();
        j.setJoke(new ChuckNorrisQuotes().getRandomQuote());

        return j;
    }
}
