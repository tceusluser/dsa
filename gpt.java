

class SStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public SStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to print elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if the stack is a palindrome
    public boolean isPalindrome() {
        // Temporary stack to hold elements
        Stack tempStack = new Stack(maxSize);
        // Array to hold elements for comparison
        int[] tempArray = new int[top + 1];

        // Copy elements to temporary stack and array
        for (int i = 0; i <= top; i++) {
            int value = stackArray[i];
            tempStack.push(value);
            tempArray[i] = value;
        }

        // Compare elements from stack and array
        for (int i = 0; i <= top; i++) {
            if (tempStack.pop() != tempArray[i]) {
                return false;
            }
        }
        return true;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public void sortStack() {
        SStack tempStack = new SStack(maxSize);
        while (!isEmpty()) {
            int current = pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                push(tempStack.pop());
            }
            tempStack.push(current);
        }
        // Transfer sorted elements back to the original stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }
}








public class gpt {
    public static void main(String[] args) {
        SStack stack = new SStack(7); // Create a stack of size 5

        // Push elements onto the stack
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(1);        // Attempt to push onto a full stack

        // Print the elements in the stack before sort
        stack.printStack();

        //   stack.sortStack();
        // Print the elements in the stack after sort
        stack.printStack();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Check if the stack is full
        System.out.println("Is stack full? " + stack.isFull());


        System.out.println("is stack is palidrome :   " +         stack.isPalindrome() );        
    }









}


























 /*public class Stackans {
public static void main(String[] args) {
    

    int[] element = {1,3,5,2,5,3,1} ;
    
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0 ; i < element.length ; i++ ) {
        stack.push(element[i]) ; 
    }

    printstack(stack);

}


public static void printstack(Stack<Integer> stack ) {

    System.out.println("Stack elemets are " + stack);

}
} */



