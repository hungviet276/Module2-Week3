import java.util.LinkedList;
import java.util.Queue;

public class DemergingUseQueue {
    public static void main(String[] args) {
        String[] people ={"male","female","male","female","female","male","female"};
        Queue<String> queueMale = new LinkedList<>();
        Queue<String> queueFemale = new LinkedList<>();
        for (int i = 0; i < people.length;i++){
            if (people[i].equals("male")){
                queueMale.add(people[i]);
            } else queueFemale.add(people[i]);
        }
        queueFemale.addAll(queueMale);
        System.out.println(queueFemale);
    }
}
