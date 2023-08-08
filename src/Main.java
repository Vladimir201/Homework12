public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Виктор", "Пелевин");
        Book book1 = new Book("Чапаев и пустота", author1, 1996);
        book1.setPublishingYear(1996);

        System.out.println("Книга : " + book1.getBookName());
        System.out.println("Автор : " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Год издания : " + book1.getPublishingYear());
        System.out.println(" ");

        Author author2 = new Author("Иван", "Гончаров");
        Book book2 = new Book("Обыкновенная история", author2, 1844);
        book2.setPublishingYear(1847);

        System.out.println("Книга : " + book2.getBookName());
        System.out.println("Автор : " + author2.getFirstName() + " " + author2.getLastName());
        System.out.println("Год издания : " + book2.getPublishingYear());
    }
}