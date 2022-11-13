package HW_3;

public class Sort {
    public static void main(String[] args) {

// Task 1

        int[] arr = {684, 451, 242, 753, 10, 55};
        task_1.printResult(task_1.mySort(arr));


// Task 2

        task_2 list = new task_2();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(7);
        for(Integer num : list){
            System.out.println(num);
        }
        System.out.println();
        System.out.println(list.get(3));
    }
}

