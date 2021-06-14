package ex39;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> m1, Map<String, String> m2) {
            return m1.get("Last Name").compareTo(m2.get("Last Name"));
        }
    };

    public static void main( String[] args )
    {
        //List<Map<String, String>> maps = new List<Map<String, String>>();
        List<HashMap<String, String>> records = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> John = new HashMap<String, String>();
        John.put("First Name", "John");
        John.put("Last Name", "Johnson");
        John.put("Position", "Manager");
        John.put("Separation Date", "2016-12-31");
        records.add(John);

        HashMap<String, String> Tou = new HashMap<String, String>();
        Tou.put("First Name", "Tou");
        Tou.put("Last Name", "Xiong");
        Tou.put("Position", "Software Engineer");
        Tou.put("Separation Date", "2016-10-05");
        records.add(Tou);

        HashMap<String, String> Michaela = new HashMap<String, String>();
        Michaela.put("First Name", "Michaela");
        Michaela.put("Last Name", "Michaelson");
        Michaela.put("Position", "District Manager");
        Michaela.put("Separation Date", "2015-12-19");
        records.add(Michaela);

        HashMap<String, String> Jake = new HashMap<String, String>();
        Jake.put("First Name", "Jake");
        Jake.put("Last Name", "Jacobson");
        Jake.put("Position", "Programmer");
        Jake.put("Separation Date", "");
        records.add(Jake);

        HashMap<String, String> Jacquelyn = new HashMap<String, String>();
        Jacquelyn.put("First Name", "Jacquelyn");
        Jacquelyn.put("Last Name", "Jackson");
        Jacquelyn.put("Position", "Programmer");
        Jacquelyn.put("Separation Date", "");
        records.add(Jacquelyn);

        HashMap<String, String> Sally = new HashMap<String, String>();
        Sally.put("First Name", "Sally");
        Sally.put("Last Name", "Webber");
        Sally.put("Position", "Web Developer");
        Sally.put("Separation Date", "2015-12-18");
        records.add(Sally);

        Collections.sort(records, mapComparator);

        for(HashMap<String, String> record : records) {
            System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Separation Date");
            System.out.println("---------------------|----------------------|-----------------");
            System.out.printf("%s %s | %20s | %20s\n", record.get("First Name"), record.get("Last Name"), record.get("Position"), record.get("Separation Date"));
            /*System.out.printf("| Position %10s", "");
            System.out.printf("| Separation Date %20s \n", "");
            System.out.printf("-------------------------");
            System.out.printf("|%s ", "-------------------");
            System.out.printf("|----------------------- \n");
            System.out.printf("%s %s %10s", record.get("First Name"), record.get("Last Name"), "");
            System.out.printf("| %s %10s", record.get("Position"), "");
            System.out.printf("| %s %10s\n", record.get("Separation Date"), "");*/

        }

        System.out.println( "Hello World!" );
    }
}
