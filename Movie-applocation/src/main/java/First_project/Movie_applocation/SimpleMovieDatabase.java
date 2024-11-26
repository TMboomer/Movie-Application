package First_project.Movie_applocation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; // Import ResultSet
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMovieDatabase {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/movie_db"; // Update with your DB URL
    private static final String DB_USER = "root"; // Update with your MySQL username
    private static final String DB_PASSWORD = "Tumelo@18082000"; // Update with your MySQL password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MovieDatabase> movies = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Movie");
            System.out.println("2. View All Movies");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (choice == 1) {
                // Add movie
                System.out.print("Enter movie title: ");
                String title = scanner.nextLine();

                System.out.print("Enter genre: ");
                String genre = scanner.nextLine();

                System.out.print("Enter rating (0-5): ");
                double rating = scanner.nextDouble();

                movies.add(new MovieDatabase(title, genre, rating));
                storeMovieInDatabase(title, genre, rating);
                System.out.println("Movie added successfully!");
            } else if (choice == 2) {
                // View all movies
                movies = fetchMoviesFromDatabase(); // Fetch movies from the database
                System.out.println("\nMovie List:");
                System.out.println("-------------------");

                if (movies.isEmpty()) {
                    System.out.println("No movies in database!");
                } else {
                    for (MovieDatabase movie : movies) {
                        System.out.println("Title: " + movie.title);
                        System.out.println("Genre: " + movie.genre);
                        System.out.println("Rating: " + movie.rating);
                        System.out.println("-------------------");
                    }
                }
            } else if (choice == 3) {
                // Exit
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }

        scanner.close();
    }

    private static void storeMovieInDatabase(String title, String genre, double rating) {
        String insertSQL = "INSERT INTO movies (title, genre, rating) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setString(1, title);
            preparedStatement.setString(2, genre);
            preparedStatement.setDouble(3, rating);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error while inserting movie: " + e.getMessage());
        }
    }

    // Add the fetchMoviesFromDatabase method here
    private static ArrayList<MovieDatabase> fetchMoviesFromDatabase() {
        ArrayList<MovieDatabase> movies = new ArrayList<>();
        String selectSQL = "SELECT title, genre, rating FROM movies";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String genre = resultSet.getString("genre");
                double rating = resultSet.getDouble("rating");
                movies.add(new MovieDatabase(title, genre, rating));
            }

        } catch (SQLException e) {
            System.out.println("Error while fetching movies: " + e.getMessage());
        }
        return movies;
    }
}