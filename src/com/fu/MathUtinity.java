/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu;

/**
 *
 * @author DELL
 */
public class MathUtinity {

    // class nay chứa 1 nhóm hàm toán học, fake
    // từ class chuẩn 
    // java.util.Math cua JDK
    // vì là đồ xài chung nên sẽ là STATIC
    public static final double PI = 3.1415;

    // ham tinh n!
    // vì giao thừa tăng rất nhanh, 21! tran kiểu long
    // âm giai thừa ko tính đc 
    // hàm chỉ chấp nhận từ  0 ... 20! --> long
    // 0!= 1!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("invalid  argument. n  must be between 0 .. 20");
        }

        if (n == 0 || n == 1) 
            return 1;
        
        // song sot den doan nay sure n = 2.. 20

        long result = 1;
        for (int i = 2; i <= n; i++) 
            result *= i;
        // n != 1.2.3.4.5
        
        return result;

    }

}
