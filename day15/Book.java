public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	private boolean isAvailable;
	//Constructor
    public Book(int id, String title, String author, double price, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    //Settes & Getters
    public int getId() {
        return id;
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
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", isAvailable="
                + isAvailable + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id != other.id)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (isAvailable != other.isAvailable)
            return false;
        return true;
    }  
}
