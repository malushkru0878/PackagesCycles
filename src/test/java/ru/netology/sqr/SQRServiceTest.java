 package ru.netology.sqr;

 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

 public class SQRServiceTest {
    @Test
    void countSquaresUnderRange() { //подсчет кол-ва квадратов в пределах диапазона от 100 до 9801
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.countSquares(100, 9801);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countSquaresAboveBoundaryRange() { //подсчет кол-ва квадратов выше граничного диапазона
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(9802, 10000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countSquaresBelowBoundaryRange() {//подсчет кол-ва квадратов ниже граничного диапазона
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(81, 99);
        Assertions.assertEquals(expected, actual);
    }

}

