package fh.campus02.LivingRoom;

public class LivingRoom {
    public static void main(String[] args) {
        Book orwell1984 = new Book("George Orwell", "1984", 320);
        Book annaKarenina = new Book("Leo Tolstoy", "Anna Karenina", 1300);

        Bookcase bookcase = new Bookcase(8, "Classics", new Book[]{orwell1984, annaKarenina});

        bookcase.store();

        System.out.println(annaKarenina.getAuthor());
        annaKarenina.setPages(1000);

        System.out.println(annaKarenina.getPages());
    }
}
