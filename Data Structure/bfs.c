#include <stdio.h>
int q[100],f=0,r=-1;

void enque(int ele){
    r = r + 1;
    q[r] = ele;
}
int deque(){
    int ele = q[f];
    f= f + 1;
    return ele;
}
void display(){
    int i = f;
    while(i<=r){
        printf("%d ",q[i]);
        i++;
    }
}
int main(){
    int i = 0, node;
    int visited[7] = {0,0,0,0,0,0,0};
    int a[7][7] = {
        {0,1,1,1,0,0,0},
        {1,0,1,0,0,0,0},
        {1,1,0,1,0,0,0},
        {0,0,1,0,1,0,0},
        {0,0,1,1,0,1,1},
        {0,0,0,0,1,0,0},
        {0,0,0,0,1,0,0}
    };
    printf("%d",i);
    visited[i]=1;
    enque(i);
    while (f<=r)
    {
        node= deque();
        for (int j = 0; j < 7; j++)
        {
            if (a[node][j]==1 && visited[j]==0)
            {
                printf("%d",j);
                visited[j]=1;
                enque(j);
            }
            
        }
        i++;
        
    }
    
}