package com.example.moviecatalog;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    @GetMapping
    public List<Movie> getAllMovies() { return movies; }

    @PostMapping("/add")
    public String addMovie(@RequestParam String title,
                           @RequestParam String director,
                           @RequestParam int releaseYear) {
        Movie movie = new Movie(title, director, releaseYear);
        movies.add(movie);
        return "✅ Added movie: " + title;
    }

    @GetMapping("/search")
    public Object searchMovie(@RequestParam String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) return movie;
        }
        return "❌ Movie not found: " + title;
    }
}
