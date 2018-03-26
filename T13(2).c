#include <stdio.h>

#define MAX 50000 

int Ordena_Vetor(int fQtd_num, int fNum[]){//LUCAS URBAN
	int i,j,aux,aNum[fQtd_num],k;
	
	

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
        aNum[i]=fNum[j];//retorna para fora da função arrey organizado-- Elton.
    }
    
	
	
    
 }
 /*
int Par_Impar(int fQtd_num, int fNum){// comecei fazendo mas resolvi fazer na  ordem do exercicio-- Lucas
	int i,j;

	for (i = 0; i < fQtd_num; ++i)
	{
	fQtd_num[i]	
	}
	
}
*/


double Calcula_Media(int fQtd, int fNum[] ){//Elton
	int i,j,k;
	double vetDouble[fQtd];
	double soma=0.0, media;
	
	 for(i = 0; i < fQtd; i++){
		for(j = i,k=0; k < 5; k++){
			if(j>=fQtd){
		    	j=0;
			}
		    soma=soma+fNum[j];
		    media=soma/5.0;
		    vetDouble[i]=media;
		    j++;
	    }
	    printf("vetDouble[%i]=%10.2lf\n",i,media);
		soma=0.0;
		media=0.0;
	}
}

int main (){
	int iQtd_num, loop1, aNum[MAX],i,j,k;
	double vetDouble[MAX];
	double soma=0.0, media;
	
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
	
	//só para testes-- Elton
	for(i = 0; i < iQtd_num; i++){             //
	    printf("# vetor [%i]= %i\n",i,aNum[i]);//	
    }
    
    printf("\n");
    
    Calcula_Media(iQtd_num, aNum);
    
    printf("\n\nFIM");
}
