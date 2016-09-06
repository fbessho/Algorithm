#include <stdio.h>
#include <stdlib.h>

typedef struct node_s {
	int value;
	struct node_s* next;
} node;

node* BuildList() {
	int i;
	node *n, *n_prev;
	n_prev = NULL;
	for (i=5; i>=0; i--) {
		n = malloc(sizeof(node));
		n->next = n_prev;
		n->value = i;
		n_prev = n;
	}
	return n;
}

node* RemoveNode(node** head, int searchValue) {
	node** double_ptr = head;
	while ((*double_ptr)!=NULL && (*double_ptr)->value != searchValue) {
		double_ptr = &((*double_ptr)->next);
	}

	if((*double_ptr)==NULL) return NULL;
	
	// (*double_ptr)->value == searchValue
	node* deleted_node = *double_ptr;
	*double_ptr = (*double_ptr)->next;
	deleted_node->next = NULL;
	
	return deleted_node;
}

void Show(node* head) {
	if(!head) return;
	printf("%d ", head->value);
	Show(head->next);
}

int main() {
	node* head = BuildList();
	Show(head); printf("\n"); // 012345

	node* removeNode = RemoveNode(&head, 7);
	Show(head); printf("\n"); // 012345

	node* removeNode2 = RemoveNode(&head, 3);
	Show(head); printf("\n"); // 01245

	node* removeNode3 = RemoveNode(&head, 0);
	Show(head); printf("\n"); // 1245
	
	return 0;
}
