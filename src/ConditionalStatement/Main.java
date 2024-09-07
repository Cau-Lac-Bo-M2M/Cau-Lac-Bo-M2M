package ConditionalStatement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // if
        int a = 10;
        if (a > 5) {
            System.out.println("a lớn hơn 5");
        }

        // if-else
        int b1 = 3;
        if (b1 > 5) {
            System.out.println("b1 lớn hơn 5");
        } else {
            System.out.println("b1 nhỏ hơn hoặc bằng 5");
        }

        // if-else if - else
        int c = 10;
        if (c > 10) {
            System.out.println("a lớn hơn 10");
        } else if (c == 10) {
            System.out.println("a bằng 10");
        } else {
            System.out.println("a nhỏ hơn 10");
        }

        // switch-case
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thứ năm");
                break;
            case Calendar.FRIDAY:
                System.out.println("Thứ sáu");
                break;
            case Calendar.SATURDAY:
                System.out.println("Thứ bảy");
                break;
            case Calendar.SUNDAY:
                System.out.println("Chủ nhật");
                break;
            default:
                System.out.println("Ngày không hợp lệ");
        }

        // ternary operator
        int b2 = 10;
        String result = (b2 > 5) ? "b2 lớn hơn 5" : "b2 nhỏ hơn hoặc bằng 5";
        System.out.println(result);
    }
}
