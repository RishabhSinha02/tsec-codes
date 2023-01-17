#include<stdio.h>
#include <stdlib.h>

int size,top,choose,stack[100];

void push(){
    int pushVal;
    if (top==size-1)
    {
        printf("Stack Overflow");
    }
    else{
        printf("Enter the value to Push: ");
        scanf("%d",&pushVal);
        top++;
        stack[top]=pushVal;
        printf("Pushed Element: %d",pushVal);
    }
};

void pop(){
    if (top==-1){
    printf("Stack is Empty");
    }
    else{
        printf("Popped Element: %d",stack[top]);
        top--;
    }
};
void peek(){
    if (top==-1){
    printf("Stack is Empty");
    }
    else{
    printf("Peeked Element: %d",stack[top]);
    }
};
void display(){
    if (top==-1){
    printf("Stack is Empty");
    }
    else
    {
        printf("Stack : ");
        for (int i = 0; i <= top; i++)
        {
            printf("%d ",stack[i]);
        }
    }
};

int main(){
    printf("Enter the size of Stack: ");
    scanf("%d",&size);

    top = -1;

    printf("1. Push \n2. Pop \n3. Peek \n4. Display \n5. Exit");

    while (1)
    {
        printf("\nEnter your choice: ");
        scanf("%d",&choose);
        switch (choose)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            display();
            break;
        case 5:
            exit(0);
            break;
        
        default:
            printf("\nEnd of the code.");
            printf("\nPlease Enter a valid choice.");
            break;
        }
    }
    
    

}
