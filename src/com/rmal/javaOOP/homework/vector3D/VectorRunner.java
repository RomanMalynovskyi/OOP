package com.rmal.javaOOP.homework.vector3D;

/*Описать класс «Vector3d» (т.е. он должен описывать вектор в 3-х мерной,
        декартовой системе координат). В качестве свойств этого класса возьмите
        координаты вектора. Для этого класса реализовать методы сложения, скалярного и
        векторного произведения векторов. Создайте несколько объектов этого класса и
        протестируйте их.*/

public class VectorRunner {

    public static void main(String[] args) {
        Vector3D vector = new Vector3D();
        Vector3D vectorOne = new Vector3D(2, 4, 6);
        Vector3D vectorTwo = new Vector3D(5, 1, 7);

        System.out.println(vectorOne);
        System.out.println(vectorTwo);
        System.out.println("SumVector: " + vector.additionVectors(vectorOne, vectorTwo));
        System.out.println("Scalar result: " + vector.scalarOperation(vectorOne, vectorTwo));
        System.out.println("Product of vectors: " + vector.productOfVectors(vectorOne, vectorTwo));
    }
}
