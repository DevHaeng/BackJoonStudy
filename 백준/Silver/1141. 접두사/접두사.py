def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split('\n')

    n = int(data[0])
    words = data[1:n+1]
    words.sort(key=len, reverse=True)

    cnt = 0

    for i in range(n):
        is_prefix = False
        for j in range(i):
            if words[j].startswith(words[i]):
                is_prefix = True
                break
        if not is_prefix:
            cnt += 1

    print(cnt)

if __name__ == "__main__":
    main()
