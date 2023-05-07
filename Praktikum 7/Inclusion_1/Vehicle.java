/**
 * File  : Vehicle.java   03/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program SuperClass Vehicle
 */

public class Vehicle {
    void calRent (int distance, float price) {
        float fare=distance* price;
        System.out.println("vehicle price = "+fare);
    }
}
