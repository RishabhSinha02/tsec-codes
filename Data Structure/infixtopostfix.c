#include <stdio.h>
#include <ctype.h>

char stack[50];
int top=-1;

void push(char x){
    top++;
    stack[top]=x;
}

char pop(){
    if (top==-1)
    {
    return -1;
    }
    else
    {
        return stack[top--];
    }
    
}

int priority(char p){
    if (p=='('){
        return 0;
    }
    if (p == '+' || p =='-'){
        return 1;
    }
    if (p == '*' || p =='/'){
        return 2;
    }
    // return 0;
}

int main(){
    char eq[50];
    char *p,x;
    printf("Enter the Infix Expression: ");
    scanf("%s",eq);

    p=eq;

    while (*p!='\0')
    {
        if (isalnum(*p))
        {
            printf("%c",*p);
        }

        else if (*p=='(')
        {
            push(*p);
        }
        
        else if (*p==')')
        {
            while ((x=pop())!='(')
            {
                printf("%c",x);
            }
        }
        else    
        {
            while (priority(stack[top])>=priority(*p))
            {
                printf("%c",pop());
            }
            push(*p);   
        }
        p++;
    }
    while(top!=-1){
        printf("%c",pop());
    }
}

// (2*3+4*(5-6)) 