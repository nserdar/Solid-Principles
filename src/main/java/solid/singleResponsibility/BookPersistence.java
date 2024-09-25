package main.java.solid.singleResponsibility;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BookPersistence {
    public void saveToFile(Book book, String fileName) throws Exception{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write(book.getBookInfo());
        }
    }
}


/*
Eğer AreaCalculator sınıfı hem alan hesaplama hem de şekilleri depolama veya çizim işlemleri
gibi farklı sorumluluklara sahip olsaydı, bu durumda SRP’yi ihlal ederdi. Örneğin:

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    // SRP'yi ihlal eden bir ek işlev
    public void drawShape(Shape shape) {
        // Şeklin çizim işlemleri
    }
}

Bu tasarımda, AreaCalculator sınıfı hem alan hesaplama hem de şekil çizme işlevlerini yapmaya
çalışıyor, bu da SRP’yi ihlal eder. İdeal durumda, bu sorumluluklar farklı sınıflara ayrılmalıdır.
 */