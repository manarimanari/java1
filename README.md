# java1
projet java
Voici un résumé des étapes pour créer une application de gestion des produits :

### 1. Création du projet :
- Créer un projet Java sous NetBeans nommé **"H1"**.
- Ajouter les bibliothèques nécessaires : **Hibernate-JPA** et le **pilote MySQL**.

### 2. Créer l'entité `Produit` :
- Créer une classe `Produit` dans le package **`ma.projet.entity`**.
- Annoter la classe avec les annotations JPA comme **`@Entity`**, **`@Id`**, **`@GeneratedValue`**, **`@Column`**, et **`@Table`**.

### 3. Base de données MySQL :
- Créer une base de données nommée **"H1"** dans MySQL.

### 4. Configuration Hibernate :
- Créer le fichier **`hibernate.cfg.xml`** dans le package **`ma.projet.config`** pour configurer Hibernate (connexion à la base de données, mapping, etc.).

### 5. Classe HibernateUtil :
- Créer une classe **`HibernateUtil`** dans le package **`ma.projet.util`** pour gérer la création de l'instance **`SessionFactory`** (utilisée pour les transactions Hibernate).

### 6. Interface IDao :
- Créer une interface générique **`IDao`** dans le package **`ma.projet.dao`** pour définir les méthodes CRUD (Create, Read, Update, Delete).

### 7. Classe ProduitService :
- Créer la classe **`ProduitService`** dans le package **`ma.projet.service`**, qui implémente l'interface **`IDao`**.
- Implémenter les différentes méthodes pour gérer les produits (ajouter, afficher, supprimer, modifier, etc.).

### 8. Classe de test :
Dans une classe de test :
- Créer 5 produits.
- Afficher la liste des produits.
- Afficher les informations du produit avec **id = 2**.
- Supprimer le produit avec **id = 3**.
- Modifier les informations du produit avec **id = 1**.
- Afficher la liste des produits dont le prix est supérieur à **100 DH**.
- Afficher la liste des produits commandés entre deux dates (saisies au clavier).
