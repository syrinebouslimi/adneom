######################### ADNEOM : Devoir maison JAVA #######################


##################################################   Sujet ##################################################  : 
Une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

Exemples d'entrées et sorties :

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

############################## Insctruction à utiliser pour executer ce projet #########################  : 

Il existe deux méthodes pour pouvoir exécuter le projet sur votre machine : 

1) soit : Récupérer le fichier « adneom-0.0.1-SNAPSHOT.jar »  existant dans le dossier « adneom/target ».
Dans votre projet java , importer et ajouter le jar en tant que jar externe ( build path -> configure java build path -> add external jars -> choisir le jar -> clicker sur OK )


2) soit : à partir de votre IDE, pour ma part c'est eclipse, File -> import -> Maven -> Existing maven projets; cliquez sur next et choisir le projet dans son emplacement. puis cocher pow.xml


///////////////Informations complémentaires////// : 

Pour vérifier mon implémentation, j'ai implémenté un test unitaire avec Junit5 
Gestion de dépendances : Maven

Réalisé par : Syrine BOUSLIMI
