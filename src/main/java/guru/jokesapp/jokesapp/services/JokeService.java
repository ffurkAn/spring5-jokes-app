package guru.jokesapp.jokesapp.services;

import guru.jokesapp.jokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public interface JokeService {

    Joke getRandomJoke();
}
