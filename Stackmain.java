public class Stackmain {
    public static void main(String[] args) throws Exception {
        Stacks s = new Stacks(5);
        s.push(34);
        s.push(45);
        s.push(2);
        s.push(9);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
