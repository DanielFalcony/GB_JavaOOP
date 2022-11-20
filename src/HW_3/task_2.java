package HW_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task_2 implements Iterable<Integer>{
    List<Integer> nums;

    public task_2(){
        this.nums = new ArrayList<>();
    }

    public void add(int num){
        nums.add(num);
    }

    public Integer get(int i) {
        return nums.get(i);
    }


    @Override
    public Iterator<Integer> iterator() { return new MyIterator(); }

    class MyIterator implements Iterator<Integer>{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < nums.size();
        }

        @Override
        public Integer next() {
            return nums.get(index++); }
    }
}