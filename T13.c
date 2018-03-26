#include <stdio.h>

#define MAX 50000 

int Ordena_Vetor(int fQtd_num, int fNum[]){
	int i,j,aux;

    for (i = 0; i < fQtd_num; i++)
    {
        for (j = 0; j < fQtd_num; j++)
        {
            if (fNum[i] < fNum[j])
            {
                aux = fNum[i];
                fNum[i] = fNum[j];
                fNum[j] = aux;
            }
        }
    }
 }
 
int Par_Impar(int fQtd_num, int fNum[]){
	int i;
	int vet[MAX];//vetor auxiliar

	for (i = 0; i < fQtd_num; i++){
		vet[i] = fNum[i];
			if(vet[i-1] != fNum[i]){
				
				if(fNum[i]%2==0){
					printf("\n%*.i PAR",10,fNum[i]);
				}else{
					printf("\n%*.i IMPAR",10,fNum[i]);	
				}
		}
	}
}

/*
double Calcula_Media(){
	
}
*/
int main (){
	int iQtd_num, loop1, aNum[MAX];
	
	printf("#Quantos elementos voce quer?(1 a %i>\n",MAX);
	scanf("%i",&iQtd_num);
	if (iQtd_num < 1 || iQtd_num > MAX)
	{
		printf("ERRO.\n");
		printf("# Valor %i inválido",iQtd_num);
		return;
	}

	printf("# Digite %i numeros inteiros positivos ou negativos:\n",iQtd_num);
	for(loop1=0;loop1<iQtd_num;loop1++)
	{
		scanf("%i",&aNum[loop1]);
	}

	Ordena_Vetor(iQtd_num, aNum);
	Par_Impar(iQtd_num,aNum);	
}
