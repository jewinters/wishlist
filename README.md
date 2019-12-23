To run Wishlist, simply run ./mvnw spring-boot:run in the root directory.

Pitch:
Keeping track of Christmas lists is hard in my family. I have 6 neices and nephews, 6 siblings, and 2 parents. For the neices and nephews, there are 8 people buying gifts for them. The purpose of this application is to keep track of wishlists for each person to avoid buying duplicate items. Instead of sending a dozen group texts to my siblings and parents, we can all use this application instead.

As far as user experience goes, a child should only be able to view their own list in order to add items. An adult should be able to view any list and see who has purchased any items. Right now the target market is my family. A future update would add the concept of Families to allow more than one family to use it. People in a family would only be able to see wishlists in their own family. This would open the target market up to any family or group with sufficiently complex gift-buying requirements.

The tech stack is a simple Springboot CRUD application using Thymeleaf to serve up a browser-based interface. Future state would include a persistent database, security/user management, a lot of UI improvements, and a containerized deployment strategy.

Things I learned:
1) Testing was going well until Springboot started throwing errors about dependencies not being found.
2) CSS is tricky in Thymeleaf and it took too long, so I gave up.
