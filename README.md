# pattern-project

       - The Factory Method pattern is used to create Pizza objects, with the PizzaFactory abstract class representing the creator, and MargheritaPizzaFactory and PepperoniPizzaFactory being concrete creators that return an instance of a MargheritaPizza or PepperoniPizza respectively.
       - The Template Method pattern is used in the PizzaMaker abstract class, which defines the skeleton of the algorithm for making a pizza and leaves the implementation of certain steps to the concrete subclasses MargheritaPizzaMaker and PepperoniPizzaMaker.
       - The State pattern is used in the PizzaOrder class, which maintains an internal state represented by the OrderState interface and its various concrete implementations (PendingState, InProgressState, CompletedState).
       - The Decorator pattern is used in the CheeseDecorator and MushroomDecorator classes, which add new behavior to a Pizza object by wrapping it in an object of the decorator class.
