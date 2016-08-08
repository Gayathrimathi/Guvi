void palindrome(struct n *a){
    int top=0;
    char stack[50];
    struct n *temp=a;
    while(temp!=NULL){
        stack[top++]=temp->data;
        temp=temp->next;
    }
    temp=a;
    int flag=0;
    while(temp!=NULL){
        if(temp->data!=stack[top--]){
            flag=1;
            break;
        }
        temp=temp->next;
    }
    if(flag==1){
        printf("Not a Palindrome");
    }
    else{
        printf("Palindrome");
    }
}
