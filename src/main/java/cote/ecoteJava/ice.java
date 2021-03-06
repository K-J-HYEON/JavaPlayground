package cote.ecoteJava;

import java.util.Scanner;

public class ice {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정 노드
    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        // 현재 노드를 방문 x
        if (graph[x][y] == 0) {
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            // 상 하 좌 우 위치들 모두 재귀적 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] arges) {
        Scanner sc = new Scanner(System.in);

        // N M 공백을 기준 구분해 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        // 2차원 리스트 맵 정보 입력
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 노드 음료수 채우기
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
