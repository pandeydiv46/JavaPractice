public class TableOfaNumber {
    public static void main(String[] args) {
        int tab = 0;
        System.out.println("table of 2=");
        Table();
    }
    static int Table()
    {
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            int table = a * i;
            System.out.println(table);
        }
        return a;
    }
}