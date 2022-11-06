package test.workwithbook;

//import javax.swing.*; // Использование библиотеки Swing
//
//public class ShowMeAWindowDemo {
//    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"Первая программа на Java!"); //  showMessageDialog - статический метод класса
//        //JOptionPane
//    }
//}
// Импортируется класс JOptionPane:
import javax.swing.JOptionPane;
// Описание класса ShowMeNewWindowDemo:
class ShowMeNewWindowDemo{
    // Описание главного метода программы:
    public static void main (String [] args){
//Текстдля названия окна:
        String title="Сообщение";
//Текст сообщения:
        String text="Продолжаем изучать Java";
// Отображение диалогового окна с сообщением:
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.WARNING_MESSAGE);
    } // Завершение описания метода
} // Завершение описания класса