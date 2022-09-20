package com.spring.fundamentals.employeemanagementsystem;

import com.spring.fundamentals.employeemanagementsystem.LossCoupling.ContentFiltering;
import com.spring.fundamentals.employeemanagementsystem.LossCoupling.MovieRecomandation;
import com.spring.fundamentals.employeemanagementsystem.TightCoupling.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("----------------- Tight Coupling --------------------------");
		RecommenderImplementation recommendations = new RecommenderImplementation();
		String[] resultMovies = recommendations.recommandMovie("Empty");
		System.out.println(Arrays.toString(resultMovies));
		System.out.println();


		System.out.println("---------- Decoupling/Loss Coupling -------------------------");
		MovieRecomandation movieRecomandation = new MovieRecomandation(new ContentFiltering());
		List<String> filteredResult = movieRecomandation.recommandMovie("");
		System.out.println(filteredResult);

		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
