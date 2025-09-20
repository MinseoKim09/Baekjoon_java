#include <stdio.h>

int main() {
    int X;
    scanf("%d", &X);
    int line = 1;
    int sum = 0;
    while (sum + line < X) {
        sum += line;
        line++;
    }
    int pos = X - sum;
    int numerator, denominator;
    if (line % 2 == 0) {
        numerator = pos;
        denominator = line - pos + 1;
    } else {
        numerator = line - pos + 1;
        denominator = pos;
    }
    printf("%d/%d\n", numerator, denominator);
    return 0;
}