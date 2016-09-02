#include <stdio.h>
{
	int n , at[30] , bt[30] , wt[30] , tat[30] ; 

	printf("Enter the number of process MAX 30") ;
	scanf("%d",&n) ; 

	printf("ENTER ARRIVAL TIME AND BURST TIME ") ;
	for (int i = 0; i < n; i++)
	{
		printf("p[%d]\t", i+1 );
		scanf("%d \t %d", &at[i] &bt[i]) ;
		printf("\n");
	}
	for (int i = 0; i < n; i++)
	{
		printf("p[%d]\t", i+1 );
		
		printf("%d %d", &at[i],&bt[i]);
	}


}