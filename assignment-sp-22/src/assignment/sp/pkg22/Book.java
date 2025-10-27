package assignment.sp.pkg22;

/**
 *
 * @author IdeaPad
 */
public class Book {
    private int id;
    private String categoryName;

    public Book() {
    }

    public Book(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return id + ", " + categoryName;
    }
    
}
