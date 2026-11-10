# patron-abstract-factory - Patron de construction : Abstract Factory

Devoir INF4067 / INF461 - Design Patterns : patrons de construction.

Auteur : TASSOLIMO Zita - Matricule 23U2313

## Organisation du code

```
src/
  cours/     -> code source de l'exemple vu en cours
  modifie/   -> code source de l'exemple modifie
```

## Compilation et execution (Java 8+)

```bash
javac -d bin $(find src -name "*.java")
java -cp bin <classe principale>
```

| Classe principale | Exemple |
|---|---|
| `cours.abstractfactory.Client` | exemple du cours (2 familles) |
| `modifie.abstractfactory.Client` | exemple modifie (3 familles, famille choisie a l'execution) |

Sous Windows (PowerShell) : `javac -d bin (Get-ChildItem -Recurse src -Filter *.java).FullName`
