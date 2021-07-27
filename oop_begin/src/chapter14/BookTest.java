package chapter14;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
//        for (int i = 0 ; i < library.length ; i++){
//            System.out.println(library[i]); // null 값
//        }

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        // 깊은 복사
        for (int i = 0 ; i < library.length ; i++){
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        //System.arraycopy(library, 0, copyLibrary, 0, 5); // 얕은 복사(주소 복사)

        library[0].setAuthor("박원서");
        library[0].setTitle("나목"); // library, copylibrary 값 모두 바뀜(얕은 복사로 인해 같은 주소를 보고 있다)
        
        System.out.println("=====library=====");
        for (Book book : library){
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=====copy library=====");
        for (Book book : copyLibrary){
            System.out.println(book);
            book.showInfo();
        }
    }
}
