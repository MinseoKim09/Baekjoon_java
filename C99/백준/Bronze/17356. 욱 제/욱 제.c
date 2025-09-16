#include <stdio.h>
#include <math.h>

int main() {
    double A, B;
    scanf("%lf %lf", &A, &B);
    double M = (B - A) / 400.0;
    double P = 1.0 / (1.0 + pow(10.0, M));
    printf("%.15f\n", P);
    return 0;
}