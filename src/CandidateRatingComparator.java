import java.util.Comparator;

public class CandidateRatingComparator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate o1, Candidate o2) {
        return Integer.compare(o2.getRating(), o1.getRating());
    }
}
