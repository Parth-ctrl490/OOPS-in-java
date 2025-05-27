// 3. Method-Level Encapsulation
//Methods hide the implementation logic from the 
// user and only expose input/output.
class MathOperations {
    // Method-level encapsulation: logic is hidden inside the method
    public int calculateSquare(int num) {
        return num * num;  // caller doesn't see how it's calculated
    }
}
//main function in yoyo4

//. Access Control Encapsulation
// Encapsulation done using access modifiers (private, public, protected, default) to control visibility.

// Modifier	Accessible Within Class	Same Package	Subclass (Other Package)	Other Packages
// private	✅	❌	❌	❌
// default	✅	✅	❌	❌
// protected	✅	✅	✅	❌
// public	✅	✅	✅	✅
//Use case: Control how much of your class is exposed to the outside world.

