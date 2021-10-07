import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String post = scan.nextLine();
        int candNum = scan.nextInt();
        scan.nextLine();
        ArrayList<String> listOfCandidates = new ArrayList<String>();
        for(int i = 0; i < candNum; ++i)
            listOfCandidates.add(scan.nextLine());
        int votes = scan.nextInt();
        scan.nextLine();
        ArrayList<String> listOfVotes = new ArrayList<String>();
        for(int i = 0; i < votes; ++i)
        listOfVotes.add(scan.nextLine());
        ElectionPost epost = new ElectionPost(post, listOfCandidates, listOfVotes);
        epost.display();
        epost.ascendDisplay();
        epost.descendDisplay();  
        scan.close();
    }
}

interface sortVotes {
    void ascendDisplay();
    void descendDisplay();
}

class ElectionPost implements sortVotes{
    String nameOfThePost;
    ArrayList<String> listOfCandidates;
    ArrayList<String> votesEntered;

    public ElectionPost(String nameOfThePost, ArrayList<String> listOfCandidates, ArrayList<String> votesEntered) {
        this.nameOfThePost = nameOfThePost;
        this.listOfCandidates = listOfCandidates;
        this.votesEntered = votesEntered;
    }

    void display() {
        System.out.println(nameOfThePost);
        //no method to not change the array? 
        //Collections.sort(listOfCandidates);
        for (String i : listOfCandidates) 
            System.out.println(i);
    }

    public void ascendDisplay() {
        HashMap<String, Integer> votes = new HashMap<>();
        for(String i : votesEntered) {
            if(votes.get(i) == null)
                votes.put(i, 1);
            else 
                votes.put(i, votes.get(i)+1);
        }
        Map<String, Integer> tm = new TreeMap<String, Integer> (new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(votes.get(o1) > votes.get(o2)) 
                    return 1;
                else if(votes.get(o1) < votes.get(o2))
                    return -1;
                return 0;
            }
        });
        tm.putAll(votes);
        for(Map.Entry<String, Integer> entry : tm.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        // System.out.println(tm);
    }

    public void descendDisplay() {
        HashMap<String, Integer> votes = new HashMap<>();
        for(String i : votesEntered) {
            if(votes.get(i) == null)
                votes.put(i, 1);
            else 
                votes.put(i, votes.get(i)+1);
        }
        Map<String, Integer> tm = new TreeMap<String, Integer> (new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(votes.get(o1) < votes.get(o2)) 
                    return 1;
                else if(votes.get(o1) > votes.get(o2))
                    return -1;
                return 0;
            }
        });
        tm.putAll(votes);
        for(Map.Entry<String, Integer> entry : tm.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
}
}