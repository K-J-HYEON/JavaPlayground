package cote.ecoteJava;

import java.util.Scanner;

public class gameDevelop {

    public static int n, m, x, y, direction;

    public static int[][] d = new int[50][50];

    public static int[][] arr = new int[50][50];

    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // n m 입력
        n = sc.nextInt();
        m = sc.nextInt();

        // 캐릭터 좌표 입력
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1;

        // 맵 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 시뮬레이션 시작
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            // 왼쪽으로 회전
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }

            // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
            else turn_time += 1;
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];

                // 뒤로 갈 수 있다면 이동
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                else break;
                turn_time = 0;
            }
        }
        System.out.println(cnt);



    }
}
