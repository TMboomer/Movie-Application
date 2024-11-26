import java.util.Scanner;

public class Movies {
    public static void main(String[] args) {
        // Array of movie genres
        String[] genres = {
                "Action",
                "Adventure",
                "Comedy",
                "Drama",
                "Fantasy",
                "Horror",
                "Science Fiction",
                "Romance",
                "Thriller",
                "Mystery",
                "Western",
                "Biography",
                "Documentary",
                "Musical/Dance",
                "Animation"
        };

         //Print the list of movie genres
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ": " + genres[i]);
        }

        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************************************");
        System.out.println("State your favourite Movie genre:");
        System.out.println("*************************************************");

        // Get the user input
        String selectedsGenre = scanner.nextLine();


        // Respond based on the chosen genre and return 5 movies for each genre
        switch (selectedsGenre) {
            case "Action":
                System.out.println("You selected Action!");
                System.out.println("Here are 5 popular Action movies:");
                System.out.println("1. The Avengers");
                System.out.println("2. Mad Max: Fury Road");
                System.out.println("3. John Wick");
                System.out.println("4. Inception");
                System.out.println("5. Terminator 2: Judgment Day");
                break;
            case "Adventure":
                System.out.println("You selected Adventure!");
                System.out.println("Here are 5 popular Adventure movies:");
                System.out.println("1. Indiana Jones and the Raiders of the Lost Ark");
                System.out.println("2. The Lord of the Rings: The Fellowship of the Ring");
                System.out.println("3. Jurassic Park");
                System.out.println("4. Pirates of the Caribbean: The Curse of the Black Pearl");
                System.out.println("5. Guardians of the Galaxy");
                break;
            case "Comedy":
                System.out.println("You selected Comedy!");
                System.out.println("Here are 5 popular Comedy movies:");
                System.out.println("1. The Princess Bride");
                System.out.println("2. Monty Python and the Holy Grail");
                System.out.println("3. Groundhog Day");
                System.out.println("4. Dumb and Dumber");
                System.out.println("5. Caddyshack");
                break;
            case "Drama":
                System.out.println("You selected Drama!");
                System.out.println("Here are 5 popular Drama movies:");
                System.out.println("1. The Shawshank Redemption");
                System.out.println("2. Forrest Gump");
                System.out.println("3. The Godfather");
                System.out.println("4. Schindler's List");
                System.out.println("5. 12 Angry Men");
                break;
            case "Fantasy!":
                System.out.println("You selected Fantasy!");
                System.out.println("Here are 5 popular Fantasy movies:");
                System.out.println("1. The Lord of the Rings: The Fellowship of the Ring");
                System.out.println("2. Harry Potter and the Sorcerer's Stone");
                System.out.println("3. The Princess Bride");
                System.out.println("4. Pan's Labyrinth");
                System.out.println("5. The Wizard of Oz");
                break;
            case "Horror":
                System.out.println("You selected Horror!");
                System.out.println("Here are 5 popular Horror movies:");
                System.out.println("1. The Shining");
                System.out.println("2. Alien");
                System.out.println("3. Halloween");
                System.out.println("4. The Exorcist");
                System.out.println("5. A Nightmare on Elm Street");
                break;
            case "Fiction!":
                System.out.println("You selected Science Fiction!");
                System.out.println("Here are 5 popular Science Fiction movies:");
                System.out.println("1. Star Wars: Episode IV - A New Hope");
                System.out.println("2. Blade Runner");
                System.out.println("3. Alien");
                System.out.println("4. Inception");
                System.out.println("5. The Matrix");
                break;
            case "Romance":
                System.out.println("You selected Romance!");
                System.out.println("Here are 5 popular Romance movies:");
                System.out.println("1. Titanic");
                System.out.println("2. The Notebook");
                System.out.println("3. When Harry Met Sally");
                System.out.println("4. Casablanca");
                System.out.println("5. Sleepless in Seattle");
                break;
            case "Thriller":
                System.out.println("You selected Thriller!");
                System.out.println("Here are 5 popular Thriller movies:");
                System.out.println("1. Silence of the Lambs");
                System.out.println("2. The Shining");
                System.out.println("3. Se7en");
                System.out.println("4. Inception");
                System.out.println("5. The Silence of the Lambs");
                break;
            case "Mystery":
                System.out.println("You selected Mystery!");
                System.out.println("Here are 5 popular Mystery movies:");
                System.out.println("1. The Silence of the Lambs");
                System.out.println("2. Se7en");
                System.out.println("3. Mulholland Drive");
                System.out.println("4. Memento");
                System.out.println("5. The Girl on the Train");
                break;
            case "Western":
                System.out.println("You selected Western!");
                System.out.println("Here are 5 popular Western movies:");
                System.out.println("1. The Good, the Bad and the Ugly");
                System.out.println("2. Unforgiven");
                System.out.println("3. True Grit");
                System.out.println("4. The Magnificent Seven");
                System.out.println("5. 3:10 to Yuma");
                break;
            case "Biography":
                System.out.println("You selected Biography!");
                System.out.println("Here are 5 popular Biography movies:");
                System.out.println("1. Schindler's List");
                System.out.println("2. Forrest Gump");
                System.out.println("3. Goodfellas");
                System.out.println("4. The Imitation Game");
                System.out.println("5. Walk the Line");
                break;
            case "Documentary":
                System.out.println("You selected Documentary!");
                System.out.println("Here are 5 popular Documentary movies:");
                System.out.println("1. March of the Penguins");
                System.out.println("2. Planet Earth");
                System.out.println("3. Food, Inc.");
                System.out.println("4. Man on Wire");
                System.out.println("5. The Fog of War");
                break;
            case "Musical":
                System.out.println("You selected Musical/Dance!");
                System.out.println("Here are 5 popular Musical/Dance movies:");
                System.out.println("1. Singin' in the Rain");
                System.out.println("2. West Side Story");
                System.out.println("3. La La Land");
                System.out.println("4. The Wizard of Oz");
                System.out.println("5. The Sound of Music");
                break;
            case "Dance":
                System.out.println("You selected Musical/Dance!");
                System.out.println("Here are 5 popular Musical/Dance movies:");
                System.out.println("1. Singin' in the Rain");
                System.out.println("2. West Side Story");
                System.out.println("3. La La Land");
                System.out.println("4. The Wizard of Oz");
                System.out.println("5. The Sound of Music");
                break;
            case "Animation":
                System.out.println("You selected Animation!");
                System.out.println("Here are 5 popular Animation movies:");
                System.out.println("1. Toy Story");
                System.out.println("2. Finding Nemo");
                System.out.println("3. Spirited Away");
                System.out.println("4. The Lion King");
                System.out.println("5. Frozen");
                break;
            default:
                System.out.println("Invalid input! This Genre does not exist");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}