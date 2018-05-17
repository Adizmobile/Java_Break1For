package com.company;

public class Main {

    public static void main(String[] args) {
	// Cho 1 Mảng từ 1 đến 10 . Sử dụng 1 vòng for. Break khi i == 8
        int arrA[][] = {{1,2},{3,4},{5,6},{7,8}};
        for (int i : arrA){
            if(i == 8){
                break;
            }
            System.out.println(i);
        }
    }
}
