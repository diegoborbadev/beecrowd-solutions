def main(A, B):
    if A == B:
        return A, B

    length = min(len(A), len(B))

    for i in range(length):
        if A[i] != B[i]:
            if A[i] < B[i]:
                return A, B
            else:
                return B, A

    if len(A) < len(B):
        return A, B
    else:
        return B, A

A, B = main(input(), input())
print(A)
print(B)