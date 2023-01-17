// Online C compiler to run C program online
#include <stdio.h>
#include<stdlib.h>

struct node {
    struct node* next;
    struct node* prev;
    int data;
};
struct node* head = NULL;

void insertAtStart(int data){
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = NULL;
    if(head != NULL){
        new_node->next = head;
        head = new_node;
    }else{
        head = new_node;
    }
}

void insertAtLast(int data){
    struct node* ptr = head;
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = NULL;
    while(ptr->next != NULL){
        ptr= ptr->next;
    }
    new_node->prev = ptr;
    ptr->next = new_node;
}

void insertAtPosition(int pos, int data){
    struct node* ptr = head;
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->next = NULL;
    new_node->prev = NULL;
    new_node->data = data;
    int i = 1;
    while(i<pos-1){
        ptr=ptr->next;
        i++;
    }

    new_node->prev=ptr;
    new_node->next=ptr->next;

    // ptr->next->prev=new_node;
    ptr->next=new_node;
    new_node->next->prev=new_node;

    // new_node->next = ptr;
    // new_node->prev = ptr->prev;
    // ptr->prev = new_node;
    // new_node->prev->next = new_node;
    
    // ptr->prev->next = new_node;
    // new_node->prev = ptr->prev;
    // ptr->prev = new_node;
    // new_node->next = ptr;
}

void display(){
    struct node* ptr1 = head;
    while(ptr1!=NULL){
        printf("%d ",ptr1->data);
        ptr1 = ptr1->next;
    }
}

int main(){
    insertAtStart(1);
    insertAtStart(2);
    insertAtStart(3);
    insertAtStart(4);
    insertAtLast(5);
    insertAtPosition(3,9);
    display();
}