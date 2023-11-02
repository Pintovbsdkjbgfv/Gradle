#include <stdio.h>

/*
 * Demonstração de estruturas de controlo condicional
 */
int main() {
    char variavelUtilizador;
	
	printf("Enter a Value:");
	scanf("%c", &variavelUtilizador);
	
	if (variavelUtilizador == 'M') {
	
    for (variavelUtilizador = 'A'; variavelUtilizador <= 'Z'; ++variavelUtilizador){		
	    printf("%c", variavelUtilizador);
	}
	} else if (variavelUtilizador == 'm') {
	
    for (variavelUtilizador = 'a'; variavelUtilizador <= 'z'; ++variavelUtilizador){		
	    printf("%c", variavelUtilizador);
	}
    }
	else{
		printf("Error!");
	}
	return 0;
}
