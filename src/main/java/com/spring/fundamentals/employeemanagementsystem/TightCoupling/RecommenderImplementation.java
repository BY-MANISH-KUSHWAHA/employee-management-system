package com.spring.fundamentals.employeemanagementsystem.TightCoupling;

public class RecommenderImplementation {
    public String[] recommandMovie(String movie){
        // suppose based on rating all movies are sorted.
        ContentFiltering filtering = new ContentFiltering();
        String[] filteredResult = filtering.getRecommandations("Avengers");
        return filteredResult;
    }
}
