package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

/*        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        universityLibrary.getBook();
        universityLibrary.returnBook();
        universityLibrary.getMagazine();
        universityLibrary.getNewspaper("Черкаський край.");*/

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);
        schoolLibrary.addBook("Ruslan", book);
        schoolLibrary.addMagazine();

/*        Book book = context.getBean("book", Book.class);
        universityLibrary.getBook(book);*/

//        schoolLibrary.getMagazine();
//        schoolLibrary.addBook();

        context.close();
    }
}
