public class Candidate {
    private String name;
    private String floor;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String name, String floor, String age, int relevance, int rating) {
        this.name = name;
        this.floor = floor;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name+", "+relevance+", "+rating;
    }
}
