package main.java.solid.openClosed;
/*
AreaCalculator sınıfı Single Responsibility Principle (SRP) için iyi bir örnek olarak kabul edilebilir
 Çünkü SRP’ye göre bir sınıfın sadece tek bir sorumluluğu vardır.
 */
public class AreaCalculator {
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}
