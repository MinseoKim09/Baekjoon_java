def main():
    total = sum(int(input()) for _ in range(4))
    print(total // 60)
    print(total % 60)

if __name__ == "__main__":
    main()