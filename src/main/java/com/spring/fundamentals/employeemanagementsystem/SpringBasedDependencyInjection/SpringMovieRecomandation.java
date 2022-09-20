package com.spring.fundamentals.employeemanagementsystem.SpringBasedDependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringMovieRecomandation {
    @Autowired
    private SpringMovieFilters filter;

    public SpringMovieRecomandation(SpringMovieFilters filter) {
        super();
        this.filter = filter;
    }

    public List<String> recommandMovie(String movie){
        // suppose based on rating all movies are sorted.
        return filter.getRecommandations();

    }


}
