package personne;

import annotation.Refactoring;
import annotation.RefactoringName;

@Refactoring(
        name = "Lorenzo",
        refactoringName = RefactoringName.extractClass,
        comment = "Create an Address class. ",
        isInEclipse = false,
        nbUseCases = 1
)
public class Personne {

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.rename,
            comment = "First letter in lowercase. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.encapsulatedField,
            comment = "Field should be private. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public String NomComplet;

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.rename,
            comment = "First letter in lowercase. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.encapsulatedField,
            comment = "Field should be private. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public int Age;

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.rename,
            comment = "First letter in lowercase. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.encapsulatedField,
            comment = "Field should be private. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.extractClass,
            comment = "Create an Address class. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public int NumRue;

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.rename,
            comment = "First letter in lowercase. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.encapsulatedField,
            comment = "Field should be private. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.extractClass,
            comment = "Create an Address class. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public String NomRue;

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.rename,
            comment = "First letter in lowercase. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.encapsulatedField,
            comment = "Field should be private. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.extractClass,
            comment = "Create an Address class. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public String Ville;

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.rename,
            comment = "First letter in lowercase. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.encapsulatedField,
            comment = "Field should be private. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.extractClass,
            comment = "Create an Address class. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public int CodePostale;


    public Personne (String nom,int age,int numrue,String nomrue, String ville,int codepostale) {
        this.NomComplet = nom;
        this.Age = age;
        this.NumRue = numrue;
        this.NomRue = nomrue;
        this.Ville = ville;
        this.CodePostale = codepostale;
    }

    @Refactoring(
            name = "Lorenzo",
            refactoringName = RefactoringName.extractMethod,
            comment = "Move in an Address class. ",
            isInEclipse = false,
            nbUseCases = 1
    )
    public void AfficherAdresse() {
        System.out.println("Numero de rue : " + NumRue);
        System.out.println("Nom de la rue : " + NomRue);
        System.out.println("Nom de la ville : " + Ville);
        System.out.println("CodePostale : " + CodePostale);
    }
}
