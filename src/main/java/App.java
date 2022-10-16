import introspection.Appartement;
import introspection.AppartementResidence;
import personne.Personne;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        showPersonneAnnotation();

        System.out.println("\n Interfaces : \n");
        System.out.println(toStringInterface(Appartement.class));
        System.out.println(toStringInterface(AppartementResidence.class));

    }

    public static void showPersonneAnnotation() {
        Class<Personne> personneClass = Personne.class;

        System.out.println("Class annotations : ");
        System.out.println(Arrays.toString(personneClass.getAnnotations()));

        System.out.println("Field annotations : ");
        Arrays.stream(personneClass.getFields()).forEach(field -> System.out.println(Arrays.toString(field.getAnnotations())));

        System.out.println("Method annotations : ");
        Arrays.stream(personneClass.getDeclaredMethods()).forEach(method -> System.out.println(Arrays.toString(method.getAnnotations())));
    }

    public static String toStringInterface(Class<?> objectClass) {
        String className = objectClass.getSimpleName();

        Class<?>[] interfaceArray = objectClass.getInterfaces();

        Class<?> superclass = objectClass.getSuperclass();
        String superclassName = "I" + objectClass.getSuperclass().getSimpleName();

        Method[] methodArray = objectClass.getDeclaredMethods();
        Method[] superclassMethodArray = superclass.getDeclaredMethods();


        // Interface declaration.
        StringBuilder result = new StringBuilder();
        result.append("public interface " + "I").append(className);

        // Extends.
        result.append(" extends ");
        Arrays.stream(interfaceArray).forEach(x -> result.append(x.getSimpleName()).append(", "));
        result.append(superclassName);

        result.append(" {\n");

        // Add methods.
        Arrays.stream(methodArray)
                .filter(method -> Modifier.isPublic(method.getModifiers()) && !Arrays.stream(superclassMethodArray).toList().contains(method))
                .forEach(method -> {
                            // Method declaration.
                            result.append("\t").append(method.getReturnType().getSimpleName()).append(" ");

                            // Method parameters.
                            result.append(method.getName()).append("(");
                            Arrays.stream(method.getParameters()).forEach(parameter -> {
                                result.append(parameter.getType().getSimpleName()).append(" ").append(parameter.getName());
                            });
                            result.append(");\n");
                        }
                );

        result.append("}");

        return result.toString();
    }
}
