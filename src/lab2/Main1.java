package lab2;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class TestAuthor {
    private Author author;


    public TestAuthor(Author author) {
        this.author = author;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Author author1 = new Author("KK", "k@;;", '-');
        System.out.println(author1.toString());



    }
}
