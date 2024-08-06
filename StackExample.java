class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {

        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;

    }

    // check is empty

    public boolean isEmpty() {
        return top == -1;
    }

    // check is full

    public boolean isFull() {
        return top == maxSize - 1;

    }

    // method to push element to the stack
    public void push(int value) {
        if (isFull() == true) {
            System.out.println(" stack is full ");
        } else {
            stackArray[++top] = value;
            System.out.println("pushed " + value + "   to the stack");

        }

    }

    // pop an element from the stack
    public int pop() {

        if (isEmpty() == true) {
            System.out.println(" stack is empty Cannot pop");
            return -1;

        }

        else {
            return stackArray[top--];
        }

    }

    public void printStack() {
        System.out.print("Stack Elements:");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }




   // peek element 
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public void sortStack() {
        Stack tempStack = new Stack(maxSize);
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


    //check palindrome 

    public boolean isPalindrome() {
        Stack tempStack = new Stack(maxSize) ;
        int [] tempArray = new int [top +1] ; 

        for (int i = 0 ; i <= top ; i++)  {
            int value = stackArray[i] ; 

                tempArray[i] = value ; 
                tempStack.push(value);

        }

        for (int i = 0 ; i<=top ; i++){
            if (tempArray[i] != tempStack.pop()) {
                return false ; 

            }              

        }
        return true ;

    }

}

 class stackExample {

    public static void main(String[] args) {

        Stack stack1 = new Stack(7);

        stack1.push(1);
        stack1.push(3);
        stack1.push(5);
        stack1.push(2);
        stack1.push(5);
        stack1.push(3);
        stack1.push(1);

        stack1.printStack();
       //stack1.sortStack() ; 
      //  stack1.printStack();
        System.out.println(" is Palindrom " + stack1.isPalindrome() );
    }

}