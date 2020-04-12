package cn.qiudev.unittest.entity;

/**
 * 简单的计算类
 *
 * @author qiuqiu
 */
public class Calculator {

    private long n = 0;

    public long add(long x) {
        n = n + x;
        return n;
    }

    public long sub(long x) {
        n = n - x;
        return n;
    }
}
