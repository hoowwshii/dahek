#include <stdio.h>

int main(){
int angkasatu;
int angkadua;

scanf("%d %d", &angkasatu,&angkadua);

printf("masing-masing %d\n", angkasatu/angkadua);
printf("bersisa %d\n", angkasatu % angkadua);
return 0;
}