package practiseloops;

public class Min {
    public static void main(String[] args) {
        String str = "We have a larg inventory of things in our warehouse falling in "
        +"the category:apperal and the slightly "
                + "more in demand category:makeup along with the category:furniture and....";
        printCategories(str);


    }
    public static void printCategories(String str)
    {
        int i = 0;
        System.out.println(str.length());
        int firstIndex = str.indexOf(":") +1;
        int end = str.indexOf(".");
        System.out.println(firstIndex);

        int count = firstIndex;
        while(true)
        {
            int found = str.indexOf(":", i);
            if (found == -1) break;
            int start = found +1;
            int whitespace = str.indexOf(" ", start);
            System.out.println(str.substring(start, whitespace));
            i= whitespace +1;
        }
    }
}