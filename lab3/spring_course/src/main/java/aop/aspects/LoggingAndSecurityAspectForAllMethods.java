package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspectForAllMethods {

/*    @Pointcut("execution(* aop.SchoolLibrary.*(..))")
    private void allMethodsFromSchoolLibrary() {
    }

    @Pointcut("execution(public void aop.SchoolLibrary.returnMagazine())")
    private void returnMegazineFromSchoolLibrary() {
    }

    @Pointcut("allMethodsFromSchoolLibrary() && !returnMegazineFromSchoolLibrary()")
    private void allMethodsExceptReturnMagazineFromSchoolLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromSchoolLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }*/
}
