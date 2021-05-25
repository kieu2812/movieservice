package com.movieservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/movies/movie")
    public Movie getAllMovie(){
        List<Credit> creditList =  new ArrayList<>();
        Movie movie = new Movie("The Godfather", 175, "Crime, Drama", 9.2f, 100,
                "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                1561591, 134.97, "1972", creditList);

        Person person1 =  new Person("Director","Francis Ford", "Copolla");
        Person person2 =  new Person("Star","Marlon", "Brando");
        Person person3 =  new Person("Star","Al", "Pacino");
        Person person4 =  new Person("Star","James", "Caan");
        Person person5 =  new Person("Star","Diane", "Keaton");

        Credit credit1 =  new Credit(person1);
        Credit credit2 =  new Credit(person2);
        Credit credit3 =  new Credit(person3);
        Credit credit4 =  new Credit(person4);
        Credit credit5 =  new Credit(person5);


        creditList.add(credit1);
        creditList.add(credit2);
        creditList.add(credit3);
        creditList.add(credit4);
        creditList.add(credit5);

        movie.setCredits(creditList);
        return movie;


    }
    @PostMapping("/movies/gross/total")
    public GrossTotal calculateTotal(@RequestBody List<Movie> movies){
        GrossTotal grossTotal=new GrossTotal();
        grossTotal.setResult(movies.stream().mapToInt(m->{
            System.out.println(m);
            return (int) Math.floor(m.getGross());}).sum());
        System.out.println(grossTotal.getResult());
        return grossTotal;

    }
}
