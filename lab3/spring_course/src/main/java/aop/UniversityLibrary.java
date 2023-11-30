package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Ми беремо книгу із UniversityLibrary.");
    }

    String returnBook() {
        System.out.println("Повертаємо книгу.");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Ми беремо журнал із UniversityLibrary.");
    }

    public void getNewspaper(String newspaper) {
        System.out.println("Ми беремо газету із UniversityLibrary - " + newspaper);
    }

    public void getBook(Book book) {
        System.out.println("Ми беремо книгу із UniversityLibrary - " + book.getName());
    }
}
