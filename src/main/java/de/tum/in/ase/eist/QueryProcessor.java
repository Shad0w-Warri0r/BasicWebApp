package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "maria";
        } else if (query.contains("what is") && query.contains("plus")) {
            String[] arr = query.split(" ");
            if (arr.length < 6) {
                return "";
            }
            int zahl1 = Integer.parseInt(arr[3]);
            int zahl2 = Integer.parseInt(arr[5]);
            int erg = zahl1 + zahl2;
            return "" + erg;
        } else { // TODO extend the programm here
            return "";
        }
    }
}
