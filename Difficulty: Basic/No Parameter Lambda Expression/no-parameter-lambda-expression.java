class Solution {
    public static Hello helperFunction() {
        // Your code here
        

        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
    
        
        Hello hello = ()-> System.out.println("Hello");
        return hello;
    }
}