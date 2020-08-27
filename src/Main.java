public class Main {
    public static void main(String[] args) {
        MyList list = new MyArrayList();

        list.add("America");
        System.out.println("1. " + list);

        list.add(0,"Canada");
        System.out.println("2. " + list);

        list.add("Russia");
        System.out.println("3. " + list);

        list.add("France");
        System.out.println("4. " + list);

        list.add(2,"Germany");
        System.out.println("5. " + list);
        for (String s: list) {
            System.out.println(s.toUpperCase() + " ");
        }
    }
}
