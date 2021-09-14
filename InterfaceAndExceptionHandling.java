import java.io.*;
import java.util.*;

interface MyInterface {
  int n = 20;
  public void pop();
  public void push();
  public void display();
}

class StackImplementation implements MyInterface {
  int arr[] = new int[n];
  int top = -1;

  public void push() {
    try {
      DataInputStream dis = new DataInputStream(System.in);
      System.out.print("Enter Element: ");
      int ele = Integer.parseInt(dis.readLine());
      arr[++top] = ele;
    }
    catch (Exception e) {
      System.out.println("e");
    }
  }

  public void pop() {
    int popper = arr[top];
    top--;
    System.out.println("Popped Element " + popper);
  }

  public void display() {
    if (top < 0) {
      System.out.println("Stack is Empty");
      return;
    }
    else {
      String str = " ";
      for (int i = 0; i <= top; i++) {
        str = str + " " + arr[i];
      }
      System.out.println("Elements are: " + str);
    }
  }
}

class InterfaceAndExceptionHanding {
  public static void main(String[] args) throws IOException {
    DataInputStream dis = new DataInputStream(System.in);
    StackImplementation stk = new StackImplementation();
    int menu = 0;

    do {
      System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
      System.out.println();
      System.out.print("Enter your Choice: ");
      menu = Integer.parseInt(dis.readLine());

      switch (menu) {
        case 1:
        stk.push();
        break;

        case 2:
        stk.pop();
        break;

        case 3:
        stk.display();
        break;

        case 4:
        System.exit(0);
      }
    } while (menu <= 4);
    System.out.println();
  }
}
