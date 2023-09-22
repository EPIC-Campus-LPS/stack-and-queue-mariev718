public class Main {

    public static void main(String[] args) {

        Stack test1 = new Stack();

        test1.push(15);
        test1.push(20);
        test1.push(13);
        test1.push(39);
        test1.push(4);
        test1.push(11);

        System.out.println(test1.pop());
        System.out.println(test1.peek());
        test1.pop();
        test1.pop();
        test1.push(12);
        System.out.println("Size: " + test1.size());
        test1.pop();
        int num = test1.pop() + test1.pop();
        System.out.println(num);

    }

}