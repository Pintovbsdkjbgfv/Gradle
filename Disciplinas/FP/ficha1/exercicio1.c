#include <stdio.h>
int	main()	{

float aluno1;
float aluno2;
float aluno3;
float media;

print("Insira	a	idade	do	aluno	1:	");
scanf("&f",	aluno1);
print("Insira	a	idade	do	aluno	2:	");
scanf("&f",	aluno2);
print("Insira	a	idade	do	aluno	3:	");
scanf("&f",	aluno3);

media = (aluno1+aluno2+aluno3) / (float) 3;
printf("A	média	de	idades	é:	%f", media);

return	0;
}