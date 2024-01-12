package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v1;

/*
Version 1 - Basic way of defining a class to create an object. Whenever we need to create an object of this class, we
will call new Student() and then assign new values to its fields.

Drawbacks
1. Client stay tightly coupled with the Student concrete class implementation.
2. How to copy private attributes in this way?
3. Problem with copying child classes
4. If else block in client.java voilates SRP and OCP.
*/
public class IntelligentStudent extends Student {
    public double psp;
    public int iq;
}
