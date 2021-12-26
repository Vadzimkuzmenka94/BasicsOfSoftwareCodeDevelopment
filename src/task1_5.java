/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc*/

public class task1_5 {

    public static void main(String[] args) {

        int seconds = 36000;
        int minutes ;
        int hours;
        hours = seconds / 3600;
        minutes = (seconds%3600)/60;
        int seconds_output = (seconds% 3600)%60;


        System.out.println("The time entered in hours,minutes and seconds is:");
        System.out.println(hours  + "ч" + " " + minutes + "мин" + " " + seconds_output +"с");
    }

}