#include <stdio.h>

void disp(int n, int x[])
{
    int i;
    for(i=0;i<n;n++){
        printf("%d ", x[i]);
        if(i%10==9)
            printf("\n");
    }
    printf("\n");
}


void main(){
    int x[10], n=10, i, j, k, wk;
    for(i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    for(j=0,k=n-2;j<=k;j++,k--){
        for(i=j;i<=k;i++){
            if(x[i]>x[i+1]){
                wk = x[i];
                x[i] = x[i+1];
                x[i+1] = wk;
            }
        }
        for(i=k;i>j;i--){
            if(x[i]<x[i-1]){
                wk = x[i];
                x[i] = x[i-1];
                x[i-1] = wk;
            }
        }
    }
    for(i=0;i<n;n++){
        printf("%d ", x[i]);
        if(i%10==9)
            printf("\n");
    }
    printf("\n");
}
