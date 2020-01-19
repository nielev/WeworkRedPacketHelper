package com.cyb.wework.utils;

/**
 * 实现一个固定长度的集合队列
 * create by nielev on 2019/2/1
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LimitQueue<T> implements Queue<T> {

    /**
     * 队列长度，实例化类的时候指定
     */
    private int limit;

    Queue<T> queue = new LinkedList<T>();

    public LimitQueue(int limit){
        this.limit = limit;
    }

    /**
     * 入队
     */
    @Override
    public boolean offer(T e){
        if(queue.size() >= limit){
            //如果超出长度,入队时,先出队
            queue.poll();
        }
        return queue.offer(e);
    }

    /**
     * 出队
     */
    @Override
    public T poll() {
        return queue.poll();
    }

    /**
     * 获取队列
     *
     */
    public Queue<T> getQueue(){
        return queue;
    }

    /**
     * 获取限制大小
     */
    public int getLimit(){
        return limit;
    }

    @Override
    public boolean add(T e) {
        return queue.add(e);
    }

    @Override
    public T element() {
        return queue.element();
    }

    @Override
    public T peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.size() == 0 ? true : false;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public T remove() {
        return queue.remove();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return queue.addAll(c);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean contains(Object o) {
        return queue.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return queue.containsAll(c);
    }

    @Override
    public Iterator<T> iterator() {
        return queue.iterator();
    }

    @Override
    public boolean remove(Object o) {
        return queue.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return queue.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return queue.retainAll(c);
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }
}