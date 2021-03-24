/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.utill;

import com.fu.MathUtinity;

/**
 *
 * @author DELL
 */
public class MathUtill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello GitHub!");
        System.out.println("This is  lst update from local to remote GITHUB");

        // muốn test 5 ! có đúng 120 ko 
        int n = 5;  // n!
        long expected = 120; // hy vong tra ve 120
        long actual = MathUtinity.getFactorial(n);   // thuc tế hàm chạt là bao nhiêu ??
        // check so sánh để biết đúng sai 

        System.out.println("0! expected:  " + expected);
        System.out.print(";! actual:  " + actual);
        
       // test 0! có đúng là 1 ko 
       n = 0 ;
       expected = 1; 
        actual = MathUtinity.getFactorial(n);
        System.out.println("5! expected:  " + expected);
        System.out.println("5! actual:  " + actual);

    }

    // viet code xong thì phải TEST CODE  - nguyên tắc phải theo
    // test ngay từng hàm , từng class trc khi ráp chúng với các class khác 
    // test ngay khi xong hàm, xong class đc gọi là test mức đọ 1 
    //, mức Unit Test (test mức đơn vị code)
    // làm sao để test, có nhiều cách 
    // 1. Cách 1 : sout(goi hàm ()) để in ra kết quả xử lí của hàm 
    // 2. Cách 2: JOptionPane để popup lên kết quả xử lí của hàm 
    // 3. Cách 3 : Ghi ra LOG file or ra 1 trang web 
    // 3 cách này để phải dùng mất đê xem kết quả và tự kết luận đúng sai
    // đúng : tức là hàm chạyb ra 1 giá trị - ACTUAL VALUE
    //                   và ta thấy ACTUAL VALUE khớp, bằng vs gái trị mà ta
    // mong đợi, ta tính trc = tay, gọi là EXPECTED VALUE
    // ví dụ 5! thì ta huy vong expected hàm trả vè 120
    // nhưng hàm trả về đúng 120 - actual 
    // hàm chạy đúng cho 5!
    // sai : test 6! , expected = 720, nhưng khốn nạn thay, chạy ra actual = 120
    // hàm xử lí sai 
}

// cách 4: máy oi so sánh dùm và kết luận giùm 
// cps các phép toán so sánh mà con người ko cần nhìn từng dòng kết quả trả về
// để luận đúng sai 
// máy sẽ lo cho
// nếu tất cả tình huống chạy hàm đều đúng --> hàm đúng --> màu xanh
// hầu hết tình huống chạy hàm đúng , có  1 cái sai -> hàm sai -> màu đỏ

// ĐỎ : CHỈ CẦN 1 THẰNG SAI
// XANH : TÁT CẢ PHẢI ĐỀU ĐÚNG 

// MUỐN LÀM ĐC ĐIỀU NÀY TA CẦN THƯ VIỆN PHỤ TRỢ GIÚP CHO JAVA XANH ĐỎ 
// ĐIÊÌU NÀY CŨNG CÓ BÊN C# PHP, JS, RUBY..
// JAVA: JUnit, TestNG
// C#: NUnit, xUnit, MSTest
// PHP : PHPUnit
//.....
