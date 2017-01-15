package com.rmal.javaOOP.homework.vector3D;

/*Описать класс «Vector3d» (т.е. он должен описывать вектор в 3-х мерной,
        декартовой системе координат). В качестве свойств этого класса возьмите
        координаты вектора. Для этого класса реализовать методы сложения, скалярного и
        векторного произведения векторов. Создайте несколько объектов этого класса и
        протестируйте их.*/

class Vector3D {

    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        super();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D additionVectors(Vector3D vectorOne, Vector3D vectorTwo) {
        Vector3D sumVector = new Vector3D(vectorOne.getX() + vectorTwo.getX(), vectorOne.getY() + vectorTwo.getY(),
                vectorOne.getZ() + vectorTwo.getZ());
        return sumVector;
    }

    public double scalarOperation(Vector3D vectorOne, Vector3D vectorTwo) {
        double scalarResult = (vectorOne.getX() * vectorTwo.getX()) + (vectorOne.getY() * vectorTwo.getY()) + (vectorOne.getZ() * vectorTwo.getZ());
        return scalarResult;
    }

    public Vector3D productOfVectors(Vector3D vectorOne, Vector3D vectorTwo) {
        Vector3D resultVector = new Vector3D(vectorOne.getY() * vectorTwo.getZ() - vectorOne.getZ() * vectorTwo.getY(),
                vectorOne.getZ() * vectorTwo.getX() - vectorOne.getX() * vectorTwo.getZ(),
                vectorOne.getX() * vectorTwo.getY() - vectorOne.getY() * vectorTwo.getX());
        return resultVector;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
