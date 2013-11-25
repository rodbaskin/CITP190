/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: MovieApp.java
*            ***            # Project Name: Workbook Assignment 12-1
*             *             # Description: Here is my Movie List program.
*                           ====================================================
*      *              *
*     ***            ***
*   *******        *******
*    *****          *****
*     ***            ***
*      *              *
*
*
*/

package MovieList;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

    public static void main (String args[])
    {
        System.out.println("Welcome to the Movie List Application.");
        System.out.println("There are 100 movies on the list.");


        Scanner sc = new Scanner(System.in);

        String choice = "y";

        ArrayList<Movie> MyListOfMovies = CreateArrayList();

        System.out.println(MyListOfMovies.size());


        while (choice.equalsIgnoreCase("y"))
        {
            System.out.println("There are four categories: animated, drama, horror, and scifi");
            System.out.println();

            String personMovieCategory = Validator.getRequiredString(sc, "What category are you interested in?");

            for (int i = 0; i < MyListOfMovies.size(); i++){
                if (personMovieCategory.equalsIgnoreCase("animated"))
                {
                    MyListOfMovies.remove();
                }
                if (personMovieCategory.equalsIgnoreCase("drama"))
                {

                }
                if (personMovieCategory.equalsIgnoreCase("horror"))
                {

                }
                if (personMovieCategory.equalsIgnoreCase("scifi"))
                {

                }
            }

            choice = Validator.getRequiredString(sc, "Continue? (y/n): ");
            System.out.println();

        }
    }

    public static ArrayList<Movie> CreateArrayList()
    {
        Movie m;
        ArrayList<Movie> CreatingArrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++ )
        {
            m = MovieIO.getMovie(i);

            CreatingArrayList.add(m);
        }
        return CreatingArrayList;

    }
}