#include <stdio.h>

int main(){
int ui;
scanf("%d",&ui);
int hasil;
for(int i=1; i<=ui;i++){
    if(ui % i == 1){
        hasil=ui/i;
        printf("%d", ui/i);
    }
    
}


}