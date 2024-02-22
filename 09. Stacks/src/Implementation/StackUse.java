package Implementation;

public class StackUse {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack(3);
        CustomStack stack = new DynamicStack(3);
        stack.push(3);
        stack.push(35);
        stack.push(45);
        stack.push(54);
        stack.push(45);
        stack.push(76);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
