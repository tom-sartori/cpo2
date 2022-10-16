package annotation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Refactorings.class)
public @interface Refactoring {

    String name();
    RefactoringName refactoringName();
    String comment();
    boolean isInEclipse();
    int nbUseCases();
}
