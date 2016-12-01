package movieList;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class MovieIO {
    static Movie getMovie(int index)
    {
        switch (index)
        {
            case 1:
                return new Movie("Citizen Kane", Category.drama);
            case 2:
                return new Movie("Casablanca", Category.drama);
            case 3:
                return new Movie("The Godfather", Category.drama);
            case 4:
                return new Movie("Gone With The Wind", Category.drama);
            case 5:
                return new Movie("Lawrence Of Arabia", Category.drama);
            case 6:
                return new Movie("The Wizard Of Oz", Category.musical);
            case 7:
                return new Movie("The Graduate", Category.drama);
            case 8:
                return new Movie("On The Waterfront", Category.drama);
            case 9:
                return new Movie("Schindler's List", Category.drama);
            case 10:
                return new Movie("Singin' In The Rain", Category.musical);
            case 11:
                return new Movie("It's A Wonderful Life", Category.drama);
            case 12:
                return new Movie("Sunset Boulevard", Category.drama);
            case 13:
                return new Movie("The Bridge On The River Kwai", Category.drama);
            case 14:
                return new Movie("Some Like It Hot", Category.drama);
            case 15:
                return new Movie("Star Wars", Category.scifi);
            case 16:
                return new Movie("All About Eve", Category.drama);
            case 17:
                return new Movie("The African Queen", Category.drama);
            case 18:
                return new Movie("Psycho" , Category.horror);
            case 19:
                return new Movie("Chinatown", Category.drama);
            case 20:
                return new Movie("One Flew Over The Cuckoo's Nest", Category.drama);
            case 21:
                return new Movie("The Grapes Of Wrath", Category.drama);
            case 22:
                return new Movie("2001: A Space Odyssey", Category.scifi);
            case 23:
                return new Movie("The Maltese Falcon", Category.drama);
            case 24:
                return new Movie("Raging Bull", Category.drama);
            case 25:
                return new Movie("E.T. The extra-terrestrial", Category.scifi);
            case 26:
                return new Movie("Dr. Strangelove", Category.drama);
            case 27:
                return new Movie("Bonnie And Clyde", Category.drama);
            case 28:
                return new Movie("Apocalypse Now", Category.drama);
            case 29:
                return new Movie("Mr. Smith Goes to Washington", Category.drama);
            case 30:
                return new Movie("The Treasure Of The Sierra Madre", Category.drama);
            case 31:
                return new Movie("Annie Hall", Category.comedy);
            case 32:
                return new Movie("The Godfather Part II", Category.drama);
            case 33:
                return new Movie("High Noon", Category.drama);
            case 34:
                return new Movie("To Kill A Mockingbird", Category.drama);
            case 35:
                return new Movie("It Happened One Night", Category.drama);
            case 36:
                return new Movie("Midnight Cowboy", Category.drama);
            case 37:
                return new Movie("The Best Years Of Our Lives", Category.drama);
            case 38:
                return new Movie("Double Indemnity", Category.drama);
            case 39:
                return new Movie("Doctor Zhivago", Category.drama);
            case 40:
                return new Movie("North By Northwest", Category.drama);
            case 41:
                return new Movie("West Side Story", Category.musical);
            case 42:
                return new Movie("Rear Window", Category.drama);
            case 43:
                return new Movie("King Kong", Category.horror);
            case 44:
                return new Movie("The Birth Of A Nation", Category.drama);
            case 45:
                return new Movie("A Streetcar Named Desire", Category.drama);
            case 46:
                return new Movie("A Clockwork Orange", Category.scifi);
            case 47:
                return new Movie("Taxi Driver", Category.drama);
            case 48:
                return new Movie("Jaws", Category.horror);
            case 49:
                return new Movie("Snow White And The Seven Dwarfs", Category.animated);
            case 50:
                return new Movie("Butch Cassidy And The Sundance Kid", Category.drama);
            case 51:
                return new Movie("The Philadelphia Story", Category.drama);
            case 52:
                return new Movie("From Here To Eternity", Category.drama);
            case 53:
                return new Movie("Amadeus", Category.drama);
            case 54:
                return new Movie("All Quiet On The Western Front", Category.drama);
            case 55:
                return new Movie("The Sound Of Music", Category.musical);
            case 56:
                return new Movie("M*A*S*H", Category.comedy);
            case 57:
                return new Movie("The Third Man", Category.drama);
            case 58:
                return new Movie("Fantasia", Category.animated);
            case 59:
                return new Movie("Rebel Without A Cause", Category.drama);
            case 60:
                return new Movie("Raiders Of The Lost Ark", Category.drama);
            case 61:
                return new Movie("Vertigo", Category.drama);
            case 62:
                return new Movie("Tootsie", Category.comedy);
            case 63:
                return new Movie("Stagecoach", Category.drama);
            case 64:
                return new Movie("Close Encounters Of The Third Kind", Category.scifi);
            case 65:
                return new Movie("The Silence Of The Lambs", Category.horror);
            case 66:
                return new Movie("Network", Category.drama);
            case 67:
                return new Movie("The Manchurian Candidate", Category.drama);
            case 68:
                return new Movie("An American In Paris", Category.drama);
            case 69:
                return new Movie("Shane", Category.drama);
            case 70:
                return new Movie("The French Connection", Category.drama);
            case 71:
                return new Movie("Forrest Gump", Category.drama);
            case 72:
                return new Movie("Ben-Hur", Category.drama);
            case 73:
                return new Movie("Wuthering Heights", Category.drama);
            case 74:
                return new Movie("The Gold Rush", Category.drama);
            case 75:
                return new Movie("Dances With Wolves", Category.drama);
            case 76:
                return new Movie("City Lights", Category.drama);
            case 77:
                return new Movie("American Graffiti", Category.drama);
            case 78:
                return new Movie("Rocky", Category.drama);
            case 79:
                return new Movie("The Deer Hunter", Category.drama);
            case 80:
                return new Movie("The Wild Bunch", Category.drama);
            case 81:
                return new Movie("Modern Times", Category.drama);
            case 82:
                return new Movie("Giant", Category.drama);
            case 83:
                return new Movie("Platoon", Category.drama);
            case 84:
                return new Movie("Fargo", Category.drama);
            case 85:
                return new Movie("Duck Soup", Category.comedy);
            case 86:
                return new Movie("Mutiny On The Bounty", Category.drama);
            case 87:
                return new Movie("Frankenstein", Category.horror);
            case 88:
                return new Movie("Easy Rider", Category.drama);
            case 89:
                return new Movie("Patton", Category.drama);
            case 90:
                return new Movie("The Jazz Singer", Category.drama);
            case 91:
                return new Movie("My Fair Lady", Category.musical);
            case 92:
                return new Movie("A Place In The Sun", Category.drama);
            case 93:
                return new Movie("The Apartment", Category.drama);
            case 94:
                return new Movie("Goodfellas", Category.drama);
            case 95:
                return new Movie("Pulp Fiction", Category.drama);
            case 96:
                return new Movie("The Searchers", Category.drama);
            case 97:
                return new Movie("Bringing Up Baby", Category.drama);
            case 98:
                return new Movie("Unforgiven", Category.drama);
            case 99:
                return new Movie("Guess Who's Coming To Dinner", Category.drama);
            case 100:
                return new Movie("Yankee Doodle Dandy", Category.musical);
            default:
                return new Movie("NO SUCH MOVIE", Category.animated);
        }
    }
}
