/*
 * File:   main.c
 * Author: ESTG
 */

#include <stdio.h>

/*
 * Demonstração de estruturas de controlo condicional
 */
int main() {
    int operando1;

    printf("Insira o 1º operando:");
    scanf("%d", &operando1);

    if (num % 2 == 0) {
        printf("Par");
    } else {
        printf("Impar");
    }

    return 0;
}

