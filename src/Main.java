public class Main {

    public static void main(String[] args) {

        Queue test = new Queue();

        System.out.println(test.isEmpty());
        test.add(1);
        test.add(2);
        test.add(3);
        test.remove();
        System.out.println(test.peek());
        System.out.println(test.size());

    }

}