while True:
    try:
        n = int(input())
        data = []
        for _ in range(n):
            data.append(input())
        q = int(input())
        for _ in range(q):
            text = input()
            ans = 0
            max_len = 0
            for word in data:
                if word.startswith(text):
                    ans += 1
                    max_len = max(max_len, len(word))
            if ans == 0:
                print(-1)
            else:
                print(ans, max_len)
    except EOFError:
        break