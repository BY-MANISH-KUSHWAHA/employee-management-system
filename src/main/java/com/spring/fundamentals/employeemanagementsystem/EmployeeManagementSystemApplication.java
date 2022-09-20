package com.spring.fundamentals.employeemanagementsystem;

import LossCoupling_Decoupling.ContentFiltering;
import LossCoupling_Decoupling.MovieRecomandation;
import TightCoupling.RecommenderImplementation;
import com.spring.fundamentals.employeemanagementsystem.SpringBasedDependencyInjection.SpringMovieRecomandation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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

		System.out.println("---------- Spring Based Automanaging Dependencies -------------------------");
		ApplicationContext appContextObj = SpringApplication.run(EmployeeManagementSystemApplication.class,args);

		// Using the appContext
		// ==> Automating selected Filter class based on Component and Autowire @ will help to map
		SpringMovieRecomandation movieRecomandationSpring = appContextObj.getBean(SpringMovieRecomandation.class);
		List<String> finalResult = movieRecomandationSpring.recommandMovie("");
		System.out.println("SpringBasedDependencyInjection:"+finalResult);



		//SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
