package Collections;
import java.util.LinkedList;
class L{
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("Learn Java");
        tasks.add("Learn Sql");
        tasks.add("Learn React");
        tasks.addFirst("Start Training");
        tasks.addLast("Build Project");
        System.out.println(tasks);
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After Removal:"+tasks);
    }
        

    
}
