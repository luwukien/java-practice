package assignment.sp.pkg22;

/**
 *
 * @author IdeaPad
 */
public class Category extends Book{
    private int categoryId;
    private String title;
    private String author;
    private double price;

    public Category() {
        super();
    }
    
    public Category(int categoryId, String title, String author, double price, int id, String categoryName) {
        super(id, categoryName);
        this.categoryId = categoryId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.getId() + ", " + this.categoryId + ", " + this.title + ", " + this.author + ", " + this.price;
    }
    
    
}
