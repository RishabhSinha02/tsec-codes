#include <stdio.h>

int add(int a,int b){
    int c = a+b;
    return c;
}

void mul(int a, int b){
    int c = a*b;
    printf("%d\n",c);
}

int main(){
    printf("%d\n",10+ add(10,20));
    return 0;
}