import java.util.Scanner;

public class Ham_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("------");

        // Hàm length() => lấy độ dài chuỗi
        System.out.println(s.length());
        int doDai = s.length();

        // Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
//            for(int i=0; i có 3 cách, lấy ra giá trị của các ký tự thành một mảng
        byte[] arrayBytes = s.getBytes();
        for (byte b : arrayBytes) {
            System.out.println(b);

            String s1 = "titv.vn";
            String s2 = "TITV.vn";
            String s3 = "titv.vn";

            // Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt Hoa Thường
            System.out.println("s1 equals s2: " + s1.equals(s2));
            System.out.println("s1 equals s3: " + s1.equals(s3));

            // Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
            System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
            System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

            // Nếu các bạn só sánh tài khoản và mật khẩu của người khi đăng nhâp
            // Bạn sẽ dùng equals hoặc euqalsIgnoreCase?


            // Hàm compareTo => so sánh > < =
            String sv3 = "Nguyễn Văn";
            String sv1 = "Nguyễn Văn A";
            String sv2 = "Nguyễn Văn B";
            String sv4 = "Nguyễn Văn a";

            System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
            System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
            System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

            // Hàm compareToIgnoreCase => Tường tự hàm compareTo, không biệt chữ hoa chữ thường

            // Hàm regionMatches => so sánh một đoạn
            String r1 = "TITV.vn";
            String r2 = "TV.v";
            boolean check = r1.regionMatches(2, r2, 0, 4);
            System.out.println(check);

            // 0937 456 789
            // 0937 455 765

            // Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
            String sdt = "037456789";
            System.out.println(sdt.startsWith("037"));
            System.out.println(sdt.startsWith("034"));

            // Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
            String tenFile = "I love you.JPG";
            String tenFile2 = "Hoc Java.PDF";

            if (tenFile.endsWith(".JPG")) {
                System.out.println("File 1 là hình ảnh!");
            } else if (tenFile.endsWith(".PDF")) {
                System.out.println("File 1 là file PDF!");
            }

            if (tenFile2.endsWith(".JPG")) {
                System.out.println("File 2 là hình ảnh!");
            } else if (tenFile2.endsWith(".PDF")) {
                System.out.println("File 2 là file PDF!");
            }
        }
        String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
        String s2 = "Xin chào";
        String s3 = "Xin chào 123";
        char c1 = 'ô';
        // Hàm indexOf
        System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2));
        System.out.println("Vị trí của s3 trong s1 là: " + s1.indexOf(s3));

        // Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2, 2));

        // Tìm kiếm char
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1, 20));

        // Hàm lastIndexof => tìm kiếm từ phải sang trái
        System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));

        // tenFile = "Bai tap.excel.lop12.xls';

        String s01 = "tItv";
        String s02 = ".Vn";

        String s03 = s01 + s02;
        // Hàm concat => nối chuỗi
        String s4 = s01.concat(s02);
        System.out.println("s3= "+ s03);
        System.out.println("s4= "+ s4);

        // Hàm replaceAll => thay thế
        String s5 = "Tung.vn";
        String s6 = s5.replaceAll("Tung","TITV");
        System.out.println("s6 = " + s6);

        // toLowerCase => chuyển về viết thường
        // toUpperCase => chuyển về viết hoa
        String s7 = s03.toLowerCase();
        String s8 = s03.toUpperCase();
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

        // trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
        String s9 = "  Xin chào các bạn, mình là TITV.vn    ";
        System.out.println(s9.trim());


        /// subString => cắt chuỗi con
        String s10 = "Xin chào các bạn, mình là TITV.vn";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10, 15);
        System.out.println("s11 = " + s11);
        System.out.println("s12 = " + s12);

    }
}