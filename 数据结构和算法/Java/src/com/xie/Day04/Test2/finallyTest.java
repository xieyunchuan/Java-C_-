package com.xie.Day04.Test2;

/**
 *finally 一定会被执行，如果 finally 里有 return 语句，
 * 则覆盖 try/catch 里的 return ， 比较爱考的是 finally 里没有 return 语句，这时虽然 finally 里对 return 的值进行了 修改，但 return 的值并不改变这种情况
 */

public class finallyTest {
    public static void main(String[] args) {
        System.out.println(show());
    }

    public static int show(){
        int i=0;
        try {
            throw new IndexOutOfBoundsException();
        }
        catch (Exception e){
            i=1;
            return i;
        }
        finally {
            i=5;
        }
    }
} 