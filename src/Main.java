import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Candidate> candidateRelevanceComparator = new CandidateRelevanceComparator();
        Comparator<Candidate> cadidateRatingomparator = new CandidateRatingComparator();
        Set<Candidate> set = new TreeSet<>(candidateRelevanceComparator.thenComparing(cadidateRatingomparator));

        set.add(new Candidate("Иванов Иван Иванович   ","м","25",4,3));
        set.add(new Candidate("Иванов1 Иван1 Иванович1","м","27",5,5));
        set.add(new Candidate("Иванов2 Иван2 Иванович2","м","28",3,4));
        set.add(new Candidate("Иванов3 Иван3 Иванович3","м","35",5,4));
        set.add(new Candidate("Иванов4 Иван4 Иванович4","м","39",3,5));
        set.add(new Candidate("Иванов5 Иван5 Иванович5","м","42",5,4));
        set.add(new Candidate("Иванов6 Иван6 Иванович6","м","21",1,2));
        set.add(new Candidate("Иванов7 Иван7 Иванович7","м","39",1,5));
        set.add(new Candidate("Иванов8 Иван8 Иванович8","м","40",4,2));
        set.add(new Candidate("Иванов9 Иван9 Иванович9","м","28",3,2));

        for (Candidate candidate : set) {
            System.out.println(candidate);
        }
    }
}