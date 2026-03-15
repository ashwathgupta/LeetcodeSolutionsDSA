class RecentCounter {
    public Queue<Integer> queue = new ArrayDeque<>();

    public RecentCounter() {

    }

    public int ping(int t) {

        queue.offer(t);
        while (true) {

            int head = queue.peek();
            if (t - head > 3000) {
                queue.poll();

            } else {
                break;
            }

        }

        return queue.size();

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */