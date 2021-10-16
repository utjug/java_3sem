import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CW4_2 {

    public static void main(String[] args) throws IOException {
        String source = "Java is a programming language that is concurrent, classbased and object-oriented.";
        List<String> tokensList = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(source, " ,.");
        while(st.hasMoreTokens()){
            tokensList.add(st.nextToken()) ;
        }
        Set<String> tokensSet = new HashSet<String>(tokensList);
        tokensList = new ArrayList<String>(tokensSet);

        Iterator it = tokensList.iterator();
        while(it.hasNext()) {
            if (it.next().toString().length() < 3)
                it.remove();
        }

        Set<String> unsortedSet = new HashSet(tokensList);
        SortedSet<String> sortedSet = new TreeSet(unsortedSet);
        System.out.println(sortedSet);
    }
}
