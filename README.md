# TRPG

Ce repository simule un RPG textuel.
Le joueur est projeté dans une map en 2D et doit sortir sans mourir, sur son chemin se dressera des obstacles, des monstres, mais aussi des évenements neutres comme le magasin ou la fontaine.

## Packages et classes

Le code s'articule autour de 5 packages:

### map

Ce package comprend les classes GameMap, Position et Positionnable.
- `Position` définit la position sur la carte et quelques méthodes indispensables.
- `Positionnable` est une classe abstraite qui petmet à tous les éléments positionnables sur la carte de l'étendre. Elle oblige également la définition des méthodes liées à l'affichage sur la carte, ainsi que la résolution de l'évenement liée à la rencontre du joueur.
- `GameMap` crée la carte du jeu et implémente quelques méthodes essentielles, comme l'affichage ou la resolution du déplacement du joueur.

### healthy

Ce package omprend les classes qui possède des points de vie(hp).
- `Healthy` est une classe abstraite, qui étend Positionnable (toutes les entitées avec hp sont positionnable sur la carte). Elle comprend également l'attribut hp et quelques méthodes utiles.
- `Monster` est la classe qui définit les monstres. Elle implémente les méthodes abstraite de `Positionnable` ainsi que celle les permettant (pertde de hp et attaque).
- `Obstacle` est la classe qui définit les obstacles sur la carte. Elle implément les méthodes abstraites de `Positionnable`...
- Enfin `Player` est la classe abstraite définissant le joueur. Elle définit ses propriétés (xp, max hp, arme etc), aisni que beaucoup de méthodes permettant la résolution des évenements.

### encounterable

Ce package comprend les classes qui veulent implémenter `Positionnable` mais qui ne sont pas `healthy`.
- `WeaponStore` est la classe qui définit le marchand dans le jeu. Elle permet de montrer son inventaire et de vendre une arme de son magasin.
- `Fontain` est la classe qui petmet au joueur de se soigner. Elle ne définit aucunes méthodes hors celles demandées par `Positionnable`.

### weapon

Ce package comprend la classe abstraire `Weapon` ainsi que ses enfants.
- `Weapon` définit toutes les propriétées communes des armes, comme leur dégats ou leur prix, ainsi que quelques méthodes.
- `Axe`, `Hammer`, `Bow`, `Sword` sont les quatres types d'armes incluses dans le jeu, actuellement rien ne les différentie (Prochaine amélioration ?)

### race

Ce package comprend les classes enfants de `Player`. Actuellemt rien ne les différentie excepté leurs arme de départ.

### Main et NumberUtil

- `NumberUtil` est une classe `final` proposant une méthode `static` pour générer un nombre entre un min et un max.
- `Main` inclut toute l'initialisation et la boucle du jeu.

## Compilation et RUN

Après clonage: 
```
cd JAVA-TRPG
javac -d bin src/main/java/trpg/*.java
java -cp bin trpg.Main
```
Ou alors:
```
cd JAVA-TRPG
sh buildAndRun.sh
```
