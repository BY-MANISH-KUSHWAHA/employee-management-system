package LossCoupling_Decoupling;


import java.util.List;

public class MovieRecomandation {
    private MovieFilters filter;

    public MovieRecomandation(MovieFilters filter) {
        this.filter = filter;
    }

    public List<String> recommandMovie(String movie){
        // suppose based on rating all movies are sorted.
        return filter.getRecommandations();

    }
}
