#include<stdio.h>

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

void swap(int x[], int y[])
{
    int wk;
    wk=*x;
    *x=*y;
    *y=wk;
}

void quicksort(int first, int last, int x[])
{
    int i, j, pivot;
    if(first<last){
        pivot=x[(first+last)/2];
        i=first;
        j=last;
        while(i<=j){
            while(x[i]<pivot) i++;
            while(x[j]>pivot) j--;
            if(i<=j) swap(&x[i++],&x[j--]);
        }

        quicksort(first, j,x);
        quicksort(i, last, x);
    }
}



void main(){
    int x[10], n=10;
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    quicksort(0,n-1,x);
    disp(n,x);
}
