int main() {
    double f1, f2, ft;

    scanf("%lf %lf", &f1, &f2);

    ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100;

    printf("%.6f\n", ft);

    return 0;
}