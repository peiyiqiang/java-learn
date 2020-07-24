package utils.basic;

import java.util.*;

/**
 * Created by peiyiqiang on 2020/7/18.
 * Description:
 */
public class JavaUtils {

    public void useStack() {
        Stack<Integer> stack = new Stack<>();
        int value;

        stack.empty();
        stack.push(7);
        //取栈顶元素但不移除
        value = stack.peek();
        //取栈顶元素并移除
        value = stack.pop();
    }

    public void useQueue() {
        Queue<Integer> queue = new LinkedList<>();
        int value;

        queue.isEmpty();

        //添加失败时返回false
        queue.offer(7);
        //获取队首元素但不移除，队列为空时返回null
        value = queue.peek();
        //获取队首元素并移除，队列为空时返回null
        value = queue.poll();

        //添加失败时抛异常
        queue.add(7);
        //获取队首元素但不移除，队列为空时抛异常
        value = queue.element();
        //获取队首元素并移除，队列为空时抛异常
        value = queue.remove();

        //优先队列，默认小顶堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //优先队列，大顶堆
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((o1, o2) -> o2 - o1);
        //元素操作方法同Queue

        //双端队列
        Deque<Integer> deque = new LinkedList<>();

        deque.isEmpty();

        deque.offerFirst(7);

        deque.offerLast(7);
        deque.offer(7);

        value = deque.peekFirst();
        value = deque.peek();

        value = deque.peekLast();

        value = deque.pollFirst();
        value = deque.poll();

        value = deque.pollLast();

        deque.addFirst(7);

        deque.addLast(7);
        deque.add(7);

        value = deque.getFirst();
        value = deque.element();

        value = deque.getLast();

        value = deque.removeFirst();
        value = deque.remove();

        value = deque.removeLast();
    }

    public void mapTraverse() {
        Map<Integer, String> map = new HashMap<>();

        for (int key : map.keySet()) {
            String value = map.get(key);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
        }

        Iterator<Integer> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            int key = iterator1.next();
            String value = map.get(key);
        }

        Iterator<Map.Entry<Integer, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> entry = iterator2.next();
            int key = entry.getKey();
            String value = entry.getValue();
        }
    }

    public void useCollections() {
        ArrayList<Integer> list = new ArrayList<>();

        //翻转列表
        Collections.reverse(list);
        //排序列表
        Collections.sort(list);
        //排序列表，重写比较器
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(list, (o1, o2) -> o2 - o1);
    }

    public void useArrays() {
        int[] array = new int[10];

        //排序数组
        Arrays.sort(array);
        //构造list
        List<Integer> list = Arrays.asList(1, 2, 3);
    }


    public static void main(String[] args) {
        JavaUtils javaUtils = new JavaUtils();
        //javaUtils.useCollections();
    }
}
