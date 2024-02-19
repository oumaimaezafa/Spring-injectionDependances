# Spring-injectionDependances
Une activité pratique  sur  Inversion de contrôle et Injection des dépendances

<h3>Dans cette activité  on a abordé  plusieurs sujets :     </h3>
<p><b>Pour part 1:</b> On s'intersse  à developper une application  suivant le principe de couplage faible fermé au modification et ouverte à l'extension    qui basé sur le principe  de " dépendre des interfaces  plutôt que  des classes </p>
<p> C-à-d  l'application  doit fonctionner avec  n'importe quelle classe  implementant  l'interface et aussi on doit éviter utiliser le mot  clé  "new"  pour instancier des objets, réduisant ainsi le couplage fort entre les composants de l'application </p>

<p> On a traité  aussi le principe de l'injection des dépendances  a travers :  </p>

<ul>
<li>instanciation  statique: Cela consiste à créer les instances des dépendances directement dans le code. Cependant, cette approche peut rendre l'application difficile à maintenir, car tout changement dans les dépendances nécessite une modification du code source. comme j'ai montré dans la classe presantation  </li>
<li>instanciation dynamique : Cela ce fait on utilisant un fichier de configuration externe config.txt  qui permet de specifier les noms de versions a utiliser pendant la compilation , puis on utilise la classe "Classe " de java  pour que le programme charge cette derniere ensuite  crée des instances en utilisant la méthode newInstance()   </li>

<p>ou bien en utilisant le framwork  Spring  avec les version suivantes:</p>

<li>version XML :Il permet de déclarer les beans et leurs dépendances. Les éléments "bean" sont utilisés pour spécifier les classes à gérer, tandis que les balises "property" peuvent être utilisées pour définir les propriétés à injecter.</li>
<li>version annotations  : Dans cette version , les depandances sont specifies  dans le code Java à l'aide d'annotations telles que @Autowired qui permet au spring de chercher un objet de type IDAO  au moment lorsqu' on fait l'instanciation et @Component  qui marquer une classe en tant que composant géré par Spring </li>


</ul>