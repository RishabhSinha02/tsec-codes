// Online C compiler to run C program online
#include <stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node* head=NULL;

void push(int data){
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data=data;
    new_node->next=NULL;
    
    if(head==NULL){
        head=new_node;
    }
    else{
        new_node->next=head;
        head=new_node;
    }
}

void pop(){
    if(head==NULL){
        printf("Stack underflow");
    }
    else if(head->next==NULL){
        struct node *ptr=head;
        head = NULL;
        free(ptr);
    }
    struct node *ptr=head;
    head = ptr->next;
    free(ptr);
}

void display(){
    if(head==NULL){
        printf("Stack underflow");
    }
    else{
        struct node *ptr=head;
        while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr=ptr->next;
        }
    }
}


int main() {
    push(10);
    push(20);
    push(30);
    // display();
    pop();
    pop();
    // pop();
    display();

    return 0;
}