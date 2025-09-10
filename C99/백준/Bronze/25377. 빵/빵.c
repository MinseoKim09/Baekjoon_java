#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    int A, B;
    int answer = -1;
    int i;
    for (i = 0; i < N; i++) {
        scanf("%d %d", &A, &B);
        if (A <= B) {
            if (answer == -1 || B < answer) {
                answer = B;
            }
        }
    }
    printf("%d\n", answer);
    return 0;
}