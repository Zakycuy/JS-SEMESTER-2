package Quiz_1;

public class DataLibrary {
    public String title, author;
    public int borrowCount;
    public double cost;

    public void borrowCount () {
        borrowCount += borrowCount;
    }

    public void calculateRevenue() {

    }

    public DataLibrary (String title, String author,int borrowCount, double cost) {
        this.title = title;
        this.author = author;
        this.borrowCount = borrowCount;
        this.cost = cost;
    }
}
