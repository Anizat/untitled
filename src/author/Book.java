package author;

public class Book {

    private String title;
    private String description;
    private double price;
    private int count;

    public Book (){

    }

    Book (String title, String description, double price, int count){
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle (){
        this.title = title;
    }
    public String getDescription() {
    return this.description;
    }

    public void setDescription(){
        this.description = description;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(){
        this.count = count;
    }

    @Override
    public String toString(){
        return "Author" + "title = " + title +'\'' + ", description = " + description +'\'' +
                ", price = " + price + '\'' + ", count = " + count + '\'';}
}
