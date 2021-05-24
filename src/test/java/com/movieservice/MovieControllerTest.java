package com.movieservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MovieController.class)
public class MovieControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetMovies() throws Exception {

        String requestBodyStr = "  {\n" +
                "    \"Title\": \"The Godfather\",\n" +
                "    \"Minutes\": 175,\n" +
                "    \"Genre\": \"Crime, Drama\",\n" +
                "    \"Rating\": 9.2,\n" +
                "    \"Metascore\": 100,\n" +
                "    \"Description\": \"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.\",\n" +
                "    \"Votes\": 1561591,\n" +
                "    \"Gross\": 134.97,\n" +
                "    \"Year\": \"1972\",\n" +
                "    \"Credits\": [\n" +
                "        {\n" +
                "            \"Person\": {\n" +
                "                \"Role\": \"Director\",\n" +
                "                \"FirstName\": \"Francis Ford\",\n" +
                "                \"LastName\": \"Copolla\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"Person\": {\n" +
                "                \"Role\": \"Star\",\n" +
                "                \"FirstName\": \"Marlon\",\n" +
                "                \"LastName\": \"Brando\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"Person\": {\n" +
                "                \"Role\": \"Star\",\n" +
                "                \"FirstName\": \"Al\",\n" +
                "                \"LastName\": \"Pacino\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"Person\": {\n" +
                "                \"Role\": \"Star\",\n" +
                "                \"FirstName\": \"James\",\n" +
                "                \"LastName\": \"Caan\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"Person\": {\n" +
                "                \"Role\": \"Star\",\n" +
                "                \"FirstName\": \"Diane\",\n" +
                "                \"LastName\": \"Keaton\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        RequestBuilder requestBuilder = get("/movies/movie")
                .contentType(MediaType.APPLICATION_JSON);
        this.mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.Title", is("The Godfather")))
                .andExpect(jsonPath("$.Credits.[0].Person.Role", is("Director")))       ;

    }

}
