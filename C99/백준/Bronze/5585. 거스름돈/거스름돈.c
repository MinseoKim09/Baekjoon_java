#include <stdio.h>

int main() {
    int price;
    scanf("%d", &price);
    int change = 1000 - price;
    int coins[] = {500, 100, 50, 10, 5, 1};
    int count = 0;
    for (int i = 0; i < 6; i++) {
        count += change / coins[i];
        change %= coins[i];
    }
    printf("%d\n", count);
    return 0;
}