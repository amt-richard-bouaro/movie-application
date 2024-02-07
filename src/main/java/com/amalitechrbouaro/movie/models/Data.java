package com.amalitechrbouaro.movie.models;

import java.util.ArrayList;
import java.util.List;

public class Data {
    
    private List<Movie> movies = new ArrayList<>();
    
    
    public Data() {
        
        Movie movie1 = new Movie();
        movie1.setImdbId("tt3915174");
        movie1.setTitle("Puss in Boots: The Last Wish");
        movie1.setReleaseDate("2022-12-21");
        movie1.setTrailerLink("https://www.youtube.com/watch?v=tHb7WlgyaUc");
        movie1.setGenres(List.of("Animation", "Action", "Adventure", "Comedy", "Family"));
        movie1.setPoster("https://image.tmdb.org/t/p/w500/1NqwE6LP9IEdOZ57NCT51ftHtWT.jpg");
        movie1.setBackdrops(List.of("https://image.tmdb.org/t/p/original/r9PkFnRUIthgBp2JZZzD380MWZy.jpg",
                "https://image.tmdb.org/t/p/original/faXT8V80JRhnArTAeYXz0Eutpv9.jpg"
        
        ));
        
        movies.add(movie1);
        
        Movie movie2 = new Movie();
        movie2.setImdbId("tt1630029");
        movie2.setTitle("Avatar: The Way of Water");
        movie2.setReleaseDate("2022-12-16");
        movie2.setTrailerLink("https://www.youtube.com/watch?v=d9MyW72ELq0");
        movie2.setGenres(List.of("Science Fiction", "Action", "Adventure"));
        movie2.setPoster("https://image.tmdb.org/t/p/w500/t6HIqrRAclMCA60NsSmeqe9RmNV.jpg");
        movie2.setBackdrops(List.of("https://image.tmdb.org/t/p/original/s16H6tpK2utvwDtzZ8Qy4qm5Emw.jpg",
                "https://image.tmdb.org/t/p/original/zaapQ1zjKe2BGhhowh5pM251Gpl.jpg"));
        
        movies.add(movie2);
        
        Movie movie3 = new Movie();
        movie3.setImdbId("tt8760708");
        movie3.setTitle("M3GAN");
        movie3.setReleaseDate("2023-01-06");
        movie3.setTrailerLink("https://www.youtube.com/watch?v=BRb4U99OU80");
        movie3.setGenres(List.of("Science Fiction", "Horror", "Comedy"));
        movie3.setPoster("https://image.tmdb.org/t/p/w500/xBl5AGw7HXZcv1nNXPlzGgO4Cfo.jpg");
        movie3.setBackdrops(List.of("https://image.tmdb.org/t/p/original/5kAGbi9MFAobQTVfK4kWPnIfnP0.jpg",
                "https://image.tmdb.org/t/p/original/dlxzUj7z1MqEcFiwvvrj0bvBKDY.jpg"));

        movies.add(movie3);
        
        Movie movie4 = new Movie();
        movie4.setImdbId("tt11116912");
        movie4.setTitle("Troll");
        movie4.setReleaseDate("2022-12-01");
        movie4.setTrailerLink("https://www.youtube.com/watch?v=AiohkY_XQYQ");
        movie4.setGenres(List.of("Fantasy", "Action", "Adventure"));
        movie4.setPoster("https://image.tmdb.org/t/p/w500/9z4jRr43JdtU66P0iy8h18OyLql.jpg");
        movie4.setBackdrops(List.of(
                "https://image.tmdb.org/t/p/original/53BC9F2tpZnsGno2cLhzvGprDYS.jpg",
                "https://image.tmdb.org/t/p/original/682Ui5DwZDdbIPzKAEOR7cJlMXa.jpg"
                
        ));

        movies.add(movie4);
        
    }
    
    public List<Movie> getMovies() {
        return movies;
    }
}
