package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //반복할 횟수
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {

            int R = sc.nextInt();

            //nextLine() 을 쓰면 error!
            //nextLine() : 엔터값을 입력받을 때까지 기준으로 한 줄
            //next()     : 공백을 기준으로 하나의 문자열
            String S = sc.next();

            for(int j = 0; j < S.length(); j++) {

                // 입력한 R 만큼 반복 출력
                for(int k = 0; k < R; k++) {

                    System.out.print(S.charAt(j));

                }

            }

            System.out.println();
        }

    }

}
