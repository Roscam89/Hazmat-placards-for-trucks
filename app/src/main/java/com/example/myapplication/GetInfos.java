package com.example.myapplication;

public class GetInfos {
    int [] productWeights;
    int [] unNrs;
    double[] classNrs;
    boolean isBulk;

    public int[] getProductWeights() {
        return productWeights;
    }

    public void setProductWeights(int[] productWeights) {
        this.productWeights = productWeights;
    }

    public int[] getUnNrs() {
        return unNrs;
    }

    public void setUnNrs(int[] unNrs) {
        this.unNrs = unNrs;
    }

    public double[] getClassNrs() {
        return classNrs;
    }

    public void setClassNrs(double[] classNrs) {
        this.classNrs = classNrs;
    }

    public boolean isBulk() {
        return isBulk;
    }

    public void setBulk(boolean bulk) {
        isBulk = bulk;
    }

    public GetInfos(int[] productWeights, int[] unNrs, double[] classNrs, boolean isBulk) {
        this.productWeights = productWeights;
        this.unNrs = unNrs;
        this.classNrs = classNrs;
        this.isBulk = isBulk;
    }


}
