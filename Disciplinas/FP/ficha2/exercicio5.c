#include <stdio.h>

int main() {
    int numero;

    printf("Insira o 1º operando:");

    scanf("%d", &numero);
    switch (numero)
    {
    case 1:
        printf("Um");
        break;
    case 2:
        printf("Dois");
        break;
    case 3:
        printf("Três");
        break;
    
    default:
        printf("Escolheu outro numero!");
    }
}