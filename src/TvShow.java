public class TvShow {
    private String name;
    private int numEpisodes;
    private String genre;

    public TvShow(String name, int numEpisodes, String genre) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public TvShow(String name, int numEpisodes) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = "Drama";
    }

    public TvShow(String name, String genre) {
        this.name = name;
        this.numEpisodes = 100;
        this.genre = genre;
    }

    public TvShow(int numEpisodes, String genre) {
        this.name = "South Park";
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public TvShow(String name) {
        this.name = name;
        this.numEpisodes = 100;
        this.genre = "Drama";
    }

    public String getName() {
        return this.name;
    }

    public int getNumEpisodes() {
        return this.numEpisodes;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + this.name + " with " + this.numEpisodes + " number of episodes. The genre is " + this.genre;
    }
}
