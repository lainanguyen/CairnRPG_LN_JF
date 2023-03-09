package src;

public class World {
    private String gameName;
    private String publisher;

    World() {
        gameName = "Fjord of Capybara's";
        publisher = "";
    }
    public World (String gameName, String publisher) {
        this.gameName = gameName;
        this.publisher = publisher;
    }
    // Getters and setters
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
