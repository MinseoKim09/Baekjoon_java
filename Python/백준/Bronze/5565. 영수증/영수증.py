total = int(input())
sum_books = 0
for _ in range(9):
    sum_books += int(input())
print(total - sum_books)