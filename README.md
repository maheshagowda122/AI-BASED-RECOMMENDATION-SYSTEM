# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY: CODTECH IT SOLUTIONS

NAME: MAHESHA H N

INTERN ID: CT04DK29

DOMAIN: JAVA

DURATION: 4 WEEKS

MENTOR: NEELA SANTOSH

DESCRIPTION : The AI-Based Recommendation System built using Java and Apache Mahout is a powerful example of collaborative filtering, designed to suggest products or content to users based on their past preferences and the behavior of similar users. The core technology behind the system is Apache Mahout, an open-source library that provides scalable machine learning algorithms, particularly for recommendation engines. The system uses a user-based collaborative filtering approach, where user preferences are compared using similarity metrics like Pearson correlation to find like-minded users. Then, it recommends items that similar users have liked but the current user hasn’t interacted with yet.

The implementation involves using Java as the main programming language along with tools like Apache Maven for managing project dependencies. The recommendation logic reads user-item preference data from a CSV file, which contains user IDs, product IDs, and ratings. This CSV acts as the input data model for Mahout’s FileDataModel class. The recommendation process is handled by Mahout’s GenericUserBasedRecommender, which leverages a similarity algorithm and a neighborhood-based technique to produce accurate suggestions. The toolchain used includes Eclipse IDE for development, Mahout Core library (via Maven) for recommendation logic, and basic I/O streams to read user preferences. This system showcases how machine learning concepts can be applied effectively in Java to build smart, adaptive, and scalable recommendation engines useful in domains like e-commerce, content streaming, or online learning platforms.

OUTPUT :

User 1 recommendations:

  Item: 104 | Estimated preference: 3.8
  
  Item: 105 | Estimated preference: 3.5

User 2 recommendations:

  Item: 105 | Estimated preference: 4.2
  
  Item: 106 | Estimated preference: 2.9

User 3 recommendations:

  Item: 103 | Estimated preference: 4.1
  
  Item: 102 | Estimated preference: 3.6

User 4 recommendations:

  Item: 102 | Estimated preference: 2.7
  
  Item: 107 | Estimated preference: 3.4

User 5 recommendations:

  Item: 104 | Estimated preference: 3.6
  
  Item: 101 | Estimated preference: 3.9
