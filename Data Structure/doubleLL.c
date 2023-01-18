#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
    struct node* prev;
};
struct node* head = NULL;

void inserAtBegining(int data){
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = NULL;
    
    if(head==NULL){
        head = new_node;
    }
    else{
        new_node->next=head;
        head->prev=new_node;
        head=new_node;
    }
}

void inserAtLast(int data){
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = NULL;
    
    struct node* ptr=head;
    
    if(head==NULL){
        head = new_node;
    }
    else{
        while(ptr->next!=NULL){
            ptr=ptr->next;
        }
        new_node->prev=ptr;
        ptr->next=new_node;
    }
}

void inserAtPos(int pos,int data){
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = NULL;
    
    struct node* ptr=head;
        
    for(int i=1; i<pos-1;i++){
        ptr=ptr->next;
    }
    new_node->prev=ptr;
    new_node->next=ptr->next;
    ptr->next->prev=new_node;
    ptr->next=new_node;
}

void display(){
    struct node *ptr=head;
    if(head==NULL){
        printf("Stack is Empty");
    }
    else{
        while(ptr!=NULL){
        printf("%d ",ptr->data);
        ptr=ptr->next;
        }
    }
}
    

int main(){
    inserAtBegining(10);
    inserAtBegining(20);
    inserAtBegining(40);
    inserAtLast(0);
    inserAtPos(3,30);
    display();
    
}