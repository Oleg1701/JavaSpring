package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

/*  @Before("execution(public void *(..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: спроба отримати книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: спроба повернути книгу");
    }

    @Before("execution(public void getBook(aop.Book))")
    public void beforeGetBookMethodAdvice() {
        System.out.println("beforeGetBookMethodAdvice: спроба отримати книгу");
    }*/

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddBookMethodAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        System.out.println("beforeAddBookMethodAdvice: логування спроба додати книгу");
        System.out.println("-------------------------------");
    }
}
